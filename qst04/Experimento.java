import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Experimento {
  private List<RoboAction> acoes;

  public Experimento() {
    this.acoes = new ArrayList<>();
  }

  public void AdicionarAcao(RoboAction acao) {
    this.acoes.add(acao);
  }

  public void executarAcao() {
    System.out.println("Iniciando Experimentos...");
    for (RoboAction acao : acoes) {
      acao.executar();
    }
  }

}
