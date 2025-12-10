
public class Enviado implements Pedido {

    @Override
    public void alterar(PedidoContext pedido) {
        throw new IllegalStateException(
            "Não é possível alterar: o pedido já foi ENVIADO."
        );
    }

    @Override
    public void cancelar(PedidoContext pedido) {
        throw new IllegalStateException(
            "Não é possível cancelar: o pedido já foi ENVIADO."
        );
    }

    @Override
    public void enviar(PedidoContext pedido) {
        throw new IllegalStateException("O pedido já foi ENVIADO.");
    }
}

