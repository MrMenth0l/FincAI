import java.util.ArrayList;
import java.util.List;

public class Finca {
    private String Identificador;
    private List<CabezaGanado> cabezaGanados = new ArrayList<CabezaGanado>();
    private List<Seccion> secciones = new ArrayList<Seccion>();
    private List<Suministrador> suministradores = new ArrayList<Suministrador>();
    private List<Cosecha> cosechas = new ArrayList<Cosecha>();
    private List<Suministro> suministros = new ArrayList<Suministro>();
    private List<Usuario> usuarios = new ArrayList<Usuario>();
    private boolean setup;
    private String Nombre_Finca;


    public List<CabezaGanado> getCabezaGanados() {return cabezaGanados;}
    public List<Seccion> getSecciones() {return secciones;}
    public List<Cosecha> getCosechas() {return cosechas;}
    public List<Suministrador> getSuministradores() {return suministradores;}
    public List<Suministro> getSuministros() {return suministros;}
    public List<Usuario> getUsuarios() {return usuarios;}

    public void addCabezaGanado(CabezaGanado cabezaGanado){cabezaGanados.add(cabezaGanado);}
    public void addSeccion(Seccion seccion){secciones.add(seccion);}
    public void addSuministrador(Suministrador suministrador){suministradores.add(suministrador);}
    public void addCosecha(Cosecha cosecha){cosechas.add(cosecha);}
    public void addSuministros(Suministro suministro){suministros.add(suministro);}
    public void addUsuarios(Usuario usuario){usuarios.add(usuario);}

    public boolean isSetup() {return setup;}
    public void setSetup(boolean setup) {this.setup = setup;}

    public void setIdentificador(String identificador) {Identificador = identificador;}
    public String getIdentificador() {return Identificador;}

    public void setNombre_Finca(String nombre_Finca) {Nombre_Finca = nombre_Finca;}
    public String getNombre_Finca() {return Nombre_Finca;}
}
