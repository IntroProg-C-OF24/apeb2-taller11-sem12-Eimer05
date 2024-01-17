import java.util.Scanner;

public class Problema04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la opción para calcular:");
        System.out.println("1. Calcular Valor de Planilla de Luz");
        System.out.println("2. Calcular Valor de Predio de Bien Inmueble");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                calcularValorLuz();
                break;
            case 2:
                calcularPredio();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    static void calcularValorLuz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del kilowatio:");
        double valorKilowatio = scanner.nextDouble();
        System.out.println("Ingrese el número de kilowatios del mes:");
        double kilowatios = scanner.nextDouble();

        double valorTotal = valorKilowatio * kilowatios;
        System.out.println("Cliente debe cancelar el valor de: $" + valorTotal);
    }

    static void calcularPredio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del bien inmueble:");
        double valorInmueble = scanner.nextDouble();
        double porcentajePredio = 0.02;

        double valorPredio = valorInmueble * porcentajePredio;
        System.out.println("Cliente tiene un bien inmueble valorado en $" + valorInmueble +
                " y tiene que pagar de predio $" + valorPredio);
    }
}
