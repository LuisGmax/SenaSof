/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Configuaracion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author SENA
 */
public class ComentarioDAO {
      Connection con;
    PreparedStatement pstm;
    Conectar Conexcion;
    ResultSet rs;
     public boolean crear(Comentario co){
        try{
           Conexcion = new Conectar();
           Connection con = Conexcion.crearconexion();
           if (con != null){
               System.out.println("Se ha establecido una conexcion con la base de datos");
           }
           pstm = con.prepareStatement("insert into reseñas values(?,?,?)");
            System.out.println("hola");
           pstm.setString(1, co.getId());
           pstm.setString(2, co.getId_usuario());
           
           pstm.setString(3, co.getDescripcion());
          
           pstm.executeUpdate();
        }catch(Exception e){
            System.out.println("Error al insertar el usuarios" + e);
    }
        return true;
    }
}
