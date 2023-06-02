/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo03.desafio;

import static capitulo03.desafio.calculadora.adicionar;
import static capitulo03.desafio.calculadora.multiplicar;
import static capitulo03.desafio.calculadora.subtrair;

/**
 *
 * @author ficdev
 */
public class main_calculadora {
    
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 5;

        System.out.println("Soma: " + adicionar(num1, num2));
        System.out.println("Subtração: " + subtrair(num1, num2));
        System.out.println("Multiplicação: " + multiplicar(num1, num2));
    }
}
