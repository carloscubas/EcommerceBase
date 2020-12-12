public class PagamentoDebitoConta implements Pagamento
{
    
    public double valorPagamento;
    
    public void valorPagamento(double valorTotal){
        valorPagamento = valorTotal;
    }

    public double taxa(double valorTaxa){
       return valorPagamento * valorTaxa;
    }    
    
    public void finalizaPagamento(){
        System.out.println("Pagamento Debito Conta no valor de " + this.valorPagamento ); 
    }

}
