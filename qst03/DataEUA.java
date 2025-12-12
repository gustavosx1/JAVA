
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DataEUA extends Data {

    @Override
    public String toString() {
        LocalDate hoje = LocalDate.now();
        String dia = hoje.getDayOfWeek()
                         .getDisplayName(TextStyle.SHORT, Locale.US);
        return dia; // Ex: "Mon", "Tue"
    }
}
