public class Suministrador
{
    private String nombre;
    private String producto;
    private int precio;
    private int dias_espera;


    public Suministrador(String nombre, String producto, int precio, int dias_espera) {

        this.nombre = nombre;
        this.producto = producto;
        this.precio = precio;
        this.dias_espera = dias_espera;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setDias_espera(int dias_espera) {
        this.dias_espera = dias_espera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProducto() {
        return producto;
    }

    public int getPrecio() {
        return precio;
    }

    public int getDias_espera() {
        return dias_espera;
    }
}
