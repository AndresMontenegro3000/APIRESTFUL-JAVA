package MODELO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {

    //VARIABLES DE CONEXION A LA BD
    public  String url = "jdbc:mysql://localhost/apirestful";
    public String user = "root";
    public String pass = "1234";
    
    //CONSTRUCTOR EN BLANCO
    public Conexion() {
    }
    
    //FUNCION PARA CONECTAR A LA BASE DE DATOS 
    public Connection conectar(){
        Connection link = null;
        try
        {            
            //ENLAZANDO A LA BASE DE DATOS
            link = DriverManager.getConnection(this.url, this.user, this.pass);            
        }        
        catch (SQLException e)
        {
            JOptionPane.showConfirmDialog(null, e);            
        }        
        //DEVOLVER CADENA DE CONEXION
        return link;
    }
    
}
