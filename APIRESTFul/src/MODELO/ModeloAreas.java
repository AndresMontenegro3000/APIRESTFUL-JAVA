
package MODELO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ModeloAreas {
    
    //VARIABLES
    private Conexion mysql=new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer TotalRegistros;
    
    //FUNCION PARA MOSTRAR AREAS
    public DefaultTableModel Mostrar(String Buscar){
    
        DefaultTableModel modelo;
        
        //ARREGLO PARA LOS TITULOS
        String [] TituloTabla = {"Id", "Área", "Ciudad"};
        //ARREGLO PARA ALMACENAR LOS REGISTROS
        String [] Registro = new String[3];
        
        TotalRegistros=0;
        modelo = new DefaultTableModel(null, TituloTabla);
        
        //SENTENCIA SQL PARA BUSCAR UN AREA
        sSQL = "SELECT id, area, ciudad FROM AREAS WHERE AREA LIKE '%"+ Buscar +"%' ";
        
        //DECLARADOR DE ERRORES
        try
        {
            //OBJETOS PARA PASAR SENTENCIAS SQL
            Statement ST = cn.createStatement();
            ResultSet RS = ST.executeQuery(sSQL);
            
            //RECORRER TODOS LOS REGISTROS DE LA TABLA AREAS
            while (RS.next()) {
                Registro [0] = RS.getString("id");
                Registro [1] = RS.getString("area");
                Registro [2] = RS.getString("ciudad");
                TotalRegistros = TotalRegistros + 1;
                //AGREGAR VARIABLE MODELO A MANERA DE FILA EL VETOR REGISTRO                
                modelo.addRow(Registro);                
            }
            //RETORNAR
                return modelo;
        }
        catch (SQLException e)
        {
            JOptionPane.showConfirmDialog(null, e);
            //SI HAY ERRORES RETORNO UN VALOR NULO
            return null;            
        }
    }
    
    //FUNCION PARA INSERTAR AREAS (recibe toda la clase ControladorAreas)
    public boolean InsertarAreas (CONTROLADOR.ControladorAreas Datos)
    {
        sSQL = "INSERT INTO AREAS (area, ciudad)" +
                "VALUES (?,?)";
        try
        {
            //OBJETOS PARA PASAR SENTENCIAS SQL A LOS MÉTODOS
            PreparedStatement PST = cn.prepareStatement(sSQL);
            PST.setString(1, Datos.getArea());
            PST.setString(2, Datos.getCiudad());
                        
            //VERIFICAR SI SE HAN INSERTADO REGISTROS
            int n = PST.executeUpdate();
            if (n!=0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showConfirmDialog(null, e);
            //SI EXISTE UN ERROR RETORNO FALSE
            return false;
        } 
    }
    
    //FUNCION PARA MODIFICAR AREAS (recibe toda la clase DatosAreas)
    public boolean ModificarAreas (CONTROLADOR.ControladorAreas Datos)
    {
        sSQL = "UPDATE AREAS SET area=?, ciudad=?"+
               "WHERE id=?";
        try
        {
            //OBJETOS PARA PASAR SENTENCIAS SQL A LOS MÉTODOS
            PreparedStatement PST = cn.prepareStatement(sSQL);  
            PST.setString(1, Datos.getArea());
            PST.setString(2, Datos.getCiudad());
            PST.setInt(3, Datos.getId());
            
            //VERIFICAR SI SE HAN MODIFICANDO REGISTROS
            int n = PST.executeUpdate();
            if (n!=0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        } 
    }
    
}
