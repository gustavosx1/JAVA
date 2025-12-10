
public class Processando implements Pedido {

    @Override
    public void alterar(PedidoContext pedido) {
        throw new IllegalStateException(
            "Não é possível alterar: o pedido já foi ENVIADO."
        );
    }

    @Override
    public void cancelar(PedidoContext pedido) {
       System.out.println("Cancelando Pedido")
      pedido.setEstado(new Cancelado)
    }

    @Override
    public void enviar(PedidoContext pedido) {
      System.out.println("Cancelando Pedido")
      pedido.setEstado(new Enviado )
    
    }
}

