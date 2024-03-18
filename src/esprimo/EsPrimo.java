/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esprimo;

import javax.swing.JOptionPane;

/**
 *
 * @author jurgu
 */
public class EsPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numberStr = JOptionPane.showInputDialog("ingrese numero entero positivo para validar si es primo");
        int number = Integer.parseInt(numberStr);
        if (number > 0) {
            if (esPrimo(number)) {
                System.out.println(number + " es primo.");
            } else {
                System.out.println(number + " no es primo.");
            }
        }
    }

    public static boolean esPrimo(int numero) {
        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }

        // Recorremos todos los números desde 2 hasta la mitad de 'numero'
        for (int i = 2; i <= numero / 2; i++) {
            // Si encontramos un divisor exacto, el número no es primo
            if (numero % i == 0) {
                return false;
            }
        }

        // Si no se encontraron divisores exactos, el número es primo
        return true;
    }

}
