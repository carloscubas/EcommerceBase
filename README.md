# EcommerceBase

Conta Corrente -> Conta
    |-> Agencia
    |-> Correntista -> Pessoa
            |
            |-> numero de conta

Ecommerce
    
    Produto (Classe Abstrata) -> Fabricante, Nome, Preço
        |-> Computador -> Hd, Memória, Processador
        |-> Televisão -> Peso, tamanho, Resolução
        |-> Cerveja -> teor alcoolico, prazo de validade
        
    Produto -> imposto

    Carrinho
        Lista de Pedidos<(produto, quantidade)>
                    |-> Pedido faz uma composição com produto (Pedido não e produto, ele tem produto)
        Preço total dos produtos

        Inclui pedidos
        Soma os pedidos do carrinho
        Lista os pedidos
        * - Checkout
            -> mensagem (pagamento executado com sucesso)
            -> limpar o carrinho
            
        Pessoa -> Cliente Mais, Cliente, Cliente Fidelidade
                    |-> Desconto
                    
        NotaFiscal (gera a nota com o valor total e o calculo do imposto)
        
        

