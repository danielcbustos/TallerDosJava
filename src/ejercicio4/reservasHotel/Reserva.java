package ejercicio4.reservasHotel;

public class Reserva {
    public Cliente cliente;
    public Habitacion habitacion;
    public Hotel hotel;

    public Reserva(Cliente cliente, Habitacion habitacion, Hotel hotel) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.hotel = hotel;
    }
}
