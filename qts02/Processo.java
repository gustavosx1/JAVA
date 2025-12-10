
public class Processo {

    private EstadoProcesso estado;

    public Processo() {
        this.estado = new EstadoEmAvaliacao();
    }

    // eventos
    public void avaliar() {
        estado.avaliar(this);
    }

    public void deferir() {
        estado.deferir(this);
    }

    public void indeferir() {
        estado.indeferir(this);
    }

    public void fechar() {
        estado.fechar(this);
    }

    // transição interna
    public void setEstado(EstadoProcesso novoEstado) {
        this.estado = novoEstado;
    }

    // ação exigida no enunciado
    public void avisarInteressado() {
        System.out.println("Avisando interessado sobre o resultado da avaliação...");
    }
}

