package figura;
import java.util.Scanner;
/**
 *
 * @author SEBAS TU NEW PAPU
 */
public class Calculos {
    
    Scanner valor = new Scanner(System.in);
    
    public void circulo(){
        
        System.out.print("Ingrese El radio: ");
        int r = valor.nextInt();                
        Circulo C = new Circulo(r);
        int opcion;        
        
        do{
            
            System.out.println("\nQue le gustaria hacer con el radio ingresado: "+
                    "\n1. calcule el area solamente"+
                    "\n2. calcule el perimetro solamente"+
                    "\n3. calcule el area y el perimetro"+
                    "\n4. salir");
            
            opcion = valor.nextInt();
            
            if(opcion == 1){
                
               System.out.println("\nEl area es: "+C.Area());
                
            }else if(opcion ==2){
                System.out.println("\nEl area es: "+C.Perimetro());
                
            }else if(opcion ==3){
                
                System.out.print("\nEl area es: "+C.Area());
               System.out.print("\nEl area es: "+C.Perimetro());
               
            }else if(opcion < 0 || opcion > 3){
                
                System.out.println("\nIngrese una opcion valida\n");
                
            }
//            switch(opcion){
//                
//                case 1:C.Area();
//                break;
//                case 2:C.Perimetro();
//                break;
//                case 3:C.Area();C.Perimetro();
//                break;
//                case 4: System.out.println("Ingrese una opcion valida");
//                break;
//            }
            
        }while(opcion != 4);
                
    }
    
    public void Rectangulo(){
        
        System.out.print("Ingrese la base: ");
        int bas = valor.nextInt();
        System.out.print("Ingrese la Altura: ");
        int alt= valor.nextInt();
                
        Rectangulo rec = new Rectangulo(bas,alt);
        
        System.out.println("EL Area es: "+rec.AreaR());
        System.out.println("El perimetro: "+rec.perimetroR());
        
    }
    
    public void Cuadrado(){
    
            System.out.print("Ingrese la base: ");
            int base1 = valor.nextInt();
            System.out.print("Ingrese la Altura: ");
            int Altur= valor.nextInt();
            int opcion;
            
            Cuadrado C2 = new Cuadrado(base1,Altur);                       
            
            do{
                
                System.out.println("\nIngrese la opcion:"
                        + "\n1.Calcular Area Y Perimetro"                        
                        + "\n2.salir");
                opcion = valor.nextInt();
                
                switch(opcion){                    
                                          
                    case 1:     
                    
                        if(C2.Area() != 0){
                        System.out.println("\nEL AREA DEL CUADRADO ES: "+C2.Area());
                
                        if(C2.perime() != 0){
                        System.out.println("\nEL PERIMETRO DEL CUADRADO ES: "+C2.perime());
                        }
                        }
                        
                        break;
                        
                    case 2:
                        
                        System.out.println("La opcion es Invalida");
                }
                
            }while(opcion != 2);
                                    
}
    
    public void Triangulo(){
        
        int opcion;
                
        do{
            
            System.out.println("\nOpciones:"
            +"\n1.Cal. Area"
            +"\n2.Cal. Perimetro"
            +"\n3.salir.");
            
            opcion = valor.nextInt();
            
            switch(opcion){
                
                case 1:
                    
                    System.out.print("Ingrese la base: ");
                    int b = valor.nextInt();
                    System.out.print("Ingrese la altura: ");
                    int a= valor.nextInt();
                    Triangulo t = new Triangulo(b,a);
                    
                    System.out.print("El Area es: "+t.ar());
                    
                break;
                
                case 2:
                    
                    System.out.print("Ingrese la base: ");
                    int b2 = valor.nextInt();
                    System.out.print("Ingrese la altura: ");
                    int a2= valor.nextInt();
                    System.out.print("Ingrese el lado faltante: ");
                    int l2 = valor.nextInt();
                    Triangulo t2 = new Triangulo(b2,a2,l2);
                    
                    System.out.print("\nEl Area es: "+t2.pe());
                    
                    break;
            }
            
        }while(opcion!=3);
        
    }    
    
    public static void main(String args[]){
        
        Scanner valor = new Scanner(System.in);
        
        Calculos C = new Calculos();
        int opcion ;
         do{
                
                System.out.println("\nIngrese una opcion:"
                        + "\n1.Cuadrado"
                        + "\n2.Circulo"
                        + "\n3.Rectangulo"
                        + "\n4.Triangulo"
                        + "\n5.salir");
                
                opcion = valor.nextInt();
                
                switch(opcion){
        
                    case 1:C.Cuadrado();
                    
                    break;
        
                    case 2:C.circulo();
                    
                    break;
                    
                    case 3:C.Rectangulo();
                    
                    break;
                    
                    case 4:C.Triangulo();
                    
                    break;
                    
                    case 5:System.out.println("Saliendo..");
        }                
                
            }while(opcion != 5);
         
    }
        
}