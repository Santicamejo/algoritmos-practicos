package practico2.trabajar.con.vectores;

public class PRACTICO2TRABAJARCONVECTORES {

    public static void main(String[] args) {

        // TODO code application logic here
        Prueba p = new Prueba();
        Vectores vec = new Vectores();
        juegodeprueba(vec, p);

    }

    public static void juegodeprueba(Vectores vec, Prueba p) {
        int[] v = {6, 3, 5, 1, 8, 7, 2, 4};

        //Ejercicio 1
        p.ver(vec.mostrarv(v).resultado, Retorno.Resultado.IMPLEMENTADA, "vector original = " + vec.mostrarv(v).valorString);
        
        //Ejercicio 2
        p.ver(vec.maxvecV1(v).resultado, Retorno.Resultado.IMPLEMENTADA, "Valor maximo = " + vec.maxvecV1(v).valorEntero);
        p.ver(vec.maxvecV1(v).resultado, Retorno.Resultado.IMPLEMENTADA, "Valor maximo ordenado = " + vec.maxvecV2(v).valorEntero);

        //Ejercicio 3
        p.ver(vec.maxvecV1(v).resultado, Retorno.Resultado.IMPLEMENTADA, "Valor maximo ordenado = " + vec.minvecV1(v).valorEntero);
        p.ver(vec.maxvecV1(v).resultado, Retorno.Resultado.IMPLEMENTADA, "Valor maximo ordenado = " + vec.minvecV2(v).valorEntero);


        p.imprimirResultadosPrueba();
    }

}