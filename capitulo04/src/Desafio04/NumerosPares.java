/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio04;

/**
 *
 * @author ficdev
 */
public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("Números pares de 1 a 10:");
        
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
