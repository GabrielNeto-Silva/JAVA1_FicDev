/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo05.Herança;

/**
 *
 * @author ficdev
 */
public class Gerente {
    private String nome;
    private String cpf;
    private double salario;
    private int senha;
    private int numeroDeFuncionarioGerenciados;
        
        /**
     * @return the senha
     */
    public int getSenha() {
        return senha;
    }


    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    
    
    
    
    
    public boolean autentica(int senha){
        if (this.getSenha() == senha){
            System.out.println("Acesso permitido");
            return true;
        }
        else {
            System.out.println("Aesso negado!");
            return false;
        }
    }
    
    //outros métodos


}
