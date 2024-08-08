public class Usuario
{
    private String User;
    private String pass;
    private Finca finca;

    public void setFinca(Finca finca) {this.finca = finca;}
    public Finca getFinca() {return finca;}

    public void setUser(String user) {User = user;}
    public String getUser() {return User;}

    public String getPass() {return pass;}
    public void setPass(String pass) {this.pass = pass;}
}
