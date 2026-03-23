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
            int largoV = v.length;
            for(int i=0; i<largoV; i++){
                ret.valorString = ret.valorString + v[i] + " ";
            }
        return ret;    
    }

    //Ejercicio 2
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
    
    //Precondicion: El array viene ordenado.
    @Override
    public Retorno maxvecV2(int[] v) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        //Le resto 1 a el largo del array porque si bien tiene 8 elementos, no existe la posicion 8 porque el array arranca en 0.
        ret.valorEntero = v[v.length -1];
        
        return ret;
    }

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

    @Override
    public Retorno minvecV2(int[] v) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        
        ret.valorEntero = v[0];
        
        return ret;
    }

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

    @Override
    public Retorno maxvecV2(int[] v, int desde, int hasta) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        // Aquí iría la lógica del mínimo v2
        return ret;
    }

    @Override
    public Retorno minvecV2(int[] v, int desde, int hasta) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        // Aquí iría la lógica del mínimo v2
        return ret;
    }

    
    @Override
    public Retorno posmaxvecV1(int[] v, int desde, int hasta) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        ret.valorEntero = desde;
        
        for(int i = desde +1; i<= hasta; i++){
            if(v[i] > v[ret.valorEntero]){
                ret.valorEntero = i;
            }
        }
        return ret;
    }

    @Override
    public Retorno posminvecV1(int[] v, int desde, int hasta) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        ret.valorEntero = desde;
        
        for(int i = desde +1; i<= hasta; i++){
            if(v[i] < v[ret.valorEntero]){
                ret.valorEntero = i;
            }
        }
        
        return ret;
    }

    
    @Override
    public Retorno posmaxvecV2(int[] v, int desde, int hasta) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        ret.valorEntero = hasta;
        return ret;
    }

    @Override
    public Retorno posminvecV2(int[] v, int desde, int hasta) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        ret.valorEntero = desde;
        return ret;
    }

    
    
    
    //Ejercicio 6
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
            i++;
        }
        
        return ret;
    }

    @Override
    public Retorno buscarvecV1(int[] v, int elemento, int desde, int hasta) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        ret.valorbooleano = false;
        int i = desde;
        
        while(i<hasta && !ret.valorbooleano){
            if(v[i] == elemento){
                ret.valorbooleano = true;
            }
            i++;
        }
        
        return ret;    
    }

    
    @Override
    public Retorno buscarvecV2(int[] v, int elemento) {
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

    @Override
    public Retorno buscarvecV2(int[] v, int elemento, int desde, int hasta) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        ret.valorEntero = -1;
        int i = desde;
        
        
        while(i<=hasta && ret.valorEntero == -1){
            if(v[i] == elemento){
                ret.valorEntero = i;
            }
            i++;
        }
        
        return ret;
    }

    
    
    
    
    
    
    @Override
    public Retorno buscarporposicion(int[] v, int elemento) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        
        return ret;
    }

    @Override
    public Retorno buscarporposicion(int[] v, int desde, int hasta, int elemento) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        // Aquí iría la lógica del mínimo v2
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
        
        for(int i = 0; i<largo; i++){
            ret.valorEntero = ret.valorEntero + v[i];
        }
        
        ret.valorEntero = ret.valorEntero / largo;
        
        return ret;    
    }

    
    
    
    
    
    //Ejercicio 8
    //Sin ordenar
    @Override
    public Retorno muestrovaloresimpares(int[] v) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        ret.valorString="";
        int largo = v.length;
        
        for(int i = 0; i<largo; i++){
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
        
        for(int i = 0; i<largo; i++){
            if(v[i]%2 == 0){
                ret.valorString += v[i];
            }
        }
        
        return ret;  
    }

    
    
    //Ordenado
    @Override
    public Retorno muestroposimpares(int[] v) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        ret.valorString="";
        int largo = v.length;
        
        for(int i = 0; i<largo; i++){
            if(i%2 != 0){
                ret.valorString += v[i];
            }
        }
        
        return ret;   
    }

    @Override
    public Retorno muestropospares(int[] v) {
        Retorno ret = new Retorno(Retorno.Resultado.IMPLEMENTADA);
        
        ret.valorString="";
        int largo = v.length;
        
        for(int i = 0; i<largo; i++){
            if(i%2 == 0){
                ret.valorString += v[i];
            }
        }
        
        return ret;    
    }

    //Ejercicio 9
    
    
    
    
    
    
// Ejercicio 10    
    @Override
    public Retorno ordenarvec(int[] v) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        
        ret.valorString = "";
        int largo = v.length;
        
        for(int i = 0; i<largo-1; i++){
            for(int j = 0;j==largo-1;j++){
                if(v[j]>){
                    
                }
            }
        }
        
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

    
}

