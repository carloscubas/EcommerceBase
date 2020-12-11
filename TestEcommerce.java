import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestEcommerce
{
    @Test
    public void TesteEcommerceComVariosProdutos(){
        Carrinho car = new Carrinho();
        Pedido p1 = new Pedido(new Computador("MackBook", 60000.0), 3, new Computador("MackBook", 60000.0));
        car.addPedido(p1);
        
        Pedido p2 = new Pedido(new Computador("Dell Latitude", 3000.0), 2, new Computador("Dell Latitude", 3000.0));
        car.addPedido(p2);
        
        Pedido p3 = new Pedido(new Cerveja("Skol", 2.3), 10, new Cerveja("Skol", 2.3));
        car.addPedido(p3);
        
        Pedido p4 = new Pedido(new Cerveja("Bavaria", 1.5), 10, new Cerveja("Bavaria", 1.5));
        car.addPedido(p4);
        
        assertEquals(186038.0, car.totalCarrinho(), 0.1);
    }
    
    @Test
    public void TesteEcommerceComComputador(){
        Carrinho car = new Carrinho();
        Pedido p1 = new Pedido(new Computador("MackBook", 60000.0), 3, new Computador("MackBook", 60000.0));
        car.addPedido(p1);
        
        assertEquals(180000.0, car.totalCarrinho(), 0.1);
    }
}
