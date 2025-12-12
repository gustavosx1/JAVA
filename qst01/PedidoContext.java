
public class PedidoContext {
  private Pedido p;

  public PedidoContext() {
    this.p = new Processando();
  }

  public void enviar() {
    p.alterar(this);
  }

  public void alterar() {
    p.alterar(this);
  }

  public void cancelar() {
    p.cancelar(this);
  }

  public void setEstado(Pedido novoEstado) {
    this.p = novoEstado;
  }
}
