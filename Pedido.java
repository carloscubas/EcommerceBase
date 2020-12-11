public class Pedido
{
    Produto produto;
    int quantidade;
    Imposto imposto;
    
    public Pedido(Produto p, int q, Imposto im){
        produto = p;
        quantidade = q;
        imposto = im;
    }
}
