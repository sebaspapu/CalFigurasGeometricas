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
public class Cuadrado extends Rectangulo{
    
    private int area;
    private int perimetro;
    
    public Cuadrado(int base1, int Altura2){
        
        super(base1, Altura2);
        
    }
    
    public int Area(){
        
        if (getBase() == getAltura()){
            
            area = getBase() * getAltura();
            
        }else if (getBase() != getAltura()){
            
            System.out.println("Lo sentimos la base y la Altura son diferentes"+
                    "\nPor ende no es un cuadrado!");
        }
        
        return area;
    }
    
    
    public int perime(){
         if (getBase() == getAltura()){
            
            perimetro = getBase() +getBase() + getAltura()+ getAltura();
            
        }else if (getBase() != getAltura()){
            
            System.out.println("Lo sentimos la base y la Altura son diferentes"+
                    "\nPor ende no es un cuadrado!");
        }
        
        return perimetro;                
        
    }
    
}
