package ejercicio3.calculadoraSimple;

public class Calculadora {
    public float numeroUno;
    public float numeroDos;

    public Calculadora(float numeroUno, float numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    public float suma(float numeroUno, float numeroDos) {
        float suma = numeroUno + numeroDos;
        return suma;
    }

    public float resta(float numeroUno, float numeroDos) {
        float resta = numeroUno - numeroDos;
        return resta;
    }

    public float multiplicacion(float numeroUno, float numeroDos) {
        float multiplicacion = numeroUno * numeroDos;
        return multiplicacion;
    }

    public float division(float numeroUno, float numeroDos) {
        float division = numeroUno / numeroDos;
        return division;
    }

    public void mostrarResultados(int numEjercicio) {

        switch (numEjercicio) {
            case 1:
                System.out.println("El resultado de la suma entre sus numeros es: " + suma(numeroUno, numeroDos));
                break;
            case 2:
                System.out.println("El resultado de la resta entre sus numeros es: " + resta(numeroUno, numeroDos));
                break;
            case 3:
                System.out.println("El resultado de la multiplicacion entre sus numeros es: "
                        + multiplicacion(numeroUno, numeroDos));
                break;
            case 4:
                System.out
                        .println("El resultado de la division entre sus numeros es: " + division(numeroUno, numeroDos));
                break;
            default:
                System.out.println("Digita un numero entre 1 y 4");
                break;
        }

    }

}
