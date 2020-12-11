import java.util.*;

public class TesteEcommerce
{
    public static void main(String[] args){
        Carrinho car = new Carrinho();
        Pedido p1 = new Pedido(new Computador("MackBook", 60000.0), 3, new Computador("MackBook", 60000.0));
        car.addPedido(p1);
        
        Pedido p2 = new Pedido(new Computador("Dell Latitude", 3000.0), 2, new Computador("Dell Latitude", 3000.0));
        car.addPedido(p2);
        
        Pedido p3 = new Pedido(new Cerveja("Skol", 2.3), 10, new Cerveja("Skol", 2.3));
        car.addPedido(p3);
        
        Pedido p4 = new Pedido(new Cerveja("Bavaria", 1.5), 10, new Cerveja("Bavaria", 1.5));
        car.addPedido(p4);
        
        System.out.println("Total Compras: " + car.totalCarrinho());
        System.out.println("Total Valor Imposto: " + car.totalValorImposto());
        
        List<Pedido> pedidos = car.listaPedidos();
        for(Pedido p: pedidos){
            System.out.println(p.produto.nome + " : " + p.produto.valor + " : " + p.quantidade);
        }
        
        
    }
}
