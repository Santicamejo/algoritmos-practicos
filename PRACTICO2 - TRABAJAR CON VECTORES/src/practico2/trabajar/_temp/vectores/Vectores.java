/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2.trabajar._temp.vectores;
/**
 *
 * @author Sannti
 */
public class Vectores implements IVectores {

    
    //Ejercicio 1
    @Override
    public Retorno mostrarv(int[] v) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        ret.valorString = "";
        int largo = v.length;
        
        for(int i=0; i<largo; i++){
            if(i==largo-1){
                ret.valorString = ret.valorString + v[i];
            }
            else{
                ret.valorString = ret.valorString + v[i] + "-";
            }
        }
        return ret;    
    }

    
    //Ejercicio 2
    //Precondiciones: no vacio, no ordenado
    @Override
    public Retorno maxvecV1(int[] v) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        //Usamos Integer.MIN_VALUE para asignar un "Sentinel Value" un valor por defecto muy bajo asi nada puede ser menor a ello
        ret.valorEntero = Integer.MIN_VALUE;
        int largo = v.length;
        
        for(int i = 0; i<largo ; i++){
            if(v[i] > ret.valorEntero){    
                ret.valorEntero = v[i];
            }
        }
        
        return ret;
    }
    //Precondiciones: no vacio, ordenado asc
    @Override
    public Retorno maxvecV2(int[] v) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        //Le resto 1 a el largo del array porque si bien tiene 8 elementos, no existe la posicion 8 porque el array arranca en 0.
        ret.valorEntero = v[v.length -1];
        
        return ret;
    }

    
    //Ejercicio 3
    //Precondiciones: no vacio, no ordenado
    @Override
    public Retorno minvecV1(int[] v) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        
        ret.valorEntero = Integer.MAX_VALUE;
        int largo = v.length;
        
        for(int i = 0; i<largo ; i++){
            if(v[i] < ret.valorEntero){    
                ret.valorEntero = v[i];
            }
        }
        
        return ret;
    }
    //Precondiciones: no vacio, ordenado asc
    @Override
    public Retorno minvecV2(int[] v) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        
        ret.valorEntero = v[0];
        
        return ret;
    }


    //Ejercicio 4
    //Precondiciones: no vacio, no ordenado
    @Override
    public Retorno maxvecV1(int[] v, int desde, int hasta) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        ret.valorEntero = Integer.MIN_VALUE;
        
        for(int i = desde; i<= hasta; i++){
            if(v[i] > ret.valorEntero){
                ret.valorEntero = v[i];
            }
        }
        return ret;
    }
    //Precondiciones: no vacio, no ordenado
    @Override
    public Retorno minvecV1(int[] v, int desde, int hasta) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        ret.valorEntero = Integer.MAX_VALUE;
        
        for(int i = desde; i<= hasta; i++){
            if(v[i] < ret.valorEntero){
                ret.valorEntero = v[i];
            }
        }
        return ret;
    }
    //Precondiciones: no vacio, ordenado asc
    @Override
    public Retorno maxvecV2(int[] v, int desde, int hasta) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        ret.valorEntero = v[hasta];
        return ret;
    }
    //Precondiciones: no vacio, ordenado asc
    @Override
    public Retorno minvecV2(int[] v, int desde, int hasta) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        ret.valorEntero = v[desde];
        return ret;
    }

    
    
    
    //Ejercicio 5
    //Precondiciones: no vacio, no ordenado
    @Override
    public Retorno posmaxvecV1(int[] v, int desde, int hasta) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        ret.valorEntero = Integer.MIN_VALUE;
        
        for(int i = desde;i<hasta;i++){
            if(v[i] > ret.valorEntero){
                ret.valorEntero = i;
            }
        }
        return ret;
    }
    //Precondiciones: no vacio, no ordenado
    @Override
    public Retorno posminvecV1(int[] v, int desde, int hasta) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        ret.valorEntero = Integer.MAX_VALUE;
        
        for(int i = desde; i<= hasta; i++){
            if(v[i] < ret.valorEntero){
                ret.valorEntero = i;
            }
        }
        return ret;
    }

    //Precondiciones: no vacio, ordenado asc
    @Override
    public Retorno posmaxvecV2(int[] v, int desde, int hasta) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        ret.valorEntero = hasta;
        return ret;
    }
    //Precondiciones: no vacio, ordenado asc
    @Override
    public Retorno posminvecV2(int[] v, int desde, int hasta) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        ret.valorEntero = desde;
        return ret;
    }


    //Ejercicio 6
    //Precondiciones: no vacio, no ordenado
    @Override
    public Retorno buscarvecV1(int[] v, int elemento) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        ret.valorbooleano = false;
        int i = 0;
        int largo = v.length;
        
        while(i<largo && !ret.valorbooleano){
            if(v[i] == elemento){
                ret.valorbooleano = true;
            }
            //la decision de implementar el else es proque ya que el index tiene un scope mas amplio me gustaria por si las dudas conservas la posicion de donde encontre el elemento. ya que si encuentro el elemento sin el else igual se ejecuta el i++ y me queda corrido el index de donde esta el elemento.
            else{ 
                i++;
            }
        }
        return ret;
    }
    //Precondiciones: no vacio, no ordenado
    //En este caso devuelvo si se encontro el elemento y su posicion
    @Override
    public Retorno buscarvecV1(int[] v, int elemento, int desde, int hasta) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        ret.valorbooleano = false;
        ret.valorEntero = -1;
        int i = desde;
        
        while(i<=hasta && !ret.valorbooleano){
            if(v[i] == elemento){
                ret.valorbooleano = true;
                ret.valorEntero = i;
            }
            i++;
        }
        return ret;    
    }
    //Precondiciones: no vacio, ordenado asc
    @Override
    public Retorno buscarvecV2(int[] v, int elemento) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        ret.valorbooleano = false;
        int i = 0;
        int largo = v.length;
        
        while(i<largo && !ret.valorbooleano && v[i] <= elemento){
            if(v[i] == elemento){
                ret.valorbooleano = true;
            }
            i++;
        }
        return ret;
    }
    //Precondiciones: no vacio, ordenado asc
    @Override
    public Retorno buscarvecV2(int[] v, int elemento, int desde, int hasta) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        ret.valorEntero = -1;
        int i = desde;
        
        while(i<=hasta && ret.valorEntero == -1 && v[i] <= elemento){
            if(v[i] == elemento){
                ret.valorEntero = i;
            }
            i++;
        }
        return ret;
    }
    //Precondiciones: no vacio, no ordenado
    @Override
    public Retorno buscarporposicion(int[] v, int elemento) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        ret.valorEntero = -1;
        int i = 0;
        int largo = v.length;
        
        while(i<largo && ret.valorEntero == -1){
            if(v[i] == elemento){
                ret.valorEntero = i;
            }
            i++;
        }
        return ret;   
    }
    //Precondiciones: no vacio, ordenado
    @Override
    public Retorno buscarporposicion(int[] v, int desde, int hasta, int elemento) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        ret.valorbooleano = false;
        ret.valorEntero = -1;
        int i = desde;
        
        while(i<=hasta && !ret.valorbooleano){
            if(v[i] == elemento){
                ret.valorbooleano = true;
                ret.valorEntero = i;
            }
            i++;
        }
        return ret;     
    }

    @Override
    public Retorno buscarporpuntomedio(int[] v, int elemento) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
            // Aquí iría la lógica del mínimo v2
        return ret;    
    }


    //Ejercicio 7
    @Override
    public Retorno promedio(int[] v) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        ret.valorEntero = 0;
        int largo = v.length;
        
        for(int i = 0; i<largo-1; i++){
            ret.valorEntero = ret.valorEntero + v[i];
        }
        
        ret.valorEntero = ret.valorEntero / largo;
        
        return ret;    
    }

    
    //Ejercicio 8
    @Override
    public Retorno muestrovaloresimpares(int[] v) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        ret.valorString="";
        int largo = v.length;
        
        for(int i = 0; i<largo-1; i++){
            if(v[i]%2 != 0){
                ret.valorString += v[i];
            }
        }
        return ret;
    }
    @Override
    public Retorno muestrovalorespares(int[] v) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        ret.valorString="";
        int largo = v.length;
        
        for(int i = 0; i<largo-1; i++){
            if(v[i]%2 == 0){
                ret.valorString += v[i];
            }
        }
        return ret;  
    }

    
    //Ejercicio 9
    @Override
    public Retorno muestroposimpares(int[] v) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        ret.valorString="";
        int largo = v.length;
        
        for(int i = 0; i<largo-1; i++){
            if(i%2 != 0){
                ret.valorString += i;
            }
        }
        return ret;   
    }
    @Override
    public Retorno muestropospares(int[] v) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        ret.valorString="";
        int largo = v.length;
        
        for(int i = 0; i<largo-1; i++){
            if(i%2 == 0){
                ret.valorString += i;
            }
        }
        return ret;    
    }
    
    
    // Ejercicio 10    
    @Override
    public Retorno ordenarvec(int[] v) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);        
        
        
        
        ret.valorString = mostrarv(v).valorString;
        
        return ret;    
    }
    
    
    // Ejercicio 11   
    @Override
    public Retorno unirvectores(int[] v1, int[] v2) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        // Aquí iría la lógica del mínimo v2
        return ret;    
    }
    
    
    // Ejercicio 12   
    @Override
    public Retorno mayoresV(int[] v) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        // Aquí iría la lógica del mínimo v2
        return ret;    
    }

    //Ejercicio 13
    @Override
    public Retorno ordenarPorMaximoMinimo(int[] v) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);

        int posValorMinimo, posValorMaximo, aux;
        int i = 0;
        int j = v.length-1;
        
        while(i<j){
        
            posValorMaximo = posmaxvecV1(v, i, j).valorEntero;
            aux = v[j];
            v[j] = v[posValorMaximo];
            v[posValorMaximo] = aux;
        
            posValorMinimo = posminvecV1(v, i, j).valorEntero;
            aux = v[i];
            v[i] = v[posValorMinimo];
            v[posValorMinimo] = aux;
        
            i++;
            j--;
        
        }
        
        ret.valorString = mostrarv(v).valorString;

        return ret;    
    }
}

