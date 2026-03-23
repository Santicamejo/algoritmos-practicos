package practico2.trabajar._temp.vectores;

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

        //Ejercicio 4
        p.ver(vec.maxvecV1(v, 1, 5).resultado, Retorno.Resultado.IMPLEMENTADA, "Valor maximo con parametros esperado es " + vec.maxvecV1(v, 1, 5).valorEntero);
        p.ver(vec.minvecV1(v, 1, 5).resultado, Retorno.Resultado.IMPLEMENTADA, "Valor minimo con parametros esperado es " + vec.minvecV1(v, 1, 5).valorEntero);

        //Ejercicio 5
        //V1 Arr no vacio y no ordenado
        p.ver(vec.posmaxvecV1(v, 1, 5).resultado, Retorno.Resultado.IMPLEMENTADA, "Posicion esperada es " + vec.posmaxvecV1(v, 1, 5).valorEntero);
        p.ver(vec.posminvecV1(v, 1, 5).resultado, Retorno.Resultado.IMPLEMENTADA, "Posicion esperada es " + vec.posminvecV1(v, 1, 5).valorEntero);
        
        //V2 Arr no vacio y ordenado asc
        p.ver(vec.posmaxvecV2(v, 1, 5).resultado, Retorno.Resultado.IMPLEMENTADA, "Posicion esperada es " + vec.posmaxvecV2(v, 1, 5).valorEntero);
        p.ver(vec.posminvecV2(v, 1, 5).resultado, Retorno.Resultado.IMPLEMENTADA, "Posicion esperada es " + vec.posminvecV2(v, 1, 5).valorEntero);
        
        
        //Ejercicio 6
        //Caso 1 retornar bool si se encuentra
        p.ver(vec.buscarvecV1(v, 1).resultado, Retorno.Resultado.IMPLEMENTADA, "Se encontro? " + vec.buscarvecV1(v, 1).valorbooleano);
        p.ver(vec.buscarvecV1(v, 50, 1, 5).resultado, Retorno.Resultado.IMPLEMENTADA, "Se encontro? " + vec.buscarvecV1(v, 50, 1, 5).valorbooleano);
        p.ver(vec.buscarvecV2(v, 1).resultado, Retorno.Resultado.IMPLEMENTADA, "Posicion " + vec.buscarvecV2(v, 1).valorEntero);
        p.ver(vec.buscarvecV2(v, 12, 1, 5).resultado, Retorno.Resultado.IMPLEMENTADA, "Posicion " + vec.buscarvecV2(v, 12, 1, 5).valorEntero);
        

        //Ejercicio 7
        p.ver(vec.promedio(v).resultado, Retorno.Resultado.IMPLEMENTADA, "Promedio " + vec.promedio(v).valorEntero);
        
        
        //Ejercicio 8
        //sin ordenar
        p.ver(vec.muestrovaloresimpares(v).resultado, Retorno.Resultado.IMPLEMENTADA, "Impares " + vec.muestrovaloresimpares(v).valorString);
        p.ver(vec.muestrovalorespares(v).resultado, Retorno.Resultado.IMPLEMENTADA, "Pares " + vec.muestrovalorespares(v).valorString);
        
        //Ejercicio 9
        p.ver(vec.muestroposimpares(v).resultado, Retorno.Resultado.IMPLEMENTADA, "Numeros en posiciones impares " + vec.muestroposimpares(v).valorString);
        p.ver(vec.muestropospares(v).resultado, Retorno.Resultado.IMPLEMENTADA, "Numeros en posiciones pares " + vec.muestropospares(v).valorString);
        
        //Ejercicio 10
        
        
        
        //Ejercicio 11
        
        //Ejercicio 12
        
        
        //13 Ordenar Vector max-min
        System.out.println("Vector original: " + java.util.Arrays.toString(v));
        p.ver(vec.ordenarPorMaximoMinimo(v).resultado, Retorno.Resultado.IMPLEMENTADA, "Numeros en posiciones pares " + vec.ordenarPorMaximoMinimo(v).valorString);

    }

}