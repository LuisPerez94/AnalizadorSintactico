/* text.java */
/* Generated By:JavaCC: Do not edit this line. text.java */
package compiladordibujos;
public class text implements textConstants {
        public static StringBuilder errores;
        public static void error(ParseException ex){
                errores.append("Error de sintaxis en el token: "+ ex.currentToken +
                    " en linea: " + ex.currentToken.beginLine + " columna: " +ex.currentToken.beginColumn +" me saltare a la siguiente etiqueta\u005cn");
                while(!token.image.equals(">")){
                        getNextToken();
                }
        }
//        public static void main(String args[])throws ParseException{
//                try{
//                        text analizador =new text(System.in);
//                        analizador.Programa();
//                        System.out.println("Se a compilado Correctamente");
//
//                }catch(ParseException e){
//                        System.out.println(e.getMessage());
//                        System.out.println("Ha Ocurrido un error");
//                }
//        }

  static final public Dibujo Programa() throws ParseException {Dibujo dibujo=new Dibujo();
        errores= new StringBuilder();
    jj_consume_token(ABREETI);
    jj_consume_token(MAIN);
    jj_consume_token(CIERRAETI);
    label_1:
    while (true) {
      if (jj_2_1(3)) {
        ;
      } else {
        break label_1;
      }
      jj_consume_token(ABREETI);
      jj_consume_token(CABECERA);
      jj_consume_token(CIERRAETI);
      Cabecera(dibujo);
      jj_consume_token(ABREETI);
      jj_consume_token(CIERRA);
      jj_consume_token(CABECERA);
      jj_consume_token(CIERRAETI);
    }
    dibujo = Principal(dibujo);
    jj_consume_token(ABREETI);
    jj_consume_token(CIERRA);
    jj_consume_token(MAIN);
    jj_consume_token(CIERRAETI);
    jj_consume_token(0);
{if ("" != null) return dibujo;}
    throw new Error("Missing return statement in function");
  }

  static final public Dibujo Principal(Dibujo dibujo) throws ParseException {
    label_2:
    while (true) {
      if (jj_2_2(3)) {
        ;
      } else {
        break label_2;
      }
      if (jj_2_3(3)) {
        jj_consume_token(ABREETI);
        jj_consume_token(RECTANGULO);
        jj_consume_token(CIERRAETI);
Rectangulo rect= new Rectangulo();
        Atributos(rect);
        jj_consume_token(ABREETI);
        jj_consume_token(CIERRA);
        jj_consume_token(RECTANGULO);
        jj_consume_token(CIERRAETI);
System.out.println("Se encontro un rectangulo");
                        dibujo.agregarDibujable(rect);
      } else if (jj_2_4(3)) {
        jj_consume_token(ABREETI);
        jj_consume_token(CIRCULO);
        jj_consume_token(CIERRAETI);
Circulo circ= new Circulo();
        Atributos(circ);
        jj_consume_token(ABREETI);
        jj_consume_token(CIERRA);
        jj_consume_token(CIRCULO);
        jj_consume_token(CIERRAETI);
System.out.println("Se encontro un circulo");
                        dibujo.agregarDibujable(circ);
      } else if (jj_2_5(3)) {
        jj_consume_token(ABREETI);
        jj_consume_token(LINEA);
        jj_consume_token(CIERRAETI);
Linea lin= new Linea();
        Atributos(lin);
        jj_consume_token(ABREETI);
        jj_consume_token(CIERRA);
        jj_consume_token(LINEA);
        jj_consume_token(CIERRAETI);
System.out.println("Se encontro una linea");
                        dibujo.agregarDibujable(lin);
      } else if (jj_2_6(3)) {
        jj_consume_token(ABREETI);
        jj_consume_token(TEXTO);
        jj_consume_token(CIERRAETI);
Texto texto=new Texto();
        Atributos(texto);
        jj_consume_token(ABREETI);
        jj_consume_token(CIERRA);
        jj_consume_token(TEXTO);
        jj_consume_token(CIERRAETI);
System.out.println("Se encontro un TEXTO");
                        dibujo.agregarDibujable(texto);
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
{if ("" != null) return dibujo;}
    throw new Error("Missing return statement in function");
  }

  static final public void Atributos(Dibujable d) throws ParseException {Token t;
        String cad;
    label_3:
    while (true) {
      try {
        if (jj_2_7(3)) {
          jj_consume_token(ABREETI);
          jj_consume_token(ALTO);
          jj_consume_token(CIERRAETI);
          t = jj_consume_token(NUMBER);
d.setAlto( Integer.parseInt(t.toString()) );
          jj_consume_token(ABREETI);
          jj_consume_token(CIERRA);
          jj_consume_token(ALTO);
          jj_consume_token(CIERRAETI);
        } else if (jj_2_8(3)) {
          jj_consume_token(ABREETI);
          jj_consume_token(ANCHO);
          jj_consume_token(CIERRAETI);
          t = jj_consume_token(NUMBER);
d.setAncho( Integer.parseInt(t.toString()) );
          jj_consume_token(ABREETI);
          jj_consume_token(CIERRA);
          jj_consume_token(ANCHO);
          jj_consume_token(CIERRAETI);
        } else if (jj_2_9(3)) {
          jj_consume_token(ABREETI);
          jj_consume_token(POSICION);
          jj_consume_token(POSX);
          jj_consume_token(CIERRAETI);
          t = jj_consume_token(NUMBER);
d.setX( Integer.parseInt(t.toString()));
          jj_consume_token(ABREETI);
          jj_consume_token(CIERRA);
          jj_consume_token(POSICION);
          jj_consume_token(POSX);
          jj_consume_token(CIERRAETI);
        } else if (jj_2_10(3)) {
          jj_consume_token(ABREETI);
          jj_consume_token(POSICION);
          jj_consume_token(POSY);
          jj_consume_token(CIERRAETI);
          t = jj_consume_token(NUMBER);
d.setY( Integer.parseInt(t.toString()));
          jj_consume_token(ABREETI);
          jj_consume_token(CIERRA);
          jj_consume_token(POSICION);
          jj_consume_token(POSY);
          jj_consume_token(CIERRAETI);
        } else if (jj_2_11(3)) {
          jj_consume_token(ABREETI);
          jj_consume_token(COLOR);
          jj_consume_token(CIERRAETI);
          cad = cadena();
d.setColor(cad); System.out.println("Se asigno el color " +cad);
          jj_consume_token(ABREETI);
          jj_consume_token(CIERRA);
          jj_consume_token(COLOR);
          jj_consume_token(CIERRAETI);
        } else if (jj_2_12(3)) {
          jj_consume_token(ABREETI);
          jj_consume_token(RADIO);
          jj_consume_token(CIERRAETI);
          t = jj_consume_token(NUMBER);
if( d instanceof Circulo ){
                                        ((Circulo)d).setRadio(Integer.parseInt(t.toString()));
                                }else System.out.println("Se encontro una etiqueta de radio en una figura que no es un circulo, sera ignorada");
          jj_consume_token(ABREETI);
          jj_consume_token(CIERRA);
          jj_consume_token(RADIO);
          jj_consume_token(CIERRAETI);
        } else if (jj_2_13(3)) {
          jj_consume_token(ABREETI);
          jj_consume_token(POSICION);
          jj_consume_token(POSX2);
          jj_consume_token(CIERRAETI);
          t = jj_consume_token(NUMBER);
d.setAncho( Integer.parseInt(t.toString()));
                                if(! (d instanceof Linea)) System.out.println("Este elemento no lleva el atributo x2, se tomara como ancho");
          jj_consume_token(ABREETI);
          jj_consume_token(CIERRA);
          jj_consume_token(POSICION);
          jj_consume_token(POSX2);
          jj_consume_token(CIERRAETI);
        } else if (jj_2_14(3)) {
          jj_consume_token(ABREETI);
          jj_consume_token(POSICION);
          jj_consume_token(POSY2);
          jj_consume_token(CIERRAETI);
          t = jj_consume_token(NUMBER);
d.setAlto( Integer.parseInt(t.toString()));
                                if(! (d instanceof Linea)) System.out.println("Este elemento no lleva el atributo y2, se tomara como alto");
          jj_consume_token(ABREETI);
          jj_consume_token(CIERRA);
          jj_consume_token(POSICION);
          jj_consume_token(POSY2);
          jj_consume_token(CIERRAETI);
        } else if (jj_2_15(3)) {
          jj_consume_token(ABREETI);
          jj_consume_token(TAM);
          jj_consume_token(CIERRAETI);
          t = jj_consume_token(NUMBER);
if(d instanceof Texto){
                                        ((Texto)d).setTam(Integer.parseInt(t.toString()));
                }else {
                                        System.out.println("Se encontro la etiqueta tam en un objeto que no es texto, sera ignorada");
                                }
          jj_consume_token(ABREETI);
          jj_consume_token(CIERRA);
          jj_consume_token(TAM);
          jj_consume_token(CIERRAETI);
        } else if (jj_2_16(3)) {
          jj_consume_token(ABREETI);
          jj_consume_token(FONDO);
          jj_consume_token(CIERRAETI);
          t = jj_consume_token(TEXT);
boolean f= (t.toString().equals("si") || t.toString().equals("1")) ? true: false;
                                if( d instanceof Circulo){
                                        ((Circulo)d).setFondo(f);
                                } else if(d instanceof Rectangulo){
                                        ((Rectangulo)d).setFondo(f);
                                }else {
                                        System.out.println("Etiqueta fondo no tiene efecto sobre este objeto");
                                }
          jj_consume_token(ABREETI);
          jj_consume_token(CIERRA);
          jj_consume_token(FONDO);
          jj_consume_token(CIERRAETI);
        } else if (jj_2_17(3)) {
          jj_consume_token(ABREETI);
          jj_consume_token(FUENTE);
          jj_consume_token(CIERRAETI);
          cad = cadena();
if(d instanceof Texto){
                                        ((Texto)d).setFuente(cad);
                }else {
                                        System.out.println("Se encontro la etiqueta fuente en un objeto que no es texto, sera ignorada");
                                }
          jj_consume_token(ABREETI);
          jj_consume_token(CIERRA);
          jj_consume_token(FUENTE);
          jj_consume_token(CIERRAETI);
        } else if (jj_2_18(3)) {
          jj_consume_token(ABREETI);
          jj_consume_token(TIPO);
          jj_consume_token(CIERRAETI);
          cad = cadena();
if(d instanceof Texto){
                                        ((Texto)d).setTipo(cad);
                }else {
                                        System.out.println("Se encontro la etiqueta tipo en un objeto que no es texto, sera ignorada");
                                }
          jj_consume_token(ABREETI);
          jj_consume_token(CIERRA);
          jj_consume_token(TIPO);
          jj_consume_token(CIERRAETI);
        } else if (jj_2_19(3)) {
          jj_consume_token(ABREETI);
          jj_consume_token(CADENA);
          jj_consume_token(CIERRAETI);
          cad = cadena();
if(d instanceof Texto){
                                        ((Texto)d).setTexto(cad);
                }else {
                                        System.out.println("Se encontro la etiqueta cadena en un objeto que no es texto, sera ignorada");
                                }
          jj_consume_token(ABREETI);
          jj_consume_token(CIERRA);
          jj_consume_token(CADENA);
          jj_consume_token(CIERRAETI);
        } else {
          jj_consume_token(-1);
          throw new ParseException();
        }
      } catch (ParseException ex) {
error(ex);
      }
      if (jj_2_20(3)) {
        ;
      } else {
        break label_3;
      }
    }
  }

  static final public void Cabecera(Dibujo d) throws ParseException {Token t;
        String f;
    label_4:
    while (true) {
      if (jj_2_21(3)) {
        ;
      } else {
        break label_4;
      }
      try {
        if (jj_2_22(3)) {
          jj_consume_token(ABREETI);
          jj_consume_token(ALTO);
          jj_consume_token(CIERRAETI);
          t = jj_consume_token(NUMBER);
d.setAlto(Integer.parseInt(t.toString()));
          jj_consume_token(ABREETI);
          jj_consume_token(CIERRA);
          jj_consume_token(ALTO);
          jj_consume_token(CIERRAETI);
        } else if (jj_2_23(3)) {
          jj_consume_token(ABREETI);
          jj_consume_token(ANCHO);
          jj_consume_token(CIERRAETI);
          t = jj_consume_token(NUMBER);
d.setAncho(Integer.parseInt(t.toString()));
          jj_consume_token(ABREETI);
          jj_consume_token(CIERRA);
          jj_consume_token(ANCHO);
          jj_consume_token(CIERRAETI);
        } else if (jj_2_24(3)) {
          jj_consume_token(ABREETI);
          jj_consume_token(FONDO);
          jj_consume_token(CIERRAETI);
          f = cadena();
d.setFondo(f);
          jj_consume_token(ABREETI);
          jj_consume_token(CIERRA);
          jj_consume_token(FONDO);
          jj_consume_token(CIERRAETI);
        } else {
          jj_consume_token(-1);
          throw new ParseException();
        }
      } catch (ParseException ex) {
error(ex);
      }
    }
  }

  static final public String cadena() throws ParseException {StringBuilder cad= new StringBuilder();
        Token t= new Token(1,"");
    label_5:
    while (true) {
      if (jj_2_25(3)) {
        ;
      } else {
        break label_5;
      }
      if (jj_2_27(3)) {
        t = jj_consume_token(TEXT);
cad.append(t.toString()).append(" ");
      } else if (jj_2_28(3)) {
        jj_consume_token(30);
        label_6:
        while (true) {
          if (jj_2_26(3)) {
            ;
          } else {
            break label_6;
          }
          t = jj_consume_token(TEXT);
        }
cad.append(":").append(t.toString()+" ");
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
if(cad.length()>0)
                        cad.deleteCharAt(cad.length()-1);
                {if ("" != null) return cad.toString();}
    throw new Error("Missing return statement in function");
  }

  static private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_2_2(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  static private boolean jj_2_3(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  static private boolean jj_2_4(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  static private boolean jj_2_5(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_5(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  static private boolean jj_2_6(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_6(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(5, xla); }
  }

  static private boolean jj_2_7(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_7(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(6, xla); }
  }

  static private boolean jj_2_8(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_8(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(7, xla); }
  }

  static private boolean jj_2_9(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_9(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(8, xla); }
  }

  static private boolean jj_2_10(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_10(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(9, xla); }
  }

  static private boolean jj_2_11(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_11(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(10, xla); }
  }

  static private boolean jj_2_12(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_12(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(11, xla); }
  }

  static private boolean jj_2_13(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_13(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(12, xla); }
  }

  static private boolean jj_2_14(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_14(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(13, xla); }
  }

  static private boolean jj_2_15(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_15(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(14, xla); }
  }

  static private boolean jj_2_16(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_16(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(15, xla); }
  }

  static private boolean jj_2_17(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_17(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(16, xla); }
  }

  static private boolean jj_2_18(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_18(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(17, xla); }
  }

  static private boolean jj_2_19(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_19(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(18, xla); }
  }

  static private boolean jj_2_20(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_20(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(19, xla); }
  }

  static private boolean jj_2_21(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_21(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(20, xla); }
  }

  static private boolean jj_2_22(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_22(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(21, xla); }
  }

  static private boolean jj_2_23(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_23(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(22, xla); }
  }

  static private boolean jj_2_24(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_24(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(23, xla); }
  }

  static private boolean jj_2_25(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_25(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(24, xla); }
  }

  static private boolean jj_2_26(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_26(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(25, xla); }
  }

  static private boolean jj_2_27(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_27(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(26, xla); }
  }

  static private boolean jj_2_28(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_28(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(27, xla); }
  }

  static private boolean jj_3_19()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(CADENA)) return true;
    if (jj_scan_token(CIERRAETI)) return true;
    return false;
  }

  static private boolean jj_3_14()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(POSICION)) return true;
    if (jj_scan_token(POSY2)) return true;
    return false;
  }

  static private boolean jj_3_28()
 {
    if (jj_scan_token(30)) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_26()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  static private boolean jj_3_27()
 {
    if (jj_scan_token(TEXT)) return true;
    return false;
  }

  static private boolean jj_3_25()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_27()) {
    jj_scanpos = xsp;
    if (jj_3_28()) return true;
    }
    return false;
  }

  static private boolean jj_3_13()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(POSICION)) return true;
    if (jj_scan_token(POSX2)) return true;
    return false;
  }

  static private boolean jj_3_6()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(TEXTO)) return true;
    if (jj_scan_token(CIERRAETI)) return true;
    return false;
  }

  static private boolean jj_3_18()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(TIPO)) return true;
    if (jj_scan_token(CIERRAETI)) return true;
    return false;
  }

  static private boolean jj_3_24()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(FONDO)) return true;
    if (jj_scan_token(CIERRAETI)) return true;
    return false;
  }

  static private boolean jj_3_23()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(ANCHO)) return true;
    if (jj_scan_token(CIERRAETI)) return true;
    return false;
  }

  static private boolean jj_3_12()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(RADIO)) return true;
    if (jj_scan_token(CIERRAETI)) return true;
    return false;
  }

  static private boolean jj_3_5()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(LINEA)) return true;
    if (jj_scan_token(CIERRAETI)) return true;
    return false;
  }

  static private boolean jj_3_22()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(ALTO)) return true;
    if (jj_scan_token(CIERRAETI)) return true;
    return false;
  }

  static private boolean jj_3_11()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(COLOR)) return true;
    if (jj_scan_token(CIERRAETI)) return true;
    return false;
  }

  static private boolean jj_3_17()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(FUENTE)) return true;
    if (jj_scan_token(CIERRAETI)) return true;
    return false;
  }

  static private boolean jj_3_4()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(CIRCULO)) return true;
    if (jj_scan_token(CIERRAETI)) return true;
    return false;
  }

  static private boolean jj_3_10()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(POSICION)) return true;
    if (jj_scan_token(POSY)) return true;
    return false;
  }

  static private boolean jj_3_9()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(POSICION)) return true;
    if (jj_scan_token(POSX)) return true;
    return false;
  }

  static private boolean jj_3_21()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_22()) {
    jj_scanpos = xsp;
    if (jj_3_23()) {
    jj_scanpos = xsp;
    if (jj_3_24()) return true;
    }
    }
    return false;
  }

  static private boolean jj_3_3()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(RECTANGULO)) return true;
    if (jj_scan_token(CIERRAETI)) return true;
    return false;
  }

  static private boolean jj_3_2()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_3()) {
    jj_scanpos = xsp;
    if (jj_3_4()) {
    jj_scanpos = xsp;
    if (jj_3_5()) {
    jj_scanpos = xsp;
    if (jj_3_6()) return true;
    }
    }
    }
    return false;
  }

  static private boolean jj_3_8()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(ANCHO)) return true;
    if (jj_scan_token(CIERRAETI)) return true;
    return false;
  }

  static private boolean jj_3_16()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(FONDO)) return true;
    if (jj_scan_token(CIERRAETI)) return true;
    return false;
  }

  static private boolean jj_3_1()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(CABECERA)) return true;
    if (jj_scan_token(CIERRAETI)) return true;
    return false;
  }

  static private boolean jj_3_7()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(ALTO)) return true;
    if (jj_scan_token(CIERRAETI)) return true;
    return false;
  }

  static private boolean jj_3_15()
 {
    if (jj_scan_token(ABREETI)) return true;
    if (jj_scan_token(TAM)) return true;
    if (jj_scan_token(CIERRAETI)) return true;
    return false;
  }

  static private boolean jj_3_26()
 {
    if (jj_scan_token(TEXT)) return true;
    return false;
  }

  static private boolean jj_3_20()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_7()) {
    jj_scanpos = xsp;
    if (jj_3_8()) {
    jj_scanpos = xsp;
    if (jj_3_9()) {
    jj_scanpos = xsp;
    if (jj_3_10()) {
    jj_scanpos = xsp;
    if (jj_3_11()) {
    jj_scanpos = xsp;
    if (jj_3_12()) {
    jj_scanpos = xsp;
    if (jj_3_13()) {
    jj_scanpos = xsp;
    if (jj_3_14()) {
    jj_scanpos = xsp;
    if (jj_3_15()) {
    jj_scanpos = xsp;
    if (jj_3_16()) {
    jj_scanpos = xsp;
    if (jj_3_17()) {
    jj_scanpos = xsp;
    if (jj_3_18()) {
    jj_scanpos = xsp;
    if (jj_3_19()) return true;
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    }
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public textTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[0];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[28];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  /** Constructor with InputStream. */
  public text(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public text(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new textTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public text(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new textTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public text(textTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(textTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error { }
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[31];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 0; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 31; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 28; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
            case 4: jj_3_5(); break;
            case 5: jj_3_6(); break;
            case 6: jj_3_7(); break;
            case 7: jj_3_8(); break;
            case 8: jj_3_9(); break;
            case 9: jj_3_10(); break;
            case 10: jj_3_11(); break;
            case 11: jj_3_12(); break;
            case 12: jj_3_13(); break;
            case 13: jj_3_14(); break;
            case 14: jj_3_15(); break;
            case 15: jj_3_16(); break;
            case 16: jj_3_17(); break;
            case 17: jj_3_18(); break;
            case 18: jj_3_19(); break;
            case 19: jj_3_20(); break;
            case 20: jj_3_21(); break;
            case 21: jj_3_22(); break;
            case 22: jj_3_23(); break;
            case 23: jj_3_24(); break;
            case 24: jj_3_25(); break;
            case 25: jj_3_26(); break;
            case 26: jj_3_27(); break;
            case 27: jj_3_28(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
