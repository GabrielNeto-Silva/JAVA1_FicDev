/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo03;

/**
 *
 * @author ficdev
 */
public class TestePessoa {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        
        p1.setNome("Jorge"); ;
        p1.setIdade(22);
        
        System.out.println("nome: " + p1.getNome());
        System.out.println("idade: " + p1.getIdade());
    }
}
