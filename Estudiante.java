package paqueteprincipal;
/* 
==codigo original del examen==
public class Estudiante extends Persona {
    public int materiasregistradas;
    public double calificacion;
    public Estudiante(int materiasregistradas, double calificacion, String nombre, int cedula, String correo) {
        super(nombre, cedula, correo);
        this.materiasregistradas ;
        this.calificacion;
    }
    public void mostrarAsignaturas() {
        System.out.println("Asignaturas registradas: " );
    }
    public void vercalificaiones() {
        System.out.println("Calificación: " );
    }

}
*/
// --- Implementacion correcta segun instrucciones ---
// Clase Estudiante: hereda de Persona y agrega atributos y metodos propios
public class Estudiante extends Persona {
    // Atributo: numero de materias registradas por el estudiante
    private int materiasRegistradas;
    // Atributo: calificacion promedio del estudiante
    private double calificacion;

    // Constructor: recibe los datos y valida antes de asignar
    public Estudiante(String nombre, int cedula, String correo, int materiasRegistradas, double calificacion) {
        super(nombre, cedula, correo); // Llama al constructor de Persona
        setMateriasRegistradas(materiasRegistradas);
        setCalificacion(calificacion);
    }

    // Getter para materiasRegistradas
    public int getMateriasRegistradas() { return materiasRegistradas; }
    // Getter para calificacion
    public double getCalificacion() { return calificacion; }

    // Setter con validacion para materiasRegistradas
    public void setMateriasRegistradas(int materiasRegistradas) {
        if (materiasRegistradas < 0)
            throw new IllegalArgumentException("Las materias registradas no pueden ser negativas");
        this.materiasRegistradas = materiasRegistradas;
    }
    // Setter con validacion para calificacion
    public void setCalificacion(double calificacion) {
        if (calificacion < 0 || calificacion > 10)
            throw new IllegalArgumentException("La calificacion debe estar entre 0 y 10");
        this.calificacion = calificacion;
    }

    // Polimorfismo: sobrescribe mostrarInformacion para mostrar datos de estudiante
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Muestra datos comunes de Persona
        System.out.println("Materias registradas: " + materiasRegistradas);
        System.out.println("Calificacion: " + calificacion);
    }
}
// --- Fin implementacion correcta ---