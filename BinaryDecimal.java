
package binarydecimal;

// Programa Java para convertir de decimal a binario

import java.util.Scanner;

/**
 *
 * @author
 */
public class BinaryDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.print("Introduzca un número que sea mayor que 0: ");
            n = sc.nextInt();
        } while (n <= 0);

        System.out.print("\nBinario: ");
        decBinario(n);
    }

    // Método para convertir de decimal a binario
    public static void decBinario(int n) {
        if (n <= 1) { // habia que cambiar el n= 2 a n=1 en el caso base.
            System.out.print(n);
        } else {
            decBinario(n / 2); //Cambiar decBin por decBinario porque sino coincidian los nombre en el metodo main.
            System.out.print(n % 2); //  Cambié  ^ por % para poder dividir por 2.
        }
    }
}




