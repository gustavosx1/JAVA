
public class Main {
    public static void main(String[] args) {

        System.out.println("=== TESTE 1: Processo deferido ===");
        Processo p1 = new Processo();

        p1.avaliar();   // já está em avaliação
        p1.deferir();   // transição: EmAvaliacao → Deferido
        p1.fechar();    // Fechado após prazo legal

        System.out.println("\n=== TESTE 2: Processo indeferido ===");
        Processo p2 = new Processo();

        p2.indeferir();  // transição: EmAvaliacao → Indeferido
        p2.fechar();     // Fechado após prazo legal

        System.out.println("\n=== TESTE 3: Erro proposital ===");
        try {
            Processo p3 = new Processo();
            p3.deferir();
            p3.deferir(); // tentar deferir novamente → exceção
        } catch (Exception e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }
}
