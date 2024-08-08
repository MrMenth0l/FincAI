import java.util.ArrayList;
import java.util.List;

public class Fincai
{
    private List<Finca> fincas = new ArrayList<Finca>();

    public List<Finca> getFincas() {return fincas;}

    public void addFinca(Finca finca) {
        fincas.add(finca);
    }
}
