package ejercicio4.reservasHotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    String nombreHotel;
    List<Habitacion> habitacionesHotel;

    public Hotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
        this.habitacionesHotel = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitacionesHotel.add(habitacion);
    }

}
