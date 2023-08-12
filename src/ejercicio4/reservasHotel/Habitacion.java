package ejercicio4.reservasHotel;

public class Habitacion {
    public int numeroHabitacion;

    boolean reservada;
    Cliente cliente;

    public Habitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.reservada = false;
        this.cliente = null;
    }

}
