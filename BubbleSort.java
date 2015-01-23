import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BubbleSort {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        int pivot=ar[ar.length-1];
        int index=ar.length-2;
        while(index>-1){
            if(pivot<index){
                ar[index+1]=ar[index];  
            }
            index++;
           }//close while
          printArray(ar);  
        } //close method insertIntoSorted
           
   
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
