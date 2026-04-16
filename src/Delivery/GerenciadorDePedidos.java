package Delivery;

public class GerenciadorDePedidos {

    public static void main(String[] args) {
        Pedidos pedido = new Pedidos();
        pedido.codigo = 1;
        pedido.subtotal = 100.0;
        pedido.desconto = 5.0;

        System.out.println("Código: " + pedido.getCodigo() + ", Subtotal: " + pedido.getSubtotal() + ", Desconto: " + pedido.getDesconto() + ", Total: " + pedido.getTotal());

    }

}