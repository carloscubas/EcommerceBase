public class PagamentoBoleto implements Pagamento
{
    public double valorPagamento;
    
    public void valorPagamento(double valorTotal){
        valorPagamento = valorTotal;
    }

    public double taxa(double valorTaxa){
       return valorPagamento * valorTaxa;
    }    
    
    public void finalizaPagamento(){
        System.out.println("Pagamento no Boleto valor de " + this.valorPagamento ); 
    }

}
