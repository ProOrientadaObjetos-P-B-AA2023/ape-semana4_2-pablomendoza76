    package automotor;

class TestAutomotor{
    private String cedulaPropietario;
    private Fabricante fabricante;
    private int anioFafricacion;
    private double valorVehiculo;
    private double valorMatricula;
    
    public TestAutomotor(){}

    public TestAutomotor(String cedulaPropietario, Fabricante fabricante, int anioFafricacion, double valorVehiculo) {
        this.cedulaPropietario = cedulaPropietario;
        this.fabricante = fabricante;
        this.anioFafricacion = anioFafricacion;
        this.valorVehiculo = valorVehiculo;
    }
    
    public void setCedulaPropietario(String cedulaPropietario){
        this.cedulaPropietario = cedulaPropietario;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public void setAnioFafricacion(int anioFafricacion) {
        this.anioFafricacion = anioFafricacion;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public void calcularValorMatricula() {
        this.valorMatricula = (this.valorVehiculo * 0.00002) * ( 2023 - this.anioFafricacion);
    }
    
    public String getCedulaPropietario(){
        return this.cedulaPropietario;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public int getAnioFafricacion() {
        return anioFafricacion;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        return "Automotor{" + "cedulaPropietario=" + cedulaPropietario + ", fabricante=" + fabricante + ", anioFafricacion=" + anioFafricacion + ", valorVehiculo=" + valorVehiculo + ", valorMatricula=" + valorMatricula + '}';
    }
    
}

class Fabricante{
    private String nombreFabricante;
    private String ciudadOrigen;
    
    public Fabricante(){}

    public Fabricante(String nombreFabricante, String ciudadOrigen) {
        this.nombreFabricante = nombreFabricante;
        this.ciudadOrigen = ciudadOrigen;
    }
    
    public void setNombreFabricante(String nombreFabricante){
        this.nombreFabricante = nombreFabricante; 
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }
    
    public String getNombreFabricante(){
        return this.nombreFabricante;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    @Override
    public String toString() {
        return "Fabricante{" + "nombreFabricante=" + nombreFabricante + ", ciudadOrigen=" + ciudadOrigen + '}';
    }
      
}

public class Automotor {
    
    public static void main(String[] args) {
        
        Fabricante fabricante1 = new Fabricante("Tesla","California");
        TestAutomotor automotor1 = new TestAutomotor("1105678910", fabricante1,2015,25000);
        automotor1.calcularValorMatricula();
        System.out.println(automotor1);   
        
    }
}
    