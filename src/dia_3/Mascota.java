package dia_3;

public class Mascota {

    private String nombre;
    private TipoMascota tipo;
    private int edad;
    Persona duenio;

    public Mascota() {
    }
//el constructor no lleva al dueño!! para no crear la relacion en el constructor, se puede pero no es buena practica

    public Mascota(String nombre, TipoMascota tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoMascota getTipo() {
        return tipo;
    }

    public void setTipo(TipoMascota tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "-" +
                nombre + " es un " +
                tipo + " y tiene " + edad +
                " años de edad";
    }
}
