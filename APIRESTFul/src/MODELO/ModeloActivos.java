
package MODELO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ModeloActivos {
    
    //VARIABLES
    private Conexion mysql=new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer TotalRegistros;
    
    //FUNCION PARA MOSTRAR ACTIVOS
    public DefaultTableModel Mostrar(String Buscar){
    
        DefaultTableModel modelo;
        
        //ARREGLO PARA LOS TITULOS
        String [] TituloTabla = {"Id", "Activo", "Descripcion", "Tipo", "Serial", "No. Inventario", "Peso", "Alto", "Ancho", "Largo", "Valor Compra", "Fecha Compra", "Fecha Baja", "Estado Actual", "Color"};
        //ARREGLO PARA ALMACENAR LOS REGISTROS
        String [] Registro = new String[15];
        
        TotalRegistros=0;
        modelo = new DefaultTableModel(null, TituloTabla);
        
        //SENTENCIA SQL PARA BUSCAR UN ACTIVO
        sSQL = "SELECT id, nombre, descripcion, tipo, serial, numeroinventario, peso, alto, ancho, largo, valorcompra, fechacompra, fechadebaja, estadoactual, color FROM ACTIVOS WHERE NOMBRE LIKE '%"+ Buscar +"%' ";
        
        //DECLARADOR DE ERRORES
        try
        {
            //OBJETOS PARA PASAR SENTENCIAS SQL
            Statement ST = cn.createStatement();
            ResultSet RS = ST.executeQuery(sSQL);
            
            //RECORRER TODOS LOS REGISTROS DE LA TABLA ACTIVOS
            while (RS.next()) {
                Registro [0] = RS.getString("id");
                Registro [1] = RS.getString("nombre");
                Registro [2] = RS.getString("descripcion");
                Registro [3] = RS.getString("tipo");
                Registro [4] = RS.getString("serial");  
                Registro [5] = RS.getString("numeroinventario"); 
                Registro [6] = RS.getString("peso"); 
                Registro [7] = RS.getString("alto"); 
                Registro [8] = RS.getString("ancho"); 
                Registro [9] = RS.getString("largo"); 
                Registro [10] = RS.getString("valorcompra"); 
                Registro [11] = RS.getString("fechacompra"); 
                Registro [12] = RS.getString("fechadebaja"); 
                Registro [13] = RS.getString("estadoactual"); 
                Registro [14] = RS.getString("color"); 
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
    
    //FUNCION PARA INSERTAR ACTIVOS (recibe toda la clase ControladorActivos)
    public boolean InsertarActivos (CONTROLADOR.ControladorActivos Datos)
    {
        sSQL = "INSERT INTO ACTIVOS (nombre, descripcion, tipo, serial, numeroinventario, peso, alto, ancho, largo, valorcompra, fechacompra, fechadebaja, estadoactual, color)" +
                "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try
        {
            //OBJETOS PARA PASAR SENTENCIAS SQL A LOS MÉTODOS
            PreparedStatement PST = cn.prepareStatement(sSQL);
            PST.setString(1, Datos.getNombre());
            PST.setString(2, Datos.getDescripcion());
            PST.setString(3, Datos.getTipo());
            PST.setString(4, Datos.getSerial());
            PST.setString(5, Datos.getNumeroInventario());
            PST.setDouble(6, Datos.getPeso());
            PST.setDouble(7, Datos.getAlto());
            PST.setDouble(8, Datos.getAncho());
            PST.setDouble(9, Datos.getLargo());
            PST.setDouble(10, Datos.getValorCompra());
            PST.setString(11, Datos.getFechaCompra());
            PST.setString(12, Datos.getFechaBaja());
            PST.setString(13, Datos.getEstadoActual());
            PST.setString(14, Datos.getColor());
            
            
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
    
    //FUNCION PARA MODIFICAR ACTIVOS (recibe toda la clase DatosActivos)
    public boolean ModificarActivos (CONTROLADOR.ControladorActivos Datos)
    {
        sSQL = "UPDATE ACTIVOS SET nombre=?, descripcion=?, tipo=?, serial=?, numeroinventario=?, peso=?, alto=?, ancho=?, largo=?, valorcompra=?, fechacompra=?, fechadebaja=?, estadoactual=?, color=?"+
               "WHERE id=?";
        try
        {
            //OBJETOS PARA PASAR SENTENCIAS SQL A LOS MÉTODOS
            PreparedStatement PST = cn.prepareStatement(sSQL);  
            PST.setString(1, Datos.getNombre());
            PST.setString(2, Datos.getDescripcion());
            PST.setString(3, Datos.getTipo());
            PST.setString(4, Datos.getSerial());
            PST.setString(5, Datos.getNumeroInventario());
            PST.setDouble(6, Datos.getPeso());
            PST.setDouble(7, Datos.getAlto());
            PST.setDouble(8, Datos.getAncho());
            PST.setDouble(9, Datos.getLargo());
            PST.setDouble(10, Datos.getValorCompra());
            PST.setString(11, Datos.getFechaCompra());
            PST.setString(12, Datos.getFechaBaja());
            PST.setString(13, Datos.getEstadoActual());
            PST.setString(14, Datos.getColor());
            PST.setInt(15, Datos.getId());
            
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
