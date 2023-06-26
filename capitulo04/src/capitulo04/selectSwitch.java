/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo04;

import java.util.Scanner;

/**
 *
 * @author ficdev
 */
public class selectSwitch {
    public static void main (String [] args){
        int opcao;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Escolha uma opção entre 1 e 3");
        opcao = input.nextInt();
        
        switch(opcao){
            case 1:
                System.out.println("voce escolheu a opção 1");
                break;
            case 2: 
                System.out.println("voce escolheu a opção 2");
                break;
            case 3: 
                System.out.println("voce escolheu a opção 3");
                break;
            default:
                System.out.println("opção invalida");
        }
    }
    
}
