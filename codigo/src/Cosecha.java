public class Cosecha
{
    private String tipo;
    private int tamaño;
    private String estado;
    private String epoca;
    private String geografia;

    public Cosecha(String tipo, int tamaño, String estado, String epoca, String geografia)
    {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.estado = estado;
        this.epoca = epoca;
        this.geografia = geografia;
    }



    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }

    public void setGeografia(String geografia) {
        this.geografia = geografia;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public String getEstado() {
        return estado;
    }

    public String getEpoca() {
        return epoca;
    }

    public String getGeografia() {return geografia;}
}
