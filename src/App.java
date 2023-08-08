import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import ejercicio1.registroAlumno.Alumno;
import ejercicio1.registroAlumno.SistemaAlumnos;
import ejercicio2.conversorMonedas.ConversorMonedas;
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
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Escribe el tipo de moneda que quieres convertir");
                System.out.println("Nota: solo se acepta pesos colombianos, euros o dolares");
                System.out.println("*escribe pesos si deseas convertir pesos colombianos");
                System.out.println("*escribe dolares si deseas convertir dolares");
                System.out.println("*escribe euros si deseas convertir euros");
                String tipoMoneda = sc2.nextLine().toLowerCase();
                System.out.println("Escribe la cantidad de dinero que deseas convertir: ");
                var cantidadDinero = sc2.nextLine();
                double cantidadDineroDouble = Double.parseDouble(cantidadDinero);
                System.out.println("Escribe el tipo de moneda al que deseas convertir");
                System.out.println("Nota: solo se acepta pesos colombianos, euros o dolares");
                System.out.println("*escribe pesos si deseas convertir pesos colombianos");
                System.out.println("*escribe dolares si deseas convertir dolares");
                System.out.println("*escribe euros si deseas convertir euros");
                String tipoMonedaFinal = sc2.nextLine().toLowerCase();
                ConversorMonedas conversor = new ConversorMonedas(tipoMoneda, cantidadDineroDouble, tipoMonedaFinal);
                conversor.tipoCantidadMoneda();
                break;

            case 3:
                // Ejercicio3 --->Calculadora simple

                Scanner sc3 = new Scanner(System.in);
                System.out.println("Digite un numero: ");
                float numeroUno = sc3.nextFloat();
                System.out.println("Digite un segundo numero: ");
                float numeroDos = sc3.nextFloat();
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
