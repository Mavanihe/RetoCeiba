package com.example.restaurantefinal.repositorios;
import com.example.restaurantefinal.entidad.Reclamacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ReclamacionRepositorio extends JpaRepository<Reclamacion, Long>{
}