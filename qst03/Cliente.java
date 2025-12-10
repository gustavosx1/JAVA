
public class Cliente {

    public static void main(String[] args) {

        LocalidadeAbstractFactory fabrica = Factory.newLocalidade();

        Data d = fabrica.getData();
        Moeda m = fabrica.getMoeda(10.00);

        System.out.println("Data formatada: " + d);
        System.out.println("Moeda formatada: " + m);
    }
}
