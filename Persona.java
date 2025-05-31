package paqueteprincipal;

/*
== Codigo original del examen==
import java.util.ArrayList;
public class Persona {
private String nombre,correo;
private int cedula;
public Persona(String nombre, int cedula,String correo) {
    this.nombre;
    this.correo;
    this.cedula; }

    public void getNombre() {
    return nombre;  }
    public void getcedula() {
    return cedula;  }
    public void getcorreo() {
    return correo;  } 
    public void setNombre(String nombre) {
    this.nombre = nombre;  }
    public void setCorreo(String correo) {
    this.correo = correo;  } 
    public void setCedula(int cedula) {
    this.cedula = cedula;  }

    public void menu() {
        int opc;
        System.out.println("Menu");
        System.out.println("1. estudiante");
        System.out.println("2. docente");
        System.out.println("3. Salir");
        if(opc !=3){
            System.out.println("opcion no valida");
        }
    }
}*/

// --- Implementacion correcta segun instrucciones ---
// Clase base Persona: contiene atributos y metodos comunes para Estudiante y Docente
public class Persona {
    // Atributo: nombre de la persona
    protected String nombre;
    // Atributo: cedula de la persona
    protected int cedula;
    // Atributo: correo electronico de la persona
    protected String correo;

    // Constructor: recibe y valida los datos comunes
    public Persona(String nombre, int cedula, String correo) {
        setNombre(nombre);
        setCedula(cedula);
        setCorreo(correo);
    }

    // Getter para nombre
    public String getNombre() { return nombre; }
    // Getter para cedula
    public int getCedula() { return cedula; }
    // Getter para correo
    public String getCorreo() { return correo; }

    // Setter con validacion para nombre
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty())
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        this.nombre = nombre;
    }
    // Setter con validacion para cedula
    public void setCedula(int cedula) {
        if (cedula <= 0)
            throw new IllegalArgumentException("La cedula debe ser positiva");
        this.cedula = cedula;
    }
    // Setter con validacion para correo
    public void setCorreo(String correo) {
        if (correo == null || !correo.contains("@"))
            throw new IllegalArgumentException("Correo invalido");
        this.correo = correo;
    }

    // Metodo polimorfico: muestra informacion comun de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Correo: " + correo);
    }
}
// --- Fin implementacion correcta ---

