package models;

public class Conductor {

    //un conductos , tendra un nombre
    //y un coche
    private String nombre;
    private Coche coche;

    public Conductor(Coche car) {
        System.out.println("Coche" + car.getMarca());
    }

    public Conductor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
}
