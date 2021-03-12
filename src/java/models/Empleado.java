package models;

public class Empleado {

    private int idempleado;
    private String apellido;
    private String oficio;
    private int salario;

    public Empleado() {
    }

    public Empleado(int id, String apellido, String oficio, int salario) {
        this.idempleado = id;
        this.apellido = apellido;
        this.oficio = oficio;
        this.salario = salario;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
