package classroom;

public class Persona {

    int cedula;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
    }

    public Persona(int cedula, String nombre) {
    	this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, int cedula) {
    	this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(int cedula) {
    	this(cedula, "");
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona() {
    	this.nombre = "";
    	totalPersonas++;
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
