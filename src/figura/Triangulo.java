/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author SEBAS TU NEW PAPU
 */
public class Triangulo extends Figura{
    
    private int lado; 
    
    
    public Triangulo(int ba, int as){
        super(ba,as);
        
    }
    
    public Triangulo(int ba, int as, int l){
        
        super(ba,as);
        this.lado = l;
        
    }
    
    
    public double ar(){
        
       int are = (getBase() *getAltura())/2;
        
       return are;
       
    }
    
    public double pe(){
        
        int per = getBase()+ getAltura() + lado;
        
        return per;
        
    }
    
    
    
    
}
