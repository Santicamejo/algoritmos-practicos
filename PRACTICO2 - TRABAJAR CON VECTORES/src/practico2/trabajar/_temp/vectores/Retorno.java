package practico2.trabajar._temp.vectores;

public class Retorno {
    
    public enum Resultado {
        OK, ERROR_1, ERROR_2, ERROR_3, ERROR_4, ERROR_5, NO_IMPLEMENTADA, IMPLEMENTADA
    }
//   int cantCorrectas=0;
//   int cantIncorrectas=0;
//   int cantNoImplementadas=0;

    int valorEntero;
    String valorString;
    boolean valorbooleano;
    Resultado resultado;
    

    public Retorno(Resultado resultado) {
        this.resultado = resultado;
    }

    public Retorno(Resultado resultado, String valorString) {
        this.resultado = resultado;
    }

    public static Retorno noImplementada() {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }
    public static Retorno Implementada() {
        return new Retorno(Resultado.IMPLEMENTADA);
    }
    public static Retorno ok() {
        return new Retorno(Resultado.OK);
    }

    public static Retorno ok(String valorString) {
        return new Retorno(Resultado.OK, valorString);
    }

    public static Retorno error1() {
        return new Retorno(Resultado.ERROR_1);
    }

    public static Retorno error2() {
        return new Retorno(Resultado.ERROR_2);
    }

    public static Retorno error3() {
        return new Retorno(Resultado.ERROR_3);
    }

    public static Retorno error4() {
        return new Retorno(Resultado.ERROR_4);
    }

    public static Retorno error5() {
        return new Retorno(Resultado.ERROR_5);
    }

//METODOS AGREGADOS PARA LA PRUEBA
    static int cantCorrectas, cantIncorrectas, cantNoImplementadas;

    public static void inicializarResultadosPrueba() {
        cantCorrectas = cantIncorrectas = cantNoImplementadas = 0;
    }

    public static void imprimirResultadosPrueba() {
        System.out.println();
        System.out.println("  +------------------------------+");
        System.out.println("    RESULTADOS DE LA PRUEBA    ");
        System.out.println("    Pruebas Correctas: " + cantCorrectas);
        System.out.println("    Pruebas Incorrectas: " + cantIncorrectas);
        System.out.println("    Pruebas NI: " + cantNoImplementadas);
        System.out.println("  +------------------------------+");
        System.out.println();
    }

}



