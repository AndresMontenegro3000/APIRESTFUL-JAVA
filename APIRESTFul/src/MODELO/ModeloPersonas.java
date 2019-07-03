
package MODELO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ModeloPersonas {
    
    //VARIABLES
    private Conexion mysql=new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer TotalRegistros;
    
    //FUNCION PARA MOSTRAR PERSONAS
    public DefaultTableModel Mostrar(String Buscar){
    
        DefaultTableModel modelo;
        
        //ARREGLO PARA LOS TITULOS
        String [] TituloTabla = {"Id", "Documento", "Nombres", "Apellidos"};
        //ARREGLO PARA ALMACENAR LOS REGISTROS
        String [] Registro = new String[4];
        
        TotalRegistros=0;
        modelo = new DefaultTableModel(null, TituloTabla);
        
        //SENTENCIA SQL PARA BUSCAR UN PERSONA
        sSQL = "SELECT id, documento, nombres, apellidos FROM PERSONAS WHERE DOCUMENTO LIKE '%"+ Buscar +"%' ";
        
        //DECLARADOR DE ERRORES
        try
        {
            //OBJETOS PARA PASAR SENTENCIAS SQL
            Statement ST = cn.createStatement();
            ResultSet RS = ST.executeQuery(sSQL);
            
            //RECORRER TODOS LOS REGISTROS DE LA TABLA PERSONAS
            while (RS.next()) {
                Registro [0] = RS.getString("id");
                Registro [1] = RS.getString("documento");
                Registro [2] = RS.getString("nombres");
                Registro [3] = RS.getString("apellidos");
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
    
    //FUNCION PARA INSERTAR PERSONAS (recibe toda la clase ControladorPersonas)
    public boolean InsertarPersonas (CONTROLADOR.ControladorPersonas Datos)
    {
        sSQL = "INSERT INTO PERSONAS (documento, nombres, apellidos)" +
                "VALUES (?,?, ?)";
        try
        {
            //OBJETOS PARA PASAR SENTENCIAS SQL A LOS MÉTODOS
            PreparedStatement PST = cn.prepareStatement(sSQL);
            PST.setString(1, Datos.getDocumento());
            PST.setString(2, Datos.getNombres());
            PST.setString(3, Datos.getApellidos());
                        
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
    
    //FUNCION PARA MODIFICAR PERSONAS (recibe toda la clase DatosAreas)
    public boolean ModificarPersonas (CONTROLADOR.ControladorPersonas Datos)
    {
        sSQL = "UPDATE PERSONAS SET documento=?, nombres=?, apellidos=?"+
               "WHERE id=?";
        try
        {
            //OBJETOS PARA PASAR SENTENCIAS SQL A LOS MÉTODOS
            PreparedStatement PST = cn.prepareStatement(sSQL);  
            PST.setString(1, Datos.getDocumento());
            PST.setString(2, Datos.getNombres());
            PST.setString(3, Datos.getApellidos());
            PST.setInt(4, Datos.getId());
            
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
