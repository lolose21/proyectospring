package models;

public class Enfermo {

    private int inscripcion;
    private String apellido;
    private String direccion;
    private String fecha_nac;
    private String sexo;
    private int nss;

    public Enfermo() {
    }

    public Enfermo(int inscripcion, String apellido, String dir, String fecha,
            String sexo, int nss) {

        this.inscripcion = inscripcion;
        this.apellido = apellido;
        this.direccion = dir;
        this.fecha_nac = fecha;
        this.sexo = sexo;
        this.nss = nss;
    }

    public int getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(int inscripcion) {
        this.inscripcion = inscripcion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNss() {
        return nss;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }
}
