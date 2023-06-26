/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio04;

/**
 *
 * @author ficdev
 */
public class CalcularSoma {
    public static void main(String[] args) {
        int soma = 0;
        
        for (int i = 1; i <= 10; i++) {
            soma += i;
        }
        
        System.out.println("A soma dos números de 1 a 10 é: " + soma);
    }
}
