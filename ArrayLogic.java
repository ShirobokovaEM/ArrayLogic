
package javaapplication55;
import java.util.Arrays;
import java.util.Random;

public class ArrayLogic {
    
    private int[] baseArray;

    public ArrayLogic(int n, int bound) { 
        baseArray = new int[n];
        Random rnd = new Random();
        for (int i = 0; i < baseArray.length; i++) {
            baseArray[i] = rnd.nextInt(bound);              
        }  
       
    }    

    public ArrayLogic(int[] baseArray) {
        this.baseArray = baseArray;
    }
    
    public int getSum() {
        int s = 0;
        for (int i = 0; i < baseArray.length; i++) {
            s = s + baseArray[i];
        }
        return s;
    }
    
    public int bigPredidyshego(){
        int count = 0;
        for (int i = 0; i < baseArray.length - 1; i++) {
            if(baseArray[i] < baseArray[i + 1])
                count++;
        }
        return count;
    }
    
    public int kolichestvoX(int x){
        int count = 0;
        for (int i = 0; i < baseArray.length; i++) {
            if(baseArray[i] == x)
                count++;
        }
        return count;
    }
    
    public int perviinomerX(int x){
        int num = - 1;         
        for (int i = 0; i < baseArray.length; i++) {
            if(baseArray[i] == x){
                num = i;
                break;            
            }             
        }        
        return num;
    }
    
    public int lastnomerX(int x){
        int  number = - 1;
        for (int i = 0; i < baseArray.length; i++) {
            if(baseArray[i] == x) number = i;            
        }
        return number;
    }
    
    public int minIlement(){
        int min = baseArray[0];
        for (int i = 0; i < baseArray.length; i++) {
            if(baseArray[i] < min)
                min = baseArray[i];           
        }
        return min;
    }
    
    public int numberMax(){
        int max = baseArray[0],num = 0;
        for (int i = 0; i < baseArray.length; i++) {
            if(baseArray[i] > max){
                max = baseArray[i];
                num = i;
            }                       
        }
        return num;
    }
    
    public int kolichestvoMin(){
        int min = baseArray[0], count = 0;
        for (int i = 1; i < baseArray.length; i++) {
            if(baseArray[i] < min) {
                min = baseArray[i];
                count = 1;
            }
            else if (baseArray[i] == min) count++;
        }
        return count;
    }  
    
   
    
    public void bubbleSort(){
        int tmp;
        for (int i = 0; i < baseArray.length; i++) {
            for (int j = 0; j < baseArray.length - 1; j++) {
                if(baseArray[j] > baseArray[j + 1]){
                    tmp = baseArray[j];
                    baseArray[j] = baseArray[j + 1];
                    baseArray[j + 1] = tmp;
                }                
            }           
        }          
    }  
    

    @Override
    public String toString() {
        return Arrays.toString(baseArray);
    }
}

   
