
public class EstadoIndeferido implements EstadoProcesso {

    @Override
    public void avaliar(Processo p) {
        throw new IllegalStateException("Processo já foi avaliado (indeferido).");
    }

    @Override
    public void deferir(Processo p) {
        throw new IllegalStateException(
            "Não é possível deferir pois já está indeferido.");
    }

    @Override
    public void indeferir(Processo p) {
        throw new IllegalStateException("O processo já está indeferido.");
    }

    @Override
    public void fechar(Processo p) {
        System.out.println("Processo fechado após prazo legal.");
        p.setEstado(new EstadoFechado());
    }
}
