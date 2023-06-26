/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio05;

/**
 *
 * @author ficdev
 */
public class calculadora {

    public int soma(int a, int b){
        return a + b;
    }
    static int subtracao(int a, int b){
        return a - b;
    }

    public static void escritoSoma(){
        System.out.print("Resultado da soma é ");
    }
    public static void escritoSub(){
        System.out.print("Resultado da subtração é ");
    }
    public static void main(String [] args){
        escritoSoma();
        
        /**
         * Tive que fazer esse
         * calculadora(class) Soma(Novo Objeto) = new calculadora();
         * Pois o metodo soma é public;
         * Se fosse static não precisaria
         */
        calculadora Soma = new calculadora();
     
        /**
        * Soma é o Novo objeto;
        * soma é o método
        */
        System.out.println(Soma.soma(4, 9));

        escritoSub();
        System.out.println(subtracao(4,9));
    }
}
