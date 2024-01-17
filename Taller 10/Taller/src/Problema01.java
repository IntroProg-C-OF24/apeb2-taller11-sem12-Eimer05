
public class Problema01 {

    public static void main(String[] args) {
        int[][] miArreglo = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        imprimirPares(miArreglo);
        imprimirImpares(miArreglo);
        calcularPromedio(miArreglo);
    }

    static void imprimirPares(int[][] arreglo) {
        System.out.println("Valores Pares:");
        for (int[] fila : arreglo) {
            for (int valor : fila) {
                if (valor % 2 == 0) {
                    System.out.print(valor + " ");
                }
            }
        }
        System.out.println();
    }

    static void imprimirImpares(int[][] arreglo) {
        System.out.println("Valores Impares:");
        for (int[] fila : arreglo) {
            for (int valor : fila) {
                if (valor % 2 != 0) {
                    System.out.print(valor + " ");
                }
            }
        }
        System.out.println();
    }

    static void calcularPromedio(int[][] arreglo) {
        double suma = 0;
        int cantidadElementos = 0;

        for (int[] fila : arreglo) {
            for (int valor : fila) {
                suma += valor;
                cantidadElementos++;
            }
        }

        if (cantidadElementos > 0) {
            double promedio = suma / cantidadElementos;
            System.out.println("Promedio de todos los valores: " + promedio);
        } else {
            System.out.println("El arreglo está vacío.");
        }
    }
}
