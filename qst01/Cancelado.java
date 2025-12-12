
public class Cancelado implements Pedido {

  @Override
  public void alterar(PedidoContext pedido) {
    throw new IllegalStateException(
        "Não é possível alterar: o pedido já foi CANCELADO.");
  }

  @Override
  public void cancelar(PedidoContext pedido) {
    throw new IllegalStateException(
        "Não é possível cancelar: o pedido já foi CANCELADO.");
  }

  @Override
  public void enviar(PedidoContext pedido) {
    throw new IllegalStateException("Não é possível enviar. O pedido já foi CANCELADO.");
  }
}
