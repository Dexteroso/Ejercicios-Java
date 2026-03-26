package Burbuja;
import java.util.Arrays;

public class Burbuja {
    public int[] ordenamientoBurbuja(int[] arreglo) {

        int auxiliar;
        int[] ordenado;

        for (var i = 0; i < arreglo.length; i++) {
            for (var j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
            }
        }

        ordenado = arreglo;
        return ordenado;
    }

    public static void main(String[] args) {
        int[] numeros = { 7, 5, 50, 100, 2, 4 };
        System.out.println("Antes del método de la burbuja: " + Arrays.toString(numeros));

        var ordenador = new Burbuja();
        ordenador.ordenamientoBurbuja(numeros);
        System.out.println("Después del método de la burbuja: " + Arrays.toString(numeros));
    }
}
