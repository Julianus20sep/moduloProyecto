import java.util.Scanner;

public class Desempeño {
    public static void main(String[] args) {

        Scanner modulo = new Scanner(System.in);

        System.out.println("Bienvenido al apartado de métricas de desempeño, por favor seleccione un profesor para evaluar.");
        System.out.println("Seleccione: \n1-Primer profesor. \n2-Segundo profesor. \n3-Tercer profesor. ");
        String revision = modulo.nextLine();

        switch (revision) {
            case "1":
                System.out.println("Profesor Jaime Zapata - Metodologías Ágiles");
                evaluarProfesor(modulo);
                break;
            case "2":
                System.out.println("Profesor Jaime Zapata - Lógica de Programación");
                evaluarProfesor(modulo);
                break;
            case "3":
                System.out.println("Luis Zapata - Introducción a la programación");
                evaluarProfesor(modulo);
                break;
            default:
                System.out.println("Por favor, ingrese un número válido para continuar.");
        }
    }

    public static void evaluarProfesor(Scanner modulo) {

        System.out.println("Por favor seleccione el campo que desee evaluar:");
        System.out.println("1-Metodología y Estrategias de Enseñanza");
        System.out.println("2-Comunicación y Relación con el Estudiante");
        System.out.println("3-Evaluación y Retroalimentación");
        System.out.println("4-Actitudes y Profesionalismo");
        System.out.println("5-Valoración General");

        String campo = modulo.nextLine();


        switch (campo) {
            case "1":
                System.out.println("\n--- Metodología y Estrategias de Enseñanza ---");

                System.out.println("1. El docente presenta los contenidos de manera clara y estructurada.");
                int respuesta1 = obtenerRespuestaLikert(modulo);

                System.out.println("2. Utiliza recursos didácticos adecuados (presentaciones, videos, prácticas, etc.).");
                int respuesta2 = obtenerRespuestaLikert(modulo);

                System.out.println("3. Promueve la participación activa de los estudiantes durante la clase.");
                int respuesta3 = obtenerRespuestaLikert(modulo);
                System.out.print("Comentario opcional: ");
                modulo.nextLine();
                String comentario1 = modulo.nextLine();

                System.out.println("4. Relaciona los contenidos con aplicaciones reales o del entorno técnico.");
                int respuesta4 = obtenerRespuestaLikert(modulo);

                System.out.println("5. Estimula el pensamiento crítico y la resolución de problemas.");
                int respuesta5 = obtenerRespuestaLikert(modulo);

                System.out.println("\nResultados de evaluación:");
                System.out.println("1. Claridad en contenidos: " + traducirLikert(respuesta1));
                System.out.println("2. Recursos didácticos: " + traducirLikert(respuesta2));
                System.out.println("3. Participación activa: " + traducirLikert(respuesta3) + " - Comentario: " + comentario1);
                System.out.println("4. Aplicaciones reales: " + traducirLikert(respuesta4));
                System.out.println("5. Pensamiento crítico: " + traducirLikert(respuesta5));

                break;

            case "2":

                System.out.println("\n--- Comunicación y Relación con el Estudiante ---");
                System.out.println("1. Se comunica de manera respetuosa y profesional.");
                int respuesta6 = obtenerRespuestaLikert(modulo);

                System.out.println("2. Escucha y responde adecuadamente a las preguntas de los estudiantes.");
                int respuesta7 = obtenerRespuestaLikert(modulo);

                System.out.println("3. Está disponible para atender consultas fuera del horario de clase.");
                int respuesta8 = obtenerRespuestaLikert(modulo);
                System.out.print("Comentario opcional: ");
                modulo.nextLine();
                String comentario2 = modulo.nextLine();

                System.out.println("\nResultados de evaluación:");
                System.out.println("1. Comunicación respetuosa: " + traducirLikert(respuesta6));
                System.out.println("2. Respuesta a preguntas: " + traducirLikert(respuesta7));
                System.out.println("3. Disponibilidad: " + traducirLikert(respuesta8) + " - Comentario: " + comentario2);
                break;

            case "3":
                System.out.println("\n--- Evaluación y Retroalimentación ---");
                System.out.println("1. Informa claramente los criterios de evaluación.");
                int respuesta9 = obtenerRespuestaLikert(modulo);

                System.out.println("2. Las evaluaciones están relacionadas con los contenidos enseñados.");
                int respuesta10 = obtenerRespuestaLikert(modulo);

                System.out.println("3. Entrega retroalimentación oportuna sobre el desempeño académico.");
                int respuesta11 = obtenerRespuestaLikert(modulo);

                System.out.println("\nResultados de evaluación:");
                System.out.println("1. Criterios de evaluación: " + traducirLikert(respuesta9));
                System.out.println("2. Relación con contenidos: " + traducirLikert(respuesta10));
                System.out.println("3. Retroalimentación oportuna: " + traducirLikert(respuesta11));
                break;

            case "4":
                System.out.println("\n--- Actitudes y Profesionalismo ---");
                System.out.println("1. Muestra compromiso con el proceso educativo.");
                int respuesta12 = obtenerRespuestaLikert(modulo);

                System.out.println("2. Demuestra dominio del tema o materia que imparte.");
                int respuesta13 = obtenerRespuestaLikert(modulo);

                System.out.println("3. Es puntual y cumple con los horarios establecidos.");
                int respuesta14 = obtenerRespuestaLikert(modulo);

                System.out.println("\nResultados de evaluación:");
                System.out.println("1. Compromiso educativo: " + traducirLikert(respuesta12));
                System.out.println("2. Dominio del tema: " + traducirLikert(respuesta13));
                System.out.println("3. Puntualidad: " + traducirLikert(respuesta14));
                break;

            case "5":
                System.out.println("\n--- Valoración General ---");
                System.out.println("1. En general, estoy satisfecho/a con el desempeño del docente.");
                int respuesta15 = obtenerRespuestaLikert(modulo);
                System.out.print("Comentario opcional: ");
                modulo.nextLine();
                String comentario3 = modulo.nextLine();

                System.out.println("\nResultados de evaluación:");
                System.out.println("1. Satisfacción general: " + traducirLikert(respuesta15) + " - Comentario: " + comentario3);
                break;

            default:
                System.out.println("Opción no válida. Por favor, seleccione un número del 1 al 5.");
        }
    }


    public static int obtenerRespuestaLikert(Scanner modulo) {

        System.out.println("Evalúe con la escala Likert (1-5):");
        System.out.println("1️ Totalmente en desacuerdo");
        System.out.println("2️ En desacuerdo");
        System.out.println("3️ Ni de acuerdo ni en desacuerdo");
        System.out.println("4️ De acuerdo");
        System.out.println("5️ Totalmente de acuerdo");
        System.out.print("Su calificación: ");

        while (true) {
            int respuesta = modulo.nextInt();
            if (respuesta >= 1 && respuesta <= 5) {
                return respuesta; 
            } else {
                System.out.println("Por favor, ingrese un número entre 1 y 5.");
            }
        }
    }


    public static String traducirLikert(int valor) {

        switch (valor) {
            case 1: return "Totalmente en desacuerdo (1)";
            case 2: return "En desacuerdo (2)";
            case 3: return "Ni de acuerdo ni en desacuerdo (3)";
            case 4: return "De acuerdo (4)";
            case 5: return "Totalmente de acuerdo (5)";
            default: return "No evaluado";
        }
    }
}
