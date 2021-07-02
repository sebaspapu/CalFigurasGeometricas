/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;
import java.util.Scanner;
/**
 *
 * @author SEBAS TU NEW PAPU
 */
public class Circulo extends Figura{
    
    Scanner valor = new Scanner(System.in);
        
    public Circulo(int radio){
        
        super(radio);
        
    }    
    
    public double Area(){
        
       double area = pi * (radio * radio);        
       return area;
       
    }
      
    public double Perimetro(){
        
        double perimetro = 2 * pi * radio;
        return perimetro;
        
    }
    
}
