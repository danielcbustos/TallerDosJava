package ejercicio2.conversorMonedas;

public class ConversorMonedas {
    public int tipoMoneda;
    public double cantidadDinero;
    public int tipoMonedaFinal;

    public ConversorMonedas(int tipoMoneda, double cantidadDinero, int tipoMonedaFinal) {
        this.tipoMoneda = tipoMoneda;
        this.cantidadDinero = cantidadDinero;
        this.tipoMonedaFinal = tipoMonedaFinal;
    }

    public void pesosDolares(double cantidadDinero) {
        double conversionDinero = cantidadDinero * 0.00025;
        System.out.println(cantidadDinero + " pesos equivalen a " + conversionDinero + " dolares");
    }

    public void pesosEuros(double cantidadDinero) {
        double conversionDinero = cantidadDinero * 0.00023;
        System.out.println(cantidadDinero + " pesos colombianos equivalen a " + conversionDinero + " euros");
    }

    public void dolaresPesos(double cantidadDinero) {
        double conversionDinero = cantidadDinero / 0.00025;
        System.out.println(cantidadDinero + " dolares equivalen a " + conversionDinero + " pesos colombianos");
    }

    public void dolaresEuros(double cantidadDinero) {
        double conversionDinero = cantidadDinero * 0.91;
        System.out.println(cantidadDinero + " dolares equivalen a " + conversionDinero + " euros");
    }

    public void eurosPesos(double cantidadDinero) {
        double conversionDinero = cantidadDinero / 0.00023;
        System.out.println(cantidadDinero + " euros equivalen a " + conversionDinero + " pesos colombianos");
    }

    public void eurosDolares(double cantidadDinero) {
        double conversionDinero = cantidadDinero / 0.91;
        System.out.println(cantidadDinero + " euros equivalen a " + conversionDinero + " dolares");
    }

    public void tipoCantidadMoneda() {
        // int monedaAconvertir = sc.nextInt();
        switch (tipoMoneda) {
            case 1:
                switch (tipoMonedaFinal) {
                    case 1:
                        System.out.println("La moneda a convertir debe ser diferente a la moneda que vas a convertir");
                        break;
                    case 2:
                        pesosDolares(cantidadDinero);
                        break;
                    case 3:
                        pesosEuros(cantidadDinero);
                        break;

                    default:
                        break;
                }
                break;
            case 2:
                switch (tipoMonedaFinal) {
                    case 1:
                        dolaresPesos(cantidadDinero);
                        break;
                    case 2:
                        System.out.println("La moneda a convertir debe ser diferente a la moneda que vas a convertir");
                        break;
                    case 3:
                        dolaresEuros(cantidadDinero);
                        break;

                    default:
                        break;
                }
                break;
            case 3:
                switch (tipoMonedaFinal) {
                    case 1:
                        eurosPesos(cantidadDinero);
                        break;
                    case 2:
                        eurosDolares(cantidadDinero);
                        break;
                    case 3:
                        System.out.println("La moneda a convertir debe ser diferente a la moneda que vas a convertir");
                        break;

                    default:
                        System.out.println("Digita 1 o 2");
                        break;
                }
                break;

            default:
                System.out.println("Digita un numero entre 1 y 3");
                break;
        }
        // if (tipoMoneda.equals("pesos")) {
        // if (tipoMonedaFinal.equals("dolares")) {
        // pesosDolares(cantidadDinero);
        // } else if (tipoMonedaFinal.equals("euros")) {
        // pesosEuros(cantidadDinero);
        // } else {
        // System.out.println("Escribe un tipo de moneda a convertir valido");
        // }
        // } else if (tipoMoneda.equals("dolares")) {
        // if (tipoMonedaFinal.equals("pesos")) {
        // dolaresPesos(cantidadDinero);
        // } else if (tipoMonedaFinal.equals("euros")) {
        // dolaresEuros(cantidadDinero);
        // } else {
        // System.out.println("Escribe un tipo de moneda a convertir valido");
        // }
        // } else if (tipoMoneda.equals("euros")) {
        // if (tipoMonedaFinal.equals("pesos")) {
        // eurosPesos(cantidadDinero);
        // } else if (tipoMonedaFinal.equals("dolares")) {
        // eurosDolares(cantidadDinero);
        // } else {
        // System.out.println(tipoMonedaFinal + " no es un tipo de moneda valido");
        // }
        // } else {
        // System.out.println(tipoMoneda + " no es un tipo de moneda valido");
        // }
    }

}
