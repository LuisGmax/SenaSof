/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Configuaracion.Conectar;
import static Controlador.CtrValidar.verificarcontrasena;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SENA
 */
public class UsuarioDAO {
       Connection con;
    PreparedStatement pstm;
    Conectar Conexcion;
    ResultSet rs;
    Usuario us = new Usuario();
    Usuario usua;
    
     public Usuario validar(String usu, String pass) {
    Usuario usua = new Usuario();
    try {
        Conexcion = new Conectar();
        con = Conexcion.crearconexion();
        if (con != null) {
            PreparedStatement pstm = con.prepareStatement("SELECT * FROM usuarios WHERE usuario = ?");
            pstm.setString(1, usu);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                usua.setId(rs.getString("id"));
                usua.setNombres(rs.getString("nombres"));
                usua.setUsuario(rs.getString("usuario"));
                usua.setContrasena(rs.getString("contrasena"));
                
                // Compara la contraseña aquí
                if (!verificarcontrasena(pass, usua.getContrasena())) {
                    return new Usuario(); // Devuelve un usuario vacío si la contraseña no es correcta
                }
            }
        }
    } catch (Exception e) {
        System.out.println("Error al conectarse con la base de datos: " + e);
    }
    return usua; // Devuelve el usuario encontrado o vacío
}

      public boolean crear(Usuario us){
        try{
           Conexcion = new Conectar();
           Connection con = Conexcion.crearconexion();
           if (con != null){
               System.out.println("Se ha establecido una conexcion con la base de datos");
           }
           pstm = con.prepareStatement("insert into usuarios values(?,?,?,?,?)");
           pstm.setString(1, us.getId());
           pstm.setString(2, us.getNombres());
           
           pstm.setString(3, us.getUsuario());
           pstm.setString(4, us.getContrasena());
           pstm.setString(5, us.getEmail());
          
           pstm.executeUpdate();
        }catch(Exception e){
            System.out.println("Error al insertar el usuarios");
    }
        return true;
    }
       public List listar(){
        ArrayList<Usuario> list = new ArrayList<>();
        try{
            Conexcion = new Conectar();
           Connection con = Conexcion.crearconexion();
           if (con != null){
               System.out.println("Se ha establecido una conexcion con la base de datos");
           }
           pstm = con.prepareStatement("select * from usuarios");
           rs = pstm.executeQuery();
           while(rs.next()){
               Usuario usu = new Usuario();
               usu.setId(rs.getString(1));
               usu.setNombres(rs.getString(2));
              
               usu.setUsuario(rs.getString(3));
             
               list.add(usu);
           }
        }catch(Exception e){
            System.out.println("Error al listar los usuarios");
        }
        return list;
    }
    
    public List listar(String nombre){
        ArrayList<Usuario> list = new ArrayList<>();
        nombre = "%"+nombre+"%";
        try{
            Conexcion = new Conectar();
           Connection con = Conexcion.crearconexion();
           if (con != null){
               System.out.println("Se ha establecido una conexcion con la base de datos");
           }
           pstm = con.prepareStatement("select * from usuarios where nombre like ?");
           pstm.setString(1, nombre);
           rs = pstm.executeQuery();
           while(rs.next()){
               Usuario usu = new Usuario();
               usu.setId(rs.getString(1));
               usu.setNombres(rs.getString(2));
             
               usu.setUsuario(rs.getString(3));
               
               list.add(usu);
           }
        }catch(Exception e){
            System.out.println("Error al listar los usuarios por nombre");
        }
        return list;
    }
 
    
    public Usuario list(String id){
        Usuario usu = new Usuario();
        try{
            Conexcion = new Conectar();
           Connection con = Conexcion.crearconexion();
           if (con != null){
               System.out.println("Se ha establecido una conexcion con la base de datos");
           }
           pstm = con.prepareStatement("select * from usuarios where id = ?");
           pstm.setString(1, id);
           rs = pstm.executeQuery();
           while(rs.next()){
               usu.setId(rs.getString(1));
               usu.setNombres(rs.getString(2));
            
               usu.setUsuario(rs.getString(3));
               usu.setContrasena(rs.getString(4));
             
            }
        }catch(Exception e){
            System.out.println("Error al listar los usuarios por identificacion");
        }
        return usu;
    }
    
    public boolean editar(Usuario us){
        try{
           Conexcion = new Conectar();
           Connection con = Conexcion.crearconexion();
           if (con != null){
               System.out.println("Se ha establecido una conexcion con la base de datos");
           }
           pstm = con.prepareStatement("update usuarios set nombre = ?, usuario = ?, contrasena = ? where id = ?");
           pstm.setString(2, us.getNombres());
           
           pstm.setString(3, us.getUsuario());
           pstm.setString(4, us.getContrasena());

           pstm.setString(1, us.getId());
           pstm.executeUpdate();
        }catch(Exception e){
            System.out.println("Error al editar el usuarios "+e);
    }
        return true;
    }
    
    public boolean eliminar(String id){
        try {
            Conexcion = new Conectar();
            Connection con = Conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexcion con la base de datos");
            }
            pstm = con.prepareStatement("delete from usuarios where id = ?");
            pstm.setString(1, id);
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al eliminarr el usuarios " + e);
        }
        return true;
    }
}
