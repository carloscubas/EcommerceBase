public class Cerveja extends Produto implements Imposto
{
    double teorAlcoolico;
    String prazoValidade;
    
    Cerveja(String n, double v){
        super(n,v);
    }
    
    public double valorImposto(){
        return super.valor * 0.08;
    }
}
