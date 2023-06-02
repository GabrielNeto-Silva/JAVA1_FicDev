/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo03.geometria;


public class Retangulo {
    
    private double base;
    private double altura;
    
    public Retangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //calculos
    public double calcularArea(){
        return this.getBase() * this.getAltura();
    }
    public double calcularPerimentro(){
        return 2 * (this.getBase() + this.getAltura());
    }

}
