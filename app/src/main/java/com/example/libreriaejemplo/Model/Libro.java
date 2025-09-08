package com.example.libreriaejemplo.Model;

import java.io.Serializable;

public class Libro implements Serializable {

    private String titulo;
    private String autor;
    private String descripcion;
    private int portada;

    public Libro(String titulo, String autor, String descripcion, int portada) {
        this.titulo = titulo;
        this.autor = autor;
        this.descripcion = descripcion;
        this.portada = portada;
    }

    public int getPortada() {
        return portada;
    }

    public void setPortada(int portada) {
        this.portada = portada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
