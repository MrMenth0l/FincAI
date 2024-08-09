import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        while (true) //loop pq si
        {
            boolean active = true;
            Fincai fincai = new Fincai();
            Scanner sc = new Scanner(System.in);
            int opc = 0;
            System.out.println("Bienvenido a FincAI");
            boolean log_out = true;
            Finca finca = new Finca();
            while (log_out) //Loop para ingresar usuario
                {
                System.out.println("Que desea hacer:" +
                        "\n1. Iniciar sesion" +
                        "\n2. Crear cuenta");
                opc = sc.nextInt();
                if (opc == 1) {
                    System.out.println("Ingrese el nombre de la finca con la que esta registrado: ");
                    String nombre = sc.next();

                    for (int i = 0; i < fincai.getFincas().size(); i++) {
                        if (nombre.equals(fincai.getFincas().get(i).getNombre_Finca())) {
                            finca = fincai.getFincas().get(i);
                        } else {
                            System.out.println("Ingrese un nombre correcto");
                        }

                    }
                    String usuario = "";
                    String pass = "";
                    System.out.println("Ingrese su usuario");
                    usuario = sc.next();
                    System.out.println("Ingrese su contraseña");
                    pass = sc.next();
                    for (int i = 0; i < finca.getUsuarios().size(); i++) {
                        if (finca.getUsuarios().get(i).getUser().equals(usuario)) {
                            System.out.println("Bienvenido.");
                        } else {
                            System.out.println("Ingrese un usuario correcto");
                        }
                    }
                    for (int i = 0; i < finca.getUsuarios().size(); i++) {
                        if (finca.getUsuarios().get(i).getPass() == pass) {
                            System.out.println("Bienvenido.");
                        } else {
                            System.out.println("Ingrese una contraseña correcta");
                        }
                        log_out = false;
                    }

                } else if (opc == 2) {
                    Usuario usuario = new Usuario();
                    String pass = "";
                    System.out.println("Ya tiene una finca registrada?" +
                            "\n1. Si" +
                            "\n2. No");
                    opc = sc.nextInt();
                    if (opc == 1) {
                        System.out.println("Ingrese el nombre de la finca con la que esta registrado: ");
                        String nombre = sc.next();
                        for (int i = 0; i < fincai.getFincas().size(); i++) {
                            if (nombre.equals(fincai.getFincas().get(i).getNombre_Finca())) {
                                finca = fincai.getFincas().get(i);
                            }
                        }

                    } else if (opc == 2) {
                        Token_gen tg = new Token_gen();
                        System.out.println("Ingrese el nombre de su finca: ");
                        finca.setNombre_Finca(sc.next());
                        tg.setFinca(finca);
                        finca.setIdentificador(tg.getFin());
                        System.out.println("Este es el número de acceso a su finca: " + tg.getFin());
                    }
                    System.out.println("Ingresar su nombre de usuario: ");
                    usuario.setUser(sc.next());
                    System.out.println("Ingresar su contraseña: ");
                    pass = sc.next();
                    System.out.println("Ingresar de nuevo: ");
                    if (sc.next().equals(pass)) {
                        usuario.setPass(pass);
                        finca.setSetup(true);
                        log_out=false;
                    }else {System.out.println("No coinciden las contraseñas");}
                    usuario.setFinca(finca);
                    finca.addUsuarios(usuario);
                }
            };
            while (finca.isSetup()) //Lopp para configuracion inicial de una finca
            {
                System.out.println("Bienvenido a FincAI, primero, establezcamos su finca en el programa" +
                        "\n Que operacion desea hacer:");
                System.out.println("1. Agregar sus cabezas de ganado"
                        + "\n2. Agregar secciones de su finca"
                        + "\n3. Agregar sus suministradores"
                        + "\n4. Agregar sus suministros actuales"
                        + "\n5. Agregar sus cosechas "
                        + "\n6. Revisar estado de finca"
                        + "\n7. Terminar Configuracion"
                        + "\n8. Cerrar sesion");
                switch (sc.nextInt()) {
                    case 1:
                        opc = 0;
                        while (opc != 2) {
                            System.out.println("Que desa realizar: " +
                                    "\n1. Agregar cabeza de ganado" +
                                    "\n2. Regresar");
                            opc = sc.nextInt();
                            if (opc == 1) {
                                CabezaGanado cabeza = new CabezaGanado();
                                System.out.println("Ingrese el identificador(nombre, numero, etc.) de su cabeza de ganado: ");
                                cabeza.setNombre(sc.next());
                                System.out.println("Ingrese la raza de su cabeza de ganado: ");
                                cabeza.setRaza(sc.next());
                                System.out.println("Ingrese la edad de la cabeza de ganado: ");
                                cabeza.setEdad(sc.nextInt());
                                finca.addCabezaGanado(cabeza);
                            }
                        }
                        break;
                    case 2:
                        opc = 0;
                        while (opc != 2) {
                            System.out.println("Que desa realizar: " +
                                    "\n1. Agregar Seccion" +
                                    "\n2. Regresar");
                            opc = sc.nextInt();
                            if (opc == 1) {
                                Seccion seccion = new Seccion("", 0, "", "");
                                System.out.println("Ingrese el identificador de esta seccion: ");
                                seccion.setSeccion(sc.next());
                                System.out.println("Ingrese el tamaño en manzanas de esta seccion: ");
                                seccion.setTamaño(sc.nextInt());
                                System.out.println("Ingrese la funcino de esta seccion: ");
                                seccion.setFuncion(sc.next());
                                System.out.println("Ingrese el estado de esta Seccion: ");
                                seccion.setFuncion(sc.next());
                                finca.addSeccion(seccion);
                            }

                        }
                        break;
                    case 3:
                        opc = 0;
                        while (opc != 2) {
                            System.out.println("Que desa realizar: " +
                                    "\n1. Agregar suministrador" +
                                    "\n2. Regresar");
                            opc = sc.nextInt();
                            if (opc == 1) {
                                Suministrador suministrador = new Suministrador("", "", 0, 0);
                                System.out.println("Ingrese el nombre del suministrador: ");
                                suministrador.setNombre(sc.next());
                                System.out.println("Ingrese el producto que provee: ");
                                suministrador.setProducto(sc.next());
                                System.out.println("Ingrese el precio de este producto");
                                suministrador.setPrecio(sc.nextInt());
                                System.out.println("Ingrese cuantos dias espera en promedio por el producto: ");
                                suministrador.setDias_espera(sc.nextInt());
                                finca.addSuministrador(suministrador);
                            }


                        }
                        break;
                    case 4:
                        opc = 0;
                        while (opc != 2) {
                            System.out.println("Que desa realizar: " +
                                    "\n1. Agregar suministro" +
                                    "\n2. Regresar");
                            opc = sc.nextInt();
                            if (opc == 1) {
                                Suministro suministro = new Suministro();
                                System.out.println("Ingrese el nombre de este suministro");
                                suministro.setNombre(sc.next());
                                System.out.println("Ingrese que tipo de suministro es: ");
                                suministro.setTipo(sc.next());
                                System.out.println("Ingrese la cantidad actual de este suministro: ");
                                suministro.setCantidad(sc.nextInt());
                                System.out.println("Hace cuanto lo compro, en dias: ");
                                suministro.setDiasDesdeCompra(sc.nextInt());
                                finca.addSuministros(suministro);
                            }
                        }

                    case 5:
                        opc = 0;
                        while (opc != 2) {
                            System.out.println("Que desa realizar: " +
                                    "\n1. Agregar cosecha" +
                                    "\n2. Regresar");
                            opc = sc.nextInt();
                            if (opc == 1) {
                                Cosecha cosecha = new Cosecha("", 0, "", "", "");
                                System.out.println("Ingrese el tipo de cosecha que es: ");
                                cosecha.setTipo(sc.next());
                                System.out.println("Ingrese el tamaño de esta cosecha: ");
                                cosecha.setTamaño(sc.nextInt());
                                System.out.println("Ingrese en que estado se encuentra: ");
                                cosecha.setEstado(sc.next());
                                System.out.println("Ingrese en que epoca la cosecha: ");
                                cosecha.setEpoca(sc.next());
                                System.out.println("Ingrese la geografia donde la crece: ");
                                cosecha.setGeografia(sc.next());
                                finca.addCosecha(cosecha);
                            }
                        }
                        break;
                    case 6:
                        opc = 0;
                        while (opc != 6) {
                            System.out.println("Que desa realizar: " +
                                    "\n1. Revisar cabezas de ganado actuales" +
                                    "\n2. Revisar Secciones de la finca actuales" +
                                    "\n3. Revisar Suministradores actuales" +
                                    "\n4. Revisar Suministros actuales" +
                                    "\n5. Revisar Cosechas actuales" +
                                    "\n6. Regresar");
                            opc = sc.nextInt();
                            if (opc == 1) {
                                for (int i = 0; i < finca.getCabezaGanados().size(); i++) {
                                    System.out.println("cabeza #" + (i + 1) + ":" + finca.getCabezaGanados().get(i).getNombre() + ", " + finca.getCabezaGanados().get(i).getEdad() + " años, " + finca.getCabezaGanados().get(i).getRaza());
                                }
                            } else if (opc == 2) {
                                for (int i = 0; i < finca.getSecciones().size(); i++) {
                                    System.out.println("Seccion " + (i + 1) + ": " + finca.getSecciones().get(i).getSeccion() + ", " + finca.getSecciones().get(i).getTamaño() + ", " + finca.getSecciones().get(i).getFuncion() + ", " + finca.getSecciones().get(i).getEstado());
                                }
                            } else if (opc == 3) {
                                for (int i = 0; i < finca.getSuministradores().size(); i++) {
                                    System.out.println("Suministrador " + (i + 1) + ": " + finca.getSuministradores().get(i).getNombre() + ", " + finca.getSuministradores().get(i).getProducto() + ", " + finca.getSuministradores().get(i).getPrecio() + "QTZ, " + finca.getSuministradores().get(i).getDias_espera() + "Dias de espera, ");
                                }
                            } else if (opc == 4) {
                                for (int i = 0; i < finca.getSuministros().size(); i++) {
                                    System.out.println("Suministro " + (i + 1) + ": " + finca.getSuministros().get(i).getNombre() + ", " + finca.getSuministros().get(i).getTipo() + ", " + finca.getSuministros().get(i).getCantidad() + ", " + finca.getSuministros().get(i).getDiasDesdeCompra() + " Dias desde compra, ");
                                }
                            } else if (opc == 5) {
                                for (int i = 0; i < finca.getCosechas().size(); i++) {
                                    System.out.println("Cosecha " + (i + 1) + ": " + finca.getCosechas().get(i).getTipo() + ", " + finca.getCosechas().get(i).getTamaño() + ", " + finca.getCosechas().get(i).getEpoca() + ", ");
                                }
                            }

                        }
                        break;
                    case 7:
                        finca.setSetup(false);
                        break;
                    case 8:
                        log_out = true;
                        finca.setSetup(false);
                        break;

                    default:
                        break;
                }
            };
            while (active)//Loop general para interactuar
            {System.out.println("");}
        }
    }
}
