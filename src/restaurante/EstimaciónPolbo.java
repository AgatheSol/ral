
package restaurante;


public class EstimaciónPolbo {
    
    private int clientes;
    private int polbo,patacas;
    
    
    public EstimaciónPolbo(){
        polbo =0;
        patacas=0;
        clientes=0;
    }
    
    public EstimaciónPolbo(int pol,int pat,int cli){
         polbo = pol;
         patacas = pat;
         clientes = cli;
    }

    public void EngadirPolbo(int polbo) {
        this.polbo = polbo;
    }

    public void EngadirPatacas(int patacas) {
        this.patacas = patacas;
    }

    public void getClientes() {
        System.out.println(" A cantidade de clientes que pode recibir o restaurante e "+(polbo/2)*3);
               
    }
       
    public void AmosarPolbo(int polbostotales){
        polbo = polbostotales+polbo;
    }
    public void AmosarPatacas(int patacastotales){
        patacas = patacastotales+patacas;
        
    }
    public void Mostralotodo (){
        System.out.println(" A cantidade total de polbos e "
                + "" + polbo + " A cantidade de patacas do almacen e de "
                + ""+ patacas);
    }
}
