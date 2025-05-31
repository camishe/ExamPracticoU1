package paqueteprincipal;
// --- Implementacion correcta segun instrucciones ---
// Clase principal: gestiona el menu, almacenamiento y operaciones sobre personas
import java.util.ArrayList;
import java.util.List;

public class CorrexionCodigo {
    // Lista para almacenar objetos de tipo Persona (Estudiante o Docente)
    private static List<Persona> personas = new ArrayList<>();

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("Menu");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Registrar Docente");
            System.out.println("3. Mostrar Personas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            int opc = 0;
            try {
                opc = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Debe ingresar un numero valido.");
                continue;
            }
            switch (opc) {
                case 1:
                    registrarEstudiante(sc);
                    break;
                case 2:
                    registrarDocente(sc);
                    break;
                case 3:
                    mostrarPersonas();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
        sc.close();
    }

    // Metodo para registrar un estudiante con validacion y control de excepciones
    private static void registrarEstudiante(java.util.Scanner sc) {
        try {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Cedula: ");
            int cedula = Integer.parseInt(sc.nextLine());
            System.out.print("Correo: ");
            String correo = sc.nextLine();
            System.out.print("Materias registradas: ");
            int materias = Integer.parseInt(sc.nextLine());
            System.out.print("Calificacion: ");
            double calificacion = Double.parseDouble(sc.nextLine());
            Estudiante est = new Estudiante(nombre, cedula, correo, materias, calificacion);
            personas.add(est);
            System.out.println("Estudiante registrado correctamente.\n");
        } catch (Exception e) {
            System.out.println("Error al registrar estudiante: " + e.getMessage());
        }
    }

    // Metodo para registrar un docente con validacion y control de excepciones
    private static void registrarDocente(java.util.Scanner sc) {
        try {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Cedula: ");
            int cedula = Integer.parseInt(sc.nextLine());
            System.out.print("Correo: ");
            String correo = sc.nextLine();
            System.out.print("Asignaturas impartidas: ");
            int asignaturas = Integer.parseInt(sc.nextLine());
            Docente doc = new Docente(nombre, cedula, correo, asignaturas);
            personas.add(doc);
            System.out.println("Docente registrado correctamente.\n");
        } catch (Exception e) {
            System.out.println("Error al registrar docente: " + e.getMessage());
        }
    }

    // Metodo para mostrar la informacion de todas las personas registradas
    private static void mostrarPersonas() {
        if (personas.isEmpty()) {
            System.out.println("No hay personas registradas.\n");
            return;
        }
        for (Persona p : personas) {
            p.mostrarInformacion(); // Polimorfismo: llama al metodo correspondiente
            System.out.println();
        }
    }
}
// --- Fin implementacion correcta ---
