import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import ejercicio1.registroAlumno.Alumno;
import ejercicio1.registroAlumno.SistemaAlumnos;
import ejercicio3.calculadoraSimple.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        // Ejercicio1 --> Registro de Alumnos
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero del ejercicio del cual quieres ver la solucion (1 a 4)");
        int ejercicio = sc.nextInt();
        mostrarEjercicio(ejercicio);
        sc.close();

    }

    public static void mostrarEjercicio(int ejercicio) {

        switch (ejercicio) {
            case 1:
                // Ejercicio1 --->Registro de alumnos
                // ArrayList<Integer> calificaciones={1,2,3,4,5};
                // int[] calificaciones = { 1, 5, 4, 6 };
                // Alumno alumno1 = new Alumno("Daniel Bustos", 27, new int[] { 1, 5, 7, 9 });
                // System.out.println(alumno1.getNombre());
                // alumno1.setNombre("juan reyes");
                // System.out.println(alumno1.getNombre());
                // SistemaAlumnos sistemaAlumnos = new SistemaAlumnos();
                // sistemaAlumnos.agregarAlumnos(alumno1);
                // for (int i : alumno1.calificaciones) {
                // System.out.println(i);
                // }
                // System.out.println(alumno1.calificaciones[2]);
                // sistemaAlumnos.calcularPromedio(alumno1);
                System.out.println("Holis 1");

                break;
            case 2:
                // Ejercicio2 --->Conversor de monedas

                break;

            case 3:
                // Ejercicio3 --->Calculadora simple
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite un numero: ");
                float numeroUno = sc.nextFloat();
                System.out.println("Digite un segundo numero: ");
                float numeroDos = sc.nextFloat();
                Calculadora calculadora = new Calculadora(numeroUno, numeroDos);
                calculadora.mostrarResultados();
                break;

            case 4:
                // Ejercicio4 ---> Sistema de reservas de hotel
                System.out.println("Holis 4");
                break;

            default:
                System.out.println("Debes digitar un numero entre 1 y 4");
                break;
        }

    }
}
