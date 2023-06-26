package capitulo02;


public class MinhaClasse {
    private final int valor1;
    private final int valor2;
    
    
    public MinhaClasse (int v1, int v2){
        this.valor1 = v1 ;
        this.valor2 = v2 ;
    }
    
    public int somar(){
        return this.valor1 + this.valor2;
    }
    
    public int subtrair(){
        return this.valor1 - this.valor2;
    }
}
