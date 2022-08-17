package matrices;

import java.util.Scanner;

public class matriz4 {

    public static void main(String[] args) {
        Scanner cr = new Scanner(System.in);
        int estudiantes, asignaturas = 6;
        double SumatoriaNotas = 0;

        System.out.print("Ingrese cantidad de estudiantes: ");
        estudiantes = cr.nextInt();
        double[][] vector = new double[estudiantes][asignaturas];

        for (int i = 0; i < estudiantes; i++) {
            for (int j = 0; j < asignaturas; j++) {
                System.out.printf("Ingrese la calificación del alumno [ %d ] en la asignatura [ %d ]: ", (i + 1), (j + 1));
                vector[i][j] = cr.nextDouble();
            }
        }

        System.out.println("\n|      Calificaciones     |");
        for (int i = 0; i < estudiantes; i++) {
            System.out.printf("Estudiante %d : |", (i + 1));
            for (int j = 0; j < asignaturas; j++) {
                System.out.printf(" %.1f ", vector[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
        
        System.out.println();
        for (int i = 0; i < estudiantes; i++) {
            for (int j = 0; j < asignaturas; j++) {
                SumatoriaNotas += vector[i][j];
            }
            System.out.printf("El alumno [%d] tiene un promedio de notas: %.2f \n", (i + 1), (SumatoriaNotas / asignaturas));
            SumatoriaNotas = 0;
        }
        System.out.println();
        for (int j = 0; j < asignaturas; j++) {
            for (int i = 0; i < estudiantes; i++) {
                SumatoriaNotas += vector[i][j];
            }
            System.out.printf("El promedio de notas para la asignatura [%d] es: %.2f", (j + 1), (SumatoriaNotas / estudiantes));
            SumatoriaNotas = 0;
            System.out.print("|");
            System.out.println();
        }

    }
}
