package com.example.restaurantefinal.servicios;
import com.example.restaurantefinal.dto.PlatoRespuestaDTO;
import com.example.restaurantefinal.entidad.Plato;
import com.example.restaurantefinal.mapas.PlatoMapa;
import com.example.restaurantefinal.repositorios.PlatoRepositorio;
import com.example.restaurantefinal.validaciones.PlatoValidacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class PlatoServicio {
    @Autowired
    PlatoValidacion validacion;
    @Autowired
    PlatoRepositorio repositorio;
    @Autowired
    PlatoMapa mapa;

    public PlatoRespuestaDTO crearPlato(Plato datosPlatoARegistrar) throws Exception{
        try {
            if (!datosPlatoARegistrar.getRol().equals("A")){
                throw new Exception("Rol no autorizado para crear un plato");
            }
            if (validacion.validarPrecio(datosPlatoARegistrar.getPrecio())){
                throw new Exception("El precio es invalido");
            }
            if (validacion.validarSedeObligatoria(datosPlatoARegistrar.getSede())){
                throw new Exception("La sede es obligatoria");
            }
            return mapa.transformarPlato(repositorio.save(datosPlatoARegistrar));

        }catch(Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    public boolean validarSedeObligatoria(String sede){
        if (sede.length()==0 || sede==null){
            return true;
        }else {
            return false;
        }
    }

    public PlatoRespuestaDTO actualizarEstado(Plato datosNuevosEditar, Long idPlatoAEditar) throws Exception{
        try {

            if(!datosNuevosEditar.getRol().equals("A")){
                throw new Exception("Rol no autorizado para crear un plato");
            }
            Optional<Plato> platoOpcional=repositorio.findById(idPlatoAEditar);
            if (!platoOpcional.isPresent()){
                throw new Exception("El plato no existe en la BD");
            }
            Plato platoEncontrado=platoOpcional.get();
            Plato platoActualizado=repositorio.save(platoEncontrado);

            return mapa.transformarPlato(platoActualizado);

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }

    public Page<PlatoRespuestaDTO> obtenerPlatosPorCategoriaYSede(String categoria, String sede, int numeroRegistros) throws Exception{

        try {

            Pageable paginador = PageRequest.of(0, numeroRegistros);

            Page<Plato> platosPaginadosEncontrados = repositorio.findByCategoriaAndSede(categoria, sede, paginador);
            return null;

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }

}
