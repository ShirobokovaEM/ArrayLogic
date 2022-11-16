
package javaapplication55;
public class JavaApplication55 {   
   
    public static void main(String[] args) {          
        
        ArrayLogic a1 = new ArrayLogic(10, 3); 
        System.out.println(a1);
        System.out.println(a1.getSum());        
        System.out.println( );        
        
        System.out.println(a1.bigPredidyshego());
        System.out.println( );        
        
        System.out.println(a1.kolichestvoX(1));
        System.out.println( );           
        
        int num = a1.perviinomerX(1);
        if(num == - 1) System.out.println("net takogo chisla");
        else System.out.println("Porydkovii nomer first number " + num);
        System.out.println( );       
        
        int number = a1.lastnomerX(1);
        if(number == - 1) System.out.println("net takogo chisla");
        else System.out.println("porydkovii nomer poslednego chisla x " + number);
        System.out.println( );        
        
        System.out.println(a1.minIlement());
        System.out.println( );        
        
        System.out.println(a1.numberMax());
        System.out.println( );        
        
        System.out.println(a1.kolichestvoMin());
        System.out.println( );
        
        a1.bubbleSort();
        System.out.println(a1);
    }     
    
}
