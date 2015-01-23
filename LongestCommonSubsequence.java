import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       String str1=new String();
       Scanner stdin = new Scanner(System.in);
      
       String strlen=stdin.nextLine();
       String[] strlen1=new String[2];
       strlen1=strlen.split(" ");
       
       int m=Integer.parseInt(strlen1[0]);
       int n=Integer.parseInt(strlen1[1]);
      
       int[][] c=new int[m+1][n+1];
       String[][] s=new String[m+1][n+1];
       for(int i=0;i<n;i++){
           c[0][i]=0;
       } 
       
       for(int i=1;i<m;i++){
           c[i][0]=0;
       } 
       
       String X=stdin.nextLine();
       String Y=stdin.nextLine();

        String[] arrx=new String[m];
        int[] x=new int[m];
        
        String[] arry=new String[n];
        int[] y=new int[n];        
     
        arrx=X.split(" ");
        for(int i=0;i<m;i++){
               x[i]=Integer.parseInt(arrx[i]);
           }         
        
        arry=Y.split(" ");
        for(int i=0;i<n;i++){
               y[i]=Integer.parseInt(arry[i]);
           } 
         //Dynamic algorithm login begins here....
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(x[i-1]==y[j-1]){
                    c[i][j]=c[i-1][j-1]+1;
                    s[i][j]="d";
                }
                else if(c[i-1][j]>c[i][j-1]) {
                    c[i][j]=c[i-1][j];
                    s[i][j]="t";
               }
                else{
                	c[i][j]=c[i][j-1];
                	s[i][j]="l";
                }
            }
        }
        
      //  System.out.println(c[m][n]);
        PrintLcs(s,m,n,x);

    } 
    
  public static  void PrintLcs(String c[][],int i,int j,int x[]){
    	if(i==0 || j==0){
    		return;
    	}
    	if(c[i][j].toString().equals("d")){
    		PrintLcs(c,i-1,j-1,x);
    		System.out.print(x[i-1]+" ");
    	}
    	else if(c[i][j].toString().equals("t")){
    		PrintLcs(c,i-1,j,x);
    	}
    	else{
    		PrintLcs(c,i,j-1,x);
    	}
    }
}