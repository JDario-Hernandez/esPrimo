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
        String numberStr = JOptionPane.showInputDialog("enter a number between 0 and 2000000 to validate if it is prime");
        int number = Integer.parseInt(numberStr);
        if (number >= 2 && number < 2000000) {
            if (isPrime(number)) {
                JOptionPane.showMessageDialog(null, number + " prime.");
            } else {
                JOptionPane.showMessageDialog(null, number + " not prime.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "The number must be between 2 and 2000000");
        }
    }

    public static boolean isPrime(int number) {
        // Los números menores o iguales a 1 no son primos
        if (number <= 1) {
            return false;
        }

        // Recorremos todos los números desde 2 hasta la mitad de 'numero'
        for (int i = 2; i <= number / 2; i++) {
            // Si encontramos un divisor exacto, el número no es primo
            if (number % i == 0) {
                return false;
            }
        }

        // Si no se encontraron divisores exactos, el número es primo
        return true;
    }

}
