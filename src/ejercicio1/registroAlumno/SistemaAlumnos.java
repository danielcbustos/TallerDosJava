package ejercicio1.registroAlumno;

import java.util.Scanner;

public class SistemaAlumnos {
    public Alumno[] alumnos;
    public int numAlumnos;

    public SistemaAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
        this.alumnos = new Alumno[numAlumnos];

    }

    public void agregarAlumnos(Scanner sc) {
        System.out.println("Digita la información de tus alumnos");
        for (int i = 0; i < numAlumnos; i++) {
            alumnos[i] = new Alumno("", 0);
            System.out.println("Digite el nombre del alumno" + (i + 1) + ":");
            sc.nextLine();
            alumnos[i].nombre = sc.nextLine();
            System.out.println("Digite la edad del alumno" + (i + 1) + ":");
            alumnos[i].edad = sc.nextInt();
        }
    }

    public void asignarCalificaciones(Scanner sc) {
        System.out.println("Asignación de calificaciones");
        System.out.println(
                "Debes digitar las 5 calificaciones de cada alumno \nNota: las calificaciones son entre 1 y 5");
        for (int i = 0; i < numAlumnos; i++) {
            for (int j = 0; j < alumnos[0].calificaciones.length; j++) {
                System.out.println("Digita la calificacion " + (j + 1) + " del alumno" + (i + 1) + ":");
                alumnos[i].calificaciones[j] = sc.nextFloat();
            }
        }

    }

    public void calcularPromedioCalificaciones() {
        for (int i = 0; i < numAlumnos; i++) {
            float suma = 0;
            String calificacionesString = "";
            for (int j = 0; j < alumnos[0].calificaciones.length; j++) {
                suma += alumnos[i].calificaciones[j];
                calificacionesString += alumnos[i].calificaciones[j] + " ";
            }
            float promedio = suma / alumnos[0].calificaciones.length;
            mostrarInformacionAlumno(i, calificacionesString, promedio);
        }

    }

    public void mostrarInformacionAlumno(int i, String calificacionesString, float promedio) {

        System.out.println("El alumno" + (i + 1) + " de nombre " + alumnos[i].nombre + " y " + alumnos[i].edad
                + " años de edad"
                + " tiene las siguientes calificaciones:\n" + "[ " + calificacionesString + "] " + "y su promedio es "
                + promedio);
    }

}
