import java.util.Date;
import java.text.SimpleDateFormat;

public class Token_gen
{
    private String year;
    private int numero;
    private String letras;
    private String fin;
    private Finca finca;
    public static SimpleDateFormat YYYY = new SimpleDateFormat("YYYY");


    public void generacion(){

        numero = 0;

        Date fecha = new Date();
        year = YYYY.format(fecha);
        letras = finca.getNombre_Finca().substring(0, 3).toUpperCase();
        numero = numero + 1;
        fin = (year + letras + numero);


    }


    public Finca getFinca() {
        return finca;
    }

    public void setFinca(Finca finca) {
        this.finca = finca;
    }

    public String getFin() {generacion(); return fin;}
}
