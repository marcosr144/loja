package loja;

import java.util.ArrayList;

public class Pedido {
    private String dataDeCriacao;
    private String status;
    private Cliente cliente;
    private ArrayList<PedidoItem> itens = new ArrayList<>();
    
    public void addItem(Produto produto, int quantidade) {
        PedidoItem pi = new PedidoItem(produto, quantidade);
        this.itens.add(pi);
    }
    
    public Produto removeItem(Produto produto, int quantidade) {
        PedidoItem PedidoItem = new PedidoItem(produto, 2);
        if (this.itens.contains(produto)) {
            this.itens.remove(produto);
        }
        return produto;
    }
    
    public double calculaValorTotal() {
        double total = 0;
        for (PedidoItem item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(String dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<PedidoItem> getItens() {
        return itens;
    }
    
}
