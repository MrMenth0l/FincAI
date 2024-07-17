public class Seccion
{
    private String seccion;
    private int tamaño;
    private String funcion;
    private String estado;

    public Seccion(String seccion, int tamaño, String funcion, String estado)
    {
        this.seccion = seccion;
        this.tamaño = tamaño;
        this.funcion = funcion;
        this.estado = estado;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSeccion() {
        return seccion;
    }

    public int getTamaño() {
        return tamaño;
    }

    public String getFuncion() {
        return funcion;
    }

    public String getEstado() {
        return estado;
    }
}
