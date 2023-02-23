import model.Kon;
import model.Macka;
import model.Pes;
import model.Zviera;
import java.util.ArrayList;
import java.util.List;

public class EvidenciaZvierat {
    public static void main(String[] args) {
        List<Zviera> zvierata = new ArrayList<>();
        zvierata.add(new Pes("Dunčo", 50));
        zvierata.add(new Macka("Cica", 5));
        zvierata.add(new Kon("Jonatán", 10));
        zvierata.add(new Kon("Lord", 40));

        for (Zviera zviera: zvierata) {
            zviera.ozyvasa();
        }
    }
}
