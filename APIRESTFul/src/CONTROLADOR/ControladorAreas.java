
package CONTROLADOR;


public class ControladorAreas {
    
    //VARIABLES DE LAS COLUMNAS DE LA TABLA AREAS EN LA BD
    private int Id;
    private String Area;
    private String Ciudad;
    
    //CONSTRUCTOR CON TODOS LOS CAMPOS

    public ControladorAreas(int Id, String Area, String Ciudad) {
        this.Id = Id;
        this.Area = Area;
        this.Ciudad = Ciudad;
    }
    
    //CONSTRUCTOR VACIO

    public ControladorAreas() {
    }
    
    //METODOS GET AND SET

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    
    
}
