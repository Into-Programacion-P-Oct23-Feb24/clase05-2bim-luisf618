/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Scanner;

public class Ejemplo08 {

    public static void main(String[] args) {
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Ingrese el numero de elementos del arreglo");
        num = entrada.nextInt();
        int[] arreglo = new int[num];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el valor");
            arreglo[i] = entrada.nextInt();
        }
        System.out.printf("El resultado de la suma es: %d\n",
                misterio(arreglo,arreglo.length));
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
