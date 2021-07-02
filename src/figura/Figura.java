package figura;

/**
 *
 * @author SEBAS TU NEW PAPU
 */


    //clase padre

public class Figura {

   //atributos
    
    private int base;
    private int altura;
    protected double pi = 3.1415;
    protected int radio;
    
    //metodos 
    
    //constructores
    
    public Figura(){
        
    }
    
    public Figura(int base , int altura){
        
        this.base = base;
        this.altura = altura;
        
    }
    
    public Figura(int radio){
        
        this.radio = radio;
        
    }
        
    //gets y sets
        
//    public void setBase(int base){
//        
//    this.base = base;
//        
//    }
    
    public int getBase(){
        
        return base;
    }
    
//    public void setAltura(int altura){
//        
//        this.altura = altura;
//        
//    }
    
    public int getAltura(){
        
        return altura;
        
    }
    
   
    
}
