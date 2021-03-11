package models;

public class Hospitales {

    private int hospitlcod;
    private String nombre;
    private String direccion;
    private String telefono;
    private int numcama;

    public Hospitales() {
    }

    public Hospitales(int id, String nombre, String direccion, String telefono, int numcama) {

        this.hospitlcod = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numcama = numcama;
    }

    public int getHospitlcod() {
        return hospitlcod;
    }

    public void setHospitlcod(int hospitlcod) {
        this.hospitlcod = hospitlcod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNumcama() {
        return numcama;
    }

    public void setNumcama(int numcama) {
        this.numcama = numcama;
    }
}
