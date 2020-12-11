import java.util.*;

public class Carrinho
{
   private List<Pedido> pedidos = new ArrayList(); 
   
   public void addPedido(Pedido pedido){
       pedidos.add(pedido);
   }
   
   public double totalCarrinho(){
       double total = 0;
       
       for(Pedido p: pedidos){
           double valorTotalPedido = p.produto.valor * p.quantidade;
           total = total + valorTotalPedido;
       }
       
       return total;
   }
   public double totalValorImposto(){
       
       double totalImposto = 0;
       
       for(Pedido p: pedidos){
           double valorTotalPedido = p.imposto.valorImposto() * p.quantidade;
           totalImposto = totalImposto + valorTotalPedido;
       }
       
       return totalImposto;
   }
   
   public List<Pedido> listaPedidos(){
       return pedidos;
   }
}
