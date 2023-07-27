package com.example.restaurantefinal.entidad;
import jakarta.persistence.Column;


public class Pedido {
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "rol", nullable = false)
    private Character rol;
    @Column(name = "sede", nullable = false)
    private String sede;
    @Column(name = "estado", nullable = false)
    private String estado;

    public Pedido() {
    }

    public Pedido(Integer id, Character rol, String sede, String estado) {
        this.id = id;
        this.rol = rol;
        this.sede = sede;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Character getRol() {
        return rol;
    }

    public void setRol(Character rol) {
        this.rol = rol;
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
}
