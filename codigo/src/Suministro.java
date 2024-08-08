class Suministro
{
    private String Nombre;
    private String Tipo;
    private int Cantidad;
    private CabezaGanado Necesita;
    private Suministrador Suministrador;
    private int DiasDesdeCompra;

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setNecesita(CabezaGanado necesita) {
        Necesita = necesita;
    }

    public CabezaGanado getNecesita() {return Necesita;}

    public Suministrador getSuministrador() {return Suministrador;}

    public void setSuministrador(Suministrador suministrador) {
        Suministrador = suministrador;
    }

    public void setDiasDesdeCompra(int diasDesdeCompra) {DiasDesdeCompra = diasDesdeCompra;}

    public int getDiasDesdeCompra() {return DiasDesdeCompra;}
}
