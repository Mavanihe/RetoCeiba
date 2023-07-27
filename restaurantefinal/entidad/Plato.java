package com.example.restaurantefinal.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "platos")


public class Plato {
    @Id
    private Long id;
    @Column(name = "rol", nullable = false)
    private Character rol;
    @Column(name = "nombreplato", nullable = false)
    private String nombreplato;
    @Column(name = "precio", nullable = false)
    private Integer precio;
    private String descripcion;
    @Column(name = "url", nullable = false)
    private String url;
    @Column(name = "categoria", nullable = false)
    private String categoria;
    @Column(name = "estado", nullable = false)
    private Boolean estado;
    @Column(name = "sede", nullable = false)
    private String sede;
    @Column(name = "tiemppopreparacion", nullable = false)
    private Double tiempopreparacion;

    public Plato() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getRol() {
        return rol;
    }

    public void setRol(Character rol) {
        this.rol = rol;
    }

    public String getNombreplato() {
        return nombreplato;
    }

    public void setNombreplato(String nombreplato) {
        this.nombreplato = nombreplato;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Boolean getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Double getTiempopreparacion() {
        return tiempopreparacion;
    }

    public void setTiempopreparacion(Double tiempopreparacion) {
        this.tiempopreparacion = tiempopreparacion;
    }

    public Plato(Long id, char rol, String nombreplato, Integer precio, String descripcion, String url, String categoria, Boolean estado, String sede, Double tiempopreparacion) {
        this.id = id;
        this.rol = rol;
        this.nombreplato = nombreplato;
        this.precio = precio;
        this.descripcion = descripcion;
        this.url = url;
        this.categoria = categoria;
        this.estado = estado;
        this.sede = sede;
        this.tiempopreparacion = tiempopreparacion;

    }


}

