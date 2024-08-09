package modelo;

public class Odontologo {
    private Integer numeroMatricula;
    private String nombre;
    private String apellido;
    private Integer id;

    public Odontologo(Integer numeroMatricula, String nombre, String apellido,Integer id) {
        this.numeroMatricula = numeroMatricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String toString() {
        Integer var10000 = this.id;
        return "Odontologo{id=" + var10000 + ", matricula='" + this.numeroMatricula + ", nombre='" + this.nombre + "', apellido='" + this.apellido + "}";
    }
}
