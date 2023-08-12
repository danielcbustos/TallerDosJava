
import java.util.Scanner;
import ejercicio1.registroAlumno.SistemaAlumnos;
import ejercicio2.conversorMonedas.ConversorMonedas;
import ejercicio3.calculadoraSimple.Calculadora;
import ejercicio4.reservasHotel.SistemaReservaHotel;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingresa el numero del ejercicio que deseas realizar");
            System.out.println(
                    "1. Registro de Alumnos \n2. Conversor de monedas \n3. Calculadora Simple \n4. Sistema de Reservas de Hotel \n5. Salir");
            int ejercicio = sc.nextInt();
            switch (ejercicio) {

                case 1:
                    // Ejercicio1 --->Registro de alumnos
                    System.out.println("Digite el numero de alumnos que desea registrar");
                    int numAlumnos = sc.nextInt();
                    SistemaAlumnos sistemaAlumnos = new SistemaAlumnos(numAlumnos);
                    sistemaAlumnos.agregarAlumnos(sc);
                    sistemaAlumnos.asignarCalificaciones(sc);
                    sistemaAlumnos.calcularPromedioCalificaciones();
                    break;
                case 2:
                    // Ejercicio2 --->Conversor de monedas
                    System.out.println("¿Que tipo de moneda deseas convertir?");
                    System.out.println("Digita un numero entre 1 y 3");
                    System.out.println("1. Pesos Colombianos \n2. Dolares \n3. Euros");
                    int tipoMoneda = sc.nextInt();
                    System.out.println("Escribe la cantidad de dinero que deseas convertir: ");
                    sc.nextLine();
                    var cantidadDinero = sc.nextLine();
                    double cantidadDineroDouble = Double.parseDouble(cantidadDinero);
                    System.out.println("¿A que tipo de moneda lo deseas convertir?");
                    System.out.println("Digita un numero entre 1 y 3");
                    System.out.println("1. Pesos Colombianos \n2. Dolares \n3. Euros");
                    int tipoMonedaFinal = sc.nextInt();
                    ConversorMonedas conversor = new ConversorMonedas(tipoMoneda, cantidadDineroDouble,
                            tipoMonedaFinal);
                    conversor.tipoCantidadMoneda();
                    break;

                case 3:
                    // Ejercicio3 --->Calculadora simple
                    System.out.println("Digite un numero: ");
                    float numeroUno = sc.nextFloat();
                    System.out.println("Digite un segundo numero: ");
                    float numeroDos = sc.nextFloat();
                    Calculadora calculadora = new Calculadora(numeroUno, numeroDos);
                    System.out.println("¿Que operacion deseas realizar?");
                    System.out.println("Digita un numero entre 1 y 4");
                    System.out.println("1. Suma \n2. Resta \n3. Multiplicacion \n4. Division");
                    int numEjercicio = sc.nextInt();
                    calculadora.mostrarResultados(numEjercicio);
                    break;

                case 4:
                    // Ejercicio4 ---> Sistema de reservas de hotel

                    SistemaReservaHotel sistemaReservasHotel = new SistemaReservaHotel();
                    sistemaReservasHotel.agregarHotel();
                    System.out.println("Digita el nombre de la empresa que hara las reservaciones");
                    sc.nextLine();
                    String nombreEmpresa = sc.nextLine();
                    sistemaReservasHotel.agregarClientesConReserva(sc);
                    sistemaReservasHotel.mostrarInformacion(nombreEmpresa);
                    break;
                case 5:
                    // Salir
                    bandera = false;
                    break;

                default:
                    System.out.println("Debes digitar un numero entre 1 y 5");
                    continue;

            }
            if (bandera) {
                System.out.println("\nQuieres realizar otro ejercicio: si/no");
                sc.nextLine();
                boolean repetir = true;
                do {
                    String continuar = sc.nextLine().toLowerCase();
                    System.out.println("");
                    if (continuar.equals("si")) {
                        repetir = true;
                        continue;
                    } else if (continuar.equals("no")) {
                        bandera = false;
                        repetir = true;
                    } else {
                        System.out.println("Digita si o no por favor");
                        repetir = false;
                    }
                } while (repetir == false);

            } else {
                break;
            }
        }
        sc.close();

    }

}
