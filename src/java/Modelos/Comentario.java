/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author SENA
 */
public class Comentario {
    String id;
    String id_usuario;
    String descripcion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Comentario(String id, String id_usuario, String descripcion) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.descripcion = descripcion;
    }

    public Comentario() {
    }
}
