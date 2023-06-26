/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo05.Visibilidade;

import capitulo05.Visibilidade.CarroEsportivo;
import capitulo05.Visibilidade.Carro;

public class TesteCarro {
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.modelo = "Sedan";
        carro.ano = 2021;
        
        carro.setFabricante("Ford");
        
        CarroEsportivo esportivo = new CarroEsportivo();
        esportivo.modelo = "Esportivo";
        esportivo.ano = 2023;
        esportivo.setFabricante("Ferrari");
    }
}
