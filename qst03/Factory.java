
import java.io.FileInputStream;
import java.util.Properties;

public class Factory {

    public static LocalidadeAbstractFactory newLocalidade() {
        try {
            Properties props = new Properties();
            props.load(new FileInputStream("config.properties"));

            String loc = props.getProperty("localidade");

            if (loc.equalsIgnoreCase("Brasil")) {
                return new LocalidadeBrasil();
            } else if (loc.equalsIgnoreCase("EUA")) {
                return new LocalidadeEUA();
            } else {
                throw new IllegalArgumentException("Localidade inválida: " + loc);
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro lendo propriedades: " + e.getMessage());
        }
    }
}
