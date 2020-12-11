public class Computador extends Produto implements Imposto
{
    String hd;
    int memoria;
    String processador;
    
    Computador(String n, double v){
        super(n, v);
    }
    
    public double valorImposto(){
        return super.valor * 0.05;
    }
}
