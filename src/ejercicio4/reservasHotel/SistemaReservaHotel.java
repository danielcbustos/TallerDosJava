package ejercicio4.reservasHotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaReservaHotel {
    List<Hotel> hoteles;
    List<Cliente> clientes;
    List<Reserva> reservas;
    List<Integer> cancelacionReserva;
    int indice;

    public SistemaReservaHotel() {
        this.hoteles = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.cancelacionReserva = new ArrayList<>();
    }

    public List<Hotel> agregarHotel() {
        Hotel hotel1 = new Hotel("Hilton");
        hotel1.agregarHabitacion(new Habitacion(201));
        hotel1.agregarHabitacion(new Habitacion(204));
        hotel1.agregarHabitacion(new Habitacion(304));
        hotel1.agregarHabitacion(new Habitacion(503));
        hotel1.agregarHabitacion(new Habitacion(801));
        hoteles.add(hotel1);
        Hotel hotel2 = new Hotel("Decameron");
        hotel2.agregarHabitacion(new Habitacion(102));
        hotel2.agregarHabitacion(new Habitacion(202));
        hotel2.agregarHabitacion(new Habitacion(401));
        hotel2.agregarHabitacion(new Habitacion(502));
        hotel2.agregarHabitacion(new Habitacion(503));
        hotel2.agregarHabitacion(new Habitacion(702));
        hoteles.add(hotel2);
        Hotel hotel3 = new Hotel("Las Americas");
        hotel3.agregarHabitacion(new Habitacion(103));
        hotel3.agregarHabitacion(new Habitacion(401));
        hotel3.agregarHabitacion(new Habitacion(702));
        hotel3.agregarHabitacion(new Habitacion(704));
        hotel3.agregarHabitacion(new Habitacion(802));
        hoteles.add(hotel3);
        return hoteles;
    }

    public void agregarClientesConReserva(Scanner sc) {
        System.out.println("¿Cuantos clientes van a reservar habitaciones?");
        int numClientes = sc.nextInt();
        for (int i = 0; i < numClientes; i++) {
            sc = new Scanner(System.in);
            System.out.println("\nDigita el nombre del cliente" + (i + 1));
            String nombre = sc.nextLine();
            System.out.println("Digita la celula del cliente" + (i + 1));
            String cedula = sc.nextLine();
            clientes.add(new Cliente(nombre, cedula));
            listarHabitaciones();
            System.out.println("\nDigita el numero del hotel en que deseas reservar (1 a 3)");
            int numHotel = sc.nextInt();
            System.out.println("Digita el numero de la habitacion que deseas reservar");
            int numHabitacion = sc.nextInt();
            switch (numHotel) {
                case 1:
                    indice = 0;
                    break;
                case 2:
                    indice = 1;
                    break;
                case 3:
                    indice = 2;
                    break;
                default:
                    break;
            }
            realizarReservas(clientes.get(i), hoteles.get(indice), numHabitacion);
            listarHabitaciones();
            System.out.println("\n1. Continuar  \n2. Cancelar reserva");
            int cancelarReserva = sc.nextInt();
            switch (cancelarReserva) {
                case 1:
                    break;
                case 2:
                    cancelarReservas(reservas.get(i));
                    System.out.println("Se ha cancelado la reserva de la habitación "
                            + reservas.get(i).habitacion.numeroHabitacion + " en el hotel "
                            + hoteles.get(indice).nombreHotel);
                    cancelacionReserva.add(i);
                    break;

                default:
                    break;
            }

        }

    }

    public void listarHabitaciones() {
        int contHotel = 0;
        for (Hotel hotel : hoteles) {
            contHotel++;
            System.out.println("\n" + contHotel + ". Hotel " + hotel.nombreHotel + ":");
            System.out.println("Habitaciones disponibles: ");
            for (Habitacion habitacion : hotel.habitacionesHotel) {
                if (!habitacion.reservada) {
                    System.out.print("| " + habitacion.numeroHabitacion + " | ");

                }
            }
        }
        System.out.println("");
    }

    public Reserva realizarReservas(Cliente cliente, Hotel hotel, int numeroHabitacion) {

        for (int i = 0; i < hotel.habitacionesHotel.size(); i++) {
            if (hotel.habitacionesHotel.get(i).numeroHabitacion == numeroHabitacion) {
                hotel.habitacionesHotel.get(i).reservada = true;
                hotel.habitacionesHotel.get(i).cliente = cliente;
                Reserva reserva = new Reserva(cliente, hotel.habitacionesHotel.get(i), hoteles.get(indice));
                System.out.println("Tu reserva fue exitosa!");
                reservas.add(reserva);
                return reserva;
            } else {
                if (i == (hotel.habitacionesHotel.size() - 1)) {
                    System.out.println("Tu reserva fallo");
                }
            }
        }

        return null;
    }

    public void cancelarReservas(Reserva reserva) {
        reserva.habitacion.reservada = false;
        reserva.habitacion.cliente = null;

    }

    public void mostrarInformacion(String nombreEmpresa) {
        System.out.println("La empresa " + nombreEmpresa + " realizo la siguiente reserva: \n");
        for (int j : cancelacionReserva) {
            System.out.println(j);
        }

        for (int i = 0; i < reservas.size(); i++) {
            boolean bandera = false;
            for (int j = 0; j < cancelacionReserva.size(); j++) {
            }
            if (!bandera) {
                System.out.println(
                        "El cliente " + reservas.get(i).cliente.nombre + " identificado con la cedula "
                                + reservas.get(i).cliente.cedula + " ocupara la habitacion "
                                + reservas.get(i).habitacion.numeroHabitacion + " del hotel "
                                + reservas.get(i).hotel.nombreHotel);
            }
        }
    }
}
