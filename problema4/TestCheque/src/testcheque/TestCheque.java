package testcheque;

class Cheque{
    private Cliente cliente;
    private Banco banco;
    private double valor;
    private double comision;

    public Cheque() {}
    
    public Cheque(Cliente cliente, Banco banco, double valor){
        this.cliente = cliente;
        this.banco = banco;
        this.valor = valor;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void calcularComision() {
        this.comision = this.valor * 0.00003;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public double getValor() {
        return valor;
    }

    public double getComision() {
        return comision;
    }

    @Override
    public String toString() {
        return "Cheque{" + "cliente=" + cliente + ", banco=" + banco + ", valor=" + valor + ", comision=" + comision + '}';
    }
     
}

class Cliente{
    private String nombre;
    private String apellido;
    private String cedula;
    
    public Cliente(){}

    public Cliente(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + '}';
    }
     
}

class Banco{
    private String nombre;
    private int numeroSucursales;
    
    public Banco(){}
    
    public Banco(String nombre, int numeroSucursales) {
        this.nombre = nombre;
        this.numeroSucursales = numeroSucursales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroSucursales(int numeroSucursales) {
        this.numeroSucursales = numeroSucursales;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroSucursales() {
        return numeroSucursales;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", numeroSucursales=" + numeroSucursales + '}';
    }
        
}

public class TestCheque {
    
    public static void main(String[] args) {
        Banco banco1 = new Banco("Banco del Austro",3);
        Cliente cliente1 = new Cliente("Antonio","Gonzales","1103895684");
        Cheque cheque1 = new Cheque(cliente1,banco1,103550.0);
        cheque1.calcularComision();
        System.out.println(cheque1);
        
    }
    
}