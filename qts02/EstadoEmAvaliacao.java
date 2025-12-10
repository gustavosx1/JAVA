
public class EstadoEmAvaliacao implements EstadoProcesso {

    @Override
    public void avaliar(Processo p) {
        // não faz nada; já está em avaliação
        System.out.println("O processo já está em avaliação.");
    }

    @Override
    public void deferir(Processo p) {
        p.avisarInteressado();
        p.setEstado(new EstadoDeferido());
    }

    @Override
    public void indeferir(Processo p) {
        p.avisarInteressado();
        p.setEstado(new EstadoIndeferido());
    }

    @Override
    public void fechar(Processo p) {
        throw new IllegalStateException(
            "Não é possível fechar: processo ainda está em avaliação.");
    }
}
