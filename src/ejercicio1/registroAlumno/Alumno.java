package ejercicio1.registroAlumno;

public class Alumno {
    public String nombre;
    public int edad;
    public float[] calificaciones;
    public SistemaAlumnos sistemaAlumnos;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = new float[5];
    }

}
