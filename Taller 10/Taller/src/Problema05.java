
public class Problema05 {

    public static void main(String[] args) {
        int[][] miArreglo = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Suma de elementos: " + sumarArreglo(miArreglo));
        System.out.println("Resta de elementos: " + restarArreglo(miArreglo));
        System.out.println("Multiplicación de elementos: " + multiplicarArreglo(miArreglo));
    }

    static int sumarArreglo(int[][] arreglo) {
        int suma = 0;
        for (int[] fila : arreglo) {
            for (int valor : fila) {
                suma += valor;
            }
        }
        return suma;
    }

    static int restarArreglo(int[][] arreglo) {
        int resta = 0;
        for (int[] fila : arreglo) {
            for (int valor : fila) {
                resta -= valor;
            }
        }
        return resta;
    }

    static int multiplicarArreglo(int[][] arreglo) {
        int multiplicacion = 1;
        for (int[] fila : arreglo) {
            for (int valor : fila) {
                multiplicacion *= valor;
            }
        }
        return multiplicacion;
    }
}
