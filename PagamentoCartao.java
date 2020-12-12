
public class PagamentoCartao implements Pagamento
{
    
    public double valorPagamento;
    
    public void valorPagamento(double valorTotal){
        valorPagamento = valorTotal * 0.02;
    }

    public double taxa(double valorTaxa){
       return valorPagamento * valorTaxa;
    }    
    
    public void finalizaPagamento(){
        System.out.println("Pagamento Cartao no valor de " + this.valorPagamento ); 
    }
    
}
