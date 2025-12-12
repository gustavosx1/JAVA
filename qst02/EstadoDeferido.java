
public class EstadoDeferido implements EstadoProcesso {

    @Override
    public void avaliar(Processo p) {
        throw new IllegalStateException("Processo já foi avaliado (deferido).");
    }

    @Override
    public void deferir(Processo p) {
        throw new IllegalStateException("O processo já está deferido.");
    }

    @Override
    public void indeferir(Processo p) {
        throw new IllegalStateException(
            "Não é possível indeferir pois já está deferido.");
    }

    @Override
    public void fechar(Processo p) {
        System.out.println("Processo fechado após prazo legal.");
        p.setEstado(new EstadoFechado());
    }
}

