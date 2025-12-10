
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DataBrasil extends Data {

    @Override
    public String toString() {
        LocalDate hoje = LocalDate.now();
        String dia = hoje.getDayOfWeek()
                         .getDisplayName(TextStyle.SHORT, new Locale("pt", "BR"));
        return dia; // Ex: "Seg", "Ter"
    }
}
