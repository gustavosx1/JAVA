class Main {
  public static void main(String[] args) {
    Experimento e = new Experimento();

    e.AdicionarAcao(new ElevaTemperatura());
    e.AdicionarAcao(new ProdutoQuimico());
    e.AdicionarAcao(new DiminuiTemp());
    e.AdicionarAcao(new DarPao());

    e.executarAcao();
  }
}
