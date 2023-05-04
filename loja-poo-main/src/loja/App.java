package loja;

public class App {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("Varginha", "MG");
        Telefone telefone = new Telefone ("035","99999-9999");
        Produto produto = new Produto("x-tudo", "produto 01", 26.32);
        Produto produto2 = new Produto("coca-cola", "produto 02", 6.12);
        
        // TODO: objeto do tipo pessoa
        Pessoa pessoa = new Pessoa("Gabriel Vitor", "27/04/2005");
        
        Endereco endereco = new Endereco("R. X", "123-A");
        endereco.setCidade(cidade);
        
        //System.out.println("Rua: " + endereco.getRua());
        //System.out.println("Número: " + endereco.getNumero());
        //System.out.println("Cidade: " + endereco.getCidade().getNome());
        //System.out.println("Estado: " + endereco.getCidade().getEstado());
        
        int id = 1;
        Cliente cliente = new Cliente(id);
        cliente.setPessoa(pessoa);
        cliente.setEndereco(endereco);
        cliente.setTelefone(telefone);
        
        /*System.out.println("ID:" + cliente.getId());
        System.out.println("Nome: " + cliente.getPessoa().getNome());
        System.out.println("Rua:" + cliente.getEndereco().getRua());
        System.out.println("Número: " + cliente.getEndereco().getNumero());
        System.out.println("Cidade: " + cliente.getEndereco().getCidade()
            .getNome());
        System.out.println("Estado: " + cliente.getEndereco().getCidade()
            .getEstado());
        System.out.println("Telefone: (" + cliente.getTelefone().getDdd() 
            + ") " + cliente.getTelefone().getNumero());*/
        
        PedidoItem pedidoItem = new PedidoItem();
        pedidoItem.setProduto(produto);
        pedidoItem.setQuantidade(2);
        
        PedidoItem pedidoItem2 = new PedidoItem();
        pedidoItem2.setProduto(produto2);
        pedidoItem2.setQuantidade(5);
        
        
        /*System.out.println("***** PEDIDO ITEM *****");
        System.out.println("Produto: " + pedidoItem.getProduto().getNome());
        System.out.println("Preço Produto: " + pedidoItem.getProduto().getPreco());
        System.out.println("Quantidade Produto: " + pedidoItem.getQuantidade());
        System.out.println("Subtotal: " + pedidoItem.getSubtotal());*/
        
        Pedido pedido = new Pedido();
        pedido.setDataDeCriacao("27/04/2023");
        pedido.setStatus("em andamento");
        pedido.setCliente(cliente);
        pedido.addItem(pedidoItem);
        pedido.addItem(pedidoItem2);
        
        /*System.out.println("**********PEDIDO**********");
        System.out.println("Data: " + pedido.getDataDeCriacao());
        System.out.println("Status: " + pedido.getStatus());
        System.out.println("Nome Cliente: " + pedido.getCliente().getPessoa().getNome());
        System.out.println("Cidade Cliente: " + pedido.getCliente().getEndereco().getCidade().getNome());
        System.out.println("Itens");
        System.out.println("====================================");
        System.out.println("Quant | Nome | Preço | SubTotal");
        for (PedidoItem item : pedido.getItens()) {
            String nomeProduto = item.getProduto().getNome();
            double preco = item.getProduto().getPreco();
            int quantidade = item.getQuantidade();
            double subtotal = item.getSubtotal();
            System.out.println(quantidade + " | " + nomeProduto + " | " + preco + " | " + subtotal);
        }
        System.out.println("====================================");
        System.out.println("TOTAL:          " + pedido.calculaValorTotal());
        System.out.println("====================================");*/
    }
}
