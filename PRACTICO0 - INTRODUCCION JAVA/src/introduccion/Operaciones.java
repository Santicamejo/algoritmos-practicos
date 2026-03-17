package introduccion;

public class Operaciones implements IOperaciones {

    @Override
    public Retorno sumar(int x, int y) {
        Retorno ret = new Retorno(Retorno.Resultado.OK); 
        
        ret.valorEntero=x+y;
        
        return ret;
    }

    @Override
    public Retorno restar(int x, int y) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);    

        ret.valorEntero = x-y;
        
        return ret;
    }

    @Override
    public Retorno dividir(int x, int y) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);  
        
        ret.valorEntero = x/y;
        
        return ret;
    }

    @Override
    public Retorno multiplicar(int x, int y) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);  
        
        ret.valorEntero = x*y;
        
        return ret;
    }

    @Override
    public Retorno esMayor(int x, int y) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);   
        ret.valorbooleano=false;
        if(x > y){
            ret.valorbooleano=true;
        }
        
        return ret;
    }
    
}
