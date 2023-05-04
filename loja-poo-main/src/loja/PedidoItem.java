package loja;


public class PedidoItem {
    private int quantidade;
    private double subtotal;
    private Produto produto;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        setSubtotal();
        return subtotal;
    }

    private void setSubtotal() {
        this.subtotal = this.produto.getPreco() * this.quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
