package practico2.trabajar.con.vectores;

public interface IVectores {
    
//Ejercicio1    
    public Retorno mostrarv(int[] v);

//Ejercicio 2
    //PRECONDICION: EL VECTOR NO ES VACIO, NO ORDENADO   
    public Retorno maxvecV1(int[] v);

    //PRECONDICION: EL VECTOR NO ES VACIO, ES ORDENADO  
    public Retorno maxvecV2(int[] v);

//Ejercicio 3
    //PRECONDICION: EL VECTOR NO ES VACIO, NO ORDENADO   
    public Retorno minvecV1(int[] v);

    //PRECONDICION: EL VECTOR NO ES VACIO, ES ORDENADO  
    public Retorno minvecV2(int[] v);

    //Ejercicio 4 parte a
    //desde<hasta
    //desde>=0
    // desde < v.length
    //hasta < v.length
    //v no esta ordenado y no es vacio
    public Retorno maxvecV1(int[] v, int desde, int hasta);

    public Retorno minvecV1(int[] v, int desde, int hasta);

    //Ejercicio 4 parte b
    //desde<hasta
    //desde>=0
    // desde < v.length
    //hasta < v.length
    //v ordenado ASC y no es vacio
    public Retorno maxvecV2(int[] v, int desde, int hasta);

    public Retorno minvecV2(int[] v, int desde, int hasta);

    // Ejercicio 5
    //desde<hasta
    //desde>=0
    // desde < v.length
    //hasta < v.length
    //v no esta ordenado y no es vacio
    public Retorno posmaxvecV1(int[] v, int desde, int hasta);

    public Retorno posminvecV1(int[] v, int desde, int hasta);

//desde<hasta
    //desde>=0
    // desde < v.length
    //hasta < v.length
    //v ordenado ASC y no es vacio        
    public Retorno posmaxvecV2(int[] v, int desde, int hasta);

    public Retorno posminvecV2(int[] v, int desde, int hasta);

    //Ejercicio 6
    //desde<hasta
    //desde>=0
    // desde < v.length
    //hasta < v.length
    //v no ordenado y no es vacio       
    public Retorno buscarvecV1(int[] v, int elemento);

    public Retorno buscarvecV1(int[] v, int elemento, int desde, int hasta);

    //desde<hasta
    //desde>=0
    // desde < v.length
    //hasta < v.length
    //v ordenado ASC y no es vacio         
    public Retorno buscarvecV2(int[] v, int elemento);

    public Retorno buscarvecV2(int[] v, int elemento, int desde, int hasta);

    //desde<hasta
    //desde>=0
    // desde < v.length
    //hasta < v.length
    //v ordenado ASC y no es vacio         
    public Retorno buscarporposicion(int[] v, int elemento);

    public Retorno buscarporposicion(int[] v, int desde, int hasta, int elemento);

    // otra forma de busqueda utilizando el punto medio (biparticion)
    // El vector debe estar ordenado.
    public Retorno buscarporpuntomedio(int[] v, int elemento);    
    
    //EJERCICIO 7
    public Retorno promedio(int[] v);

    //   Ejercicio 8 
    public Retorno muestrovaloresimpares(int v[]);

    public Retorno muestrovalorespares(int v[]);

    //Ejercicio 9 
    public Retorno muestroposimpares(int v[]);

    public Retorno muestropospares(int v[]);

   //Ejercicio 10 
    public Retorno ordenarvec(int[] v);

    //Ejercicio 11 
    public Retorno unirvectores(int[] v1, int[] v2);

    //Ejercicio 12 
    public Retorno mayoresV(int[] v);

}