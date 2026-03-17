package introduccion;

/**
 *
 * @author sm116
 */
public class introduccion {
        
    public static void main(String[] args) {
        Prueba p = new Prueba();
        Operaciones o = new Operaciones();
        juegodeprueba(o,p);
    }
    
    public static void juegodeprueba(Operaciones o, Prueba p){
        p.ver(o.sumar(3, 4).resultado, Retorno.Resultado.OK, "3 + 4 = " + o.sumar(3, 4).valorEntero);
        p.ver(o.restar(3, 4).resultado, Retorno.Resultado.OK, "3 - 4 = " + o.restar(3, 4).valorEntero);
        p.ver(o.dividir(7, 4).resultado, Retorno.Resultado.OK, "7 + 4 = " + o.sumar(7, 4).valorEntero);
        p.ver(o.multiplicar(3, 4).resultado, Retorno.Resultado.OK, "3 * 4 = " + o.multiplicar(3, 4).valorEntero);
        p.ver(o.esMayor(8, 4).resultado, Retorno.Resultado.OK, "8 es mayor que 4? = " + o.esMayor(8, 4).valorbooleano);

        p.imprimirResultadosPrueba();
    }  
           
}
