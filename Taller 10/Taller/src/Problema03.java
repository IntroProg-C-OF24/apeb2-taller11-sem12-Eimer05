import java.util.Scanner;

public class Problema03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer valor: ");
        double valor1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo valor: ");
        double valor2 = scanner.nextDouble();
        System.out.println("Ingrese el tercer valor: ");
        double valor3 = scanner.nextDouble();
        System.out.println("Ingrese el cuarto valor: ");
        double valor4 = scanner.nextDouble();

        double promedio = calcularPromedio(valor1, valor2, valor3, valor4);
        System.out.println("Promedio Cualitativo: " + obtenerPromedioCualitativo(promedio));
    }

    static double calcularPromedio(double valor1, double valor2, double valor3, double valor4) {
        return (valor1 + valor2 + valor3 + valor4) / 4;
    }

    static String obtenerPromedioCualitativo(double promedio) {
        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else if (promedio > 5 && promedio <= 8) {
            return "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            return "Muy Bueno";
        } else if (promedio > 9 && promedio <= 10) {
            return "Sobresaliente";
        } else {
            return "Valor no válido";
        }
    }
}
