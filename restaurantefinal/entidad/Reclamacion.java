package com.example.restaurantefinal.entidad;

import jakarta.persistence.*;
@Entity
@Table(name = "reclamacion")

public class Reclamacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "pedido", nullable = false)
    private Integer pedido;

    @Column(name = "sede", nullable = false)
    private String sede;

    @Column(name = "estado", nullable = false)
    private String estado;

    @Column(name = "motivo", nullable = false)
    private String motivo;

    public Reclamacion() {
    }

    public Reclamacion(Integer id, Integer pedido, String sede, String estado, String motivo) {
        this.id = id;
        this.pedido = pedido;
        this.sede = sede;
        this.estado = estado;
        this.motivo = motivo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPedido() {
        return pedido;
    }

    public void setPedido(Integer pedido) {
        this.pedido = pedido;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
