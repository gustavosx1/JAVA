
public class EstadoFechado implements EstadoProcesso {

    @Override
    public void avaliar(Processo p) {
        throw new IllegalStateException("Processo já está fechado.");
    }

    @Override
    public void deferir(Processo p) {
        throw new IllegalStateException("Processo já está fechado.");
    }

    @Override
    public void indeferir(Processo p) {
        throw new IllegalStateException("Processo já está fechado.");
    }

    @Override
    public void fechar(Processo p) {
        throw new IllegalStateException("Processo já está fechado.");
    }
}
