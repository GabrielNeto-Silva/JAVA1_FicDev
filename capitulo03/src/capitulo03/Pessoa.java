/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo03;

/**
 *
 * @author ficdev
 */
public class Pessoa {
    //atributos
    private String nome;
    private int idade;
    
    //métodos
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }
}
