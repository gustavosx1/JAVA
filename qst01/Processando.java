
public class Processando implements Pedido {

  @Override
  public void alterar(PedidoContext pedido) {
    System.out.println("Pedido alterado com sucesso!!");
  }

  @Override
  public void cancelar(PedidoContext pedido) {
    System.out.println("Cancelando Pedido");
    pedido.setEstado(new Cancelado());
  }

  @Override
  public void enviar(PedidoContext pedido) {
    System.out.println("Cancelando Pedido");
    pedido.setEstado(new Enviado());

  }
}
