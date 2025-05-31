package paqueteprincipal;
/* 
== Codigo original del examen==
public class Docente extends Persona {
    public int asignaImpat;
    public Docente(int asignaImpat, String nombre, int cedula, String correo) {
        super(nombre, cedula, correo);
        this.asignaImpat;
    }
    public void getAsignacion() {
        return asignaImpat;
    }
    public void setAsignacion(int asignaImpat) {
        this.asignaImpat = asignaImpat;
    }
    public void mostrarAsignaturas() {
        System.out.println("Asignaturas impartidas: " + asignaImpat);
    }
}
*/
// --- Implementacion correcta segun instrucciones ---
// Clase Docente: hereda de Persona y agrega atributo y metodos propios
public class Docente extends Persona {
    // Atributo: numero de asignaturas impartidas por el docente
    private int asignaturasImpartidas;

    // Constructor: recibe los datos y valida antes de asignar
    public Docente(String nombre, int cedula, String correo, int asignaturasImpartidas) {
        super(nombre, cedula, correo); // Llama al constructor de Persona
        setAsignaturasImpartidas(asignaturasImpartidas);
    }

    // Getter para asignaturasImpartidas
    public int getAsignaturasImpartidas() { return asignaturasImpartidas; }
    // Setter con validacion para asignaturasImpartidas
    public void setAsignaturasImpartidas(int asignaturasImpartidas) {
        if (asignaturasImpartidas < 0)
            throw new IllegalArgumentException("Las asignaturas impartidas no pueden ser negativas");
        this.asignaturasImpartidas = asignaturasImpartidas;
    }

    // Polimorfismo: sobrescribe mostrarInformacion para mostrar datos de docente
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Muestra datos comunes de Persona
        System.out.println("Asignaturas impartidas: " + asignaturasImpartidas);
    }
}
// --- Fin implementacion correcta ---