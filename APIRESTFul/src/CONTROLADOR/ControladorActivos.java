package CONTROLADOR;


public class ControladorActivos {
    
    //VARIABLES DE LAS COLUMNAS DE LA TABLA ACTIVOS EN LA BD
    private int Id;
    private String Nombre;
    private String Descripcion;
    private String Tipo;
    private String Serial;
    private String NumeroInventario;
    private double Peso;
    private double Alto;
    private double Ancho;
    private double Largo;
    private double ValorCompra;
    private String FechaCompra;
    private String FechaBaja;
    private String EstadoActual;
    private String Color;

    //CONSTRUCTOR CON TODOS LOS CAMPOS
    public ControladorActivos(int Id, String Nombre, String Descripcion, String Tipo, String Serial, String NumeroInventario, double Peso, double Alto, double Ancho, double Largo, double ValorCompra, String FechaCompra, String FechaBaja, String EstadoActual, String Color) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Tipo = Tipo;
        this.Serial = Serial;
        this.NumeroInventario = NumeroInventario;
        this.Peso = Peso;
        this.Alto = Alto;
        this.Ancho = Ancho;
        this.Largo = Largo;
        this.ValorCompra = ValorCompra;
        this.FechaCompra = FechaCompra;
        this.FechaBaja = FechaBaja;
        this.EstadoActual = EstadoActual;
        this.Color = Color;
    }
    
    
    
    
    //CONSTRUCTOR VACIO
    public ControladorActivos() {
    }
    
    //METODOS GET AND SET
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String Serial) {
        this.Serial = Serial;
    }

    public String getNumeroInventario() {
        return NumeroInventario;
    }

    public void setNumeroInventario(String NumeroInventario) {
        this.NumeroInventario = NumeroInventario;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAlto() {
        return Alto;
    }

    public void setAlto(double Alto) {
        this.Alto = Alto;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double Ancho) {
        this.Ancho = Ancho;
    }

    public double getLargo() {
        return Largo;
    }

    public void setLargo(double Largo) {
        this.Largo = Largo;
    }

    public double getValorCompra() {
        return ValorCompra;
    }

    public void setValorCompra(double ValorCompra) {
        this.ValorCompra = ValorCompra;
    }

    public String getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(String FechaCompra) {
        this.FechaCompra = FechaCompra;
    }

    public String getFechaBaja() {
        return FechaBaja;
    }

    public void setFechaBaja(String FechaBaja) {
        this.FechaBaja = FechaBaja;
    }

    public String getEstadoActual() {
        return EstadoActual;
    }

    public void setEstadoActual(String EstadoActual) {
        this.EstadoActual = EstadoActual;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
}
