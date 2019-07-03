
package CONTROLADOR;


public class ControladorPersonas {
 
    //VARIABLES DE LAS COLUMNAS DE LA TABLA PERSONAS EN LA BD
    private int Id;
    private String Documento;
    private String Nombres;
    private String Apellidos;
    
    //CONSTRUCTOR CON TODOS LOS CAMPOS
    public ControladorPersonas(int Id, String Documento, String Nombres, String Apellidos) {
        this.Id = Id;
        this.Documento = Documento;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
    }
    
    //CONSTRUCTOR VACIO
    public ControladorPersonas() {
    }
    
    //METODOS GET AND SET
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    
}
