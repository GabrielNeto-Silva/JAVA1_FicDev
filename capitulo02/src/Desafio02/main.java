/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio02;

import java.util.Scanner;
import Desafio02.Numero;

public class main {

    public static void main(String [] args){
       Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        int resto = numero % 2;
        
        if (resto == 0){
            System.out.println("esse numero é par!!");
            
        }else{
            System.out.println("Esse numero é impar!");
        }
    }
}
