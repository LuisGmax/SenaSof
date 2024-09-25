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
public class Usuario {
    String id;
    String nombres;
    String apellidos;
    String usuario;
    String contrasena;
    String email;
    String id_region;
    String direccion;

    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
        
    }
    public String getIdRegion() {
        return id_region;
    }

    public void setIdRegion(String id_region) {
        this.id_region = id_region;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    public String getEmail(){
        return email;
    }

    public String getId() {
        return id;
    }
public void setEmail(String email){
    this.email = email;
       
}
    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Usuario() {
    }

    public Usuario(String id, String nombres,String apellidos, String usuario, String contrasena, String email, String id_region,String direccion) {
        this.id = id;
        this.nombres = nombres;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.email = email;
        this.id_region  = id_region;
        this.direccion = direccion;
        this.apellidos = apellidos;
    }
    
    
}
