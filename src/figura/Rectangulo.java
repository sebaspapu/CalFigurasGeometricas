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
public class Rectangulo extends Figura {
    
        Scanner valores = new Scanner(System.in);
        
        
        public Rectangulo(int base ,int  altura){
        
        super(base,altura);
                
        }
        
        public int AreaR(){
            
            int area = getBase() * getAltura();
            
            return area;
            
        }
        
        public int perimetroR(){
            
            int perim = (2* getBase())+(2*getAltura());
            
            return perim;
        }
        
        
        
//    
//    
//    public int v (){
//        
//        System.out.println("Ingrese el numero 1");
//        int num1 = valores.nextInt();
//        //fig.setBase(num1);
//        setBase(num1);
//        
//        
//        System.out.println("Ingrese el numero 2");
//        int num2 = valores.nextInt();
//        //fig.setBase(num2);
//        setAltura(num2);
//        
//        int suma = getBase() + getAltura();
//        
//        System.out.println("el resultado es : "+suma);
//        return suma;
//        
//    }
//    
//    public static void main(String args[]){
//        
//        Rectangulo u = new Rectangulo();
//        
//        u.v();
//        
//        
//    }
    
    
}
