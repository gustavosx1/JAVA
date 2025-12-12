
public class Main {
  public static void main(String[] args) {

    PedidoContext pedido = new PedidoContext();

    // Estado inicial → PROCESSANDO
    System.out.println("---- Testando Pedido ----");

    pedido.alterar(); // OK
    pedido.enviar(); // muda para ENVIADO

    System.out.println("\nTentando alterar depois de enviado:");
    try {
      pedido.alterar(); // deve lançar exceção
    } catch (Exception e) {
      System.out.println("Erro: " + e.getMessage());
    }

    System.out.println("\nTentando cancelar depois de enviado:");
    try {
      pedido.cancelar(); // deve lançar exceção
    } catch (Exception e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }
}
