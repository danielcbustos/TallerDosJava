package ejercicio2.conversorMonedas;

public class ConversorMonedas {
    public String tipoMoneda;
    public double cantidadDinero;
    public String tipoMonedaFinal;

    public ConversorMonedas(String tipoMoneda, double cantidadDinero, String tipoMonedaFinal) {
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

    public void euroDolares(double cantidadDinero) {
        double conversionDinero = cantidadDinero / 0.91;
        System.out.println(cantidadDinero + " euros equivalen a " + conversionDinero + " dolares");
    }

    public void tipoCantidadMoneda() {

        if (tipoMoneda.equals("pesos")) {
            if (tipoMonedaFinal.equals("dolares")) {
                pesosDolares(cantidadDinero);
            } else if (tipoMonedaFinal.equals("euros")) {
                pesosEuros(cantidadDinero);
            } else {
                System.out.println("Escribe un tipo de moneda a convertir valido");
            }
        } else if (tipoMoneda.equals("dolares")) {
            if (tipoMonedaFinal.equals("pesos")) {
                dolaresPesos(cantidadDinero);
            } else if (tipoMonedaFinal.equals("euros")) {
                dolaresEuros(cantidadDinero);
            } else {
                System.out.println("Escribe un tipo de moneda a convertir valido");
            }
        } else if (tipoMoneda.equals("euros")) {
            if (tipoMonedaFinal.equals("pesos")) {
                eurosPesos(cantidadDinero);
            } else if (tipoMonedaFinal.equals("dolares")) {
                euroDolares(cantidadDinero);
            } else {
                System.out.println(tipoMonedaFinal + " no es un tipo de moneda valido");
            }
        } else {
            System.out.println(tipoMoneda + " no es un tipo de moneda valido");
        }
    }

}
