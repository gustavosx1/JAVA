public interface EstadoProcesso {
  void avaliar(Processo p);

  void deferir(Processo p);

  void indeferir(Processo p);

  void fechar(Processo p);
}
