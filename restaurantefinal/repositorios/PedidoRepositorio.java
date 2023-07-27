package com.example.restaurantefinal.repositorios;
import com.example.restaurantefinal.entidad.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PedidoRepositorio extends JpaRepository<Pedido, Long>{
}
