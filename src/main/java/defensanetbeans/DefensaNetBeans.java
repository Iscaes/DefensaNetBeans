/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package defensanetbeans;
import java.util.Random;
/**
 *
 * @author ismac
 */
public class DefensaNetBeans {

    public static void main(String[] args) {
        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();

        // Crear un array para almacenar los números aleatorios
        int[] aleatorios = new int[10];

        // Generar 10 números aleatorios entre 0 y 100
        for (int i = 0; i < aleatorios.length; i = i + 2) {
            aleatorios[i] = random.nextInt(101); // nextInt(101) genera números entre 0 (inclusive) y 101 (exclusive)
        }

        // Mostrar los números en orden
        System.out.println("Números en orden:");
        for (int numero : aleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println();

        // Mostrar los números en sentido contrario
        System.out.println("Números en sentido contrario:");
        for (int i = aleatorios.length - 1; i >= 0; i--) {
            System.out.print(aleatorios[i] + " ");
        }
    }
}
