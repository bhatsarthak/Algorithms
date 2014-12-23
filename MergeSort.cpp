#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
 int* MergeSort(int array1[],int array[],int *merge,int size);
 int Merge(int InputArray[],int Length,int *MergeArray);
 static int count=0,size=0;
 main()
{
     int a[8],MergeArray[8];
     
   
   
     for (int i=0;i<8;i++)
     {
         
         {
         a[i]=rand();
         printf("%d \n %d \n",a[i],&a[i]);
         }   
        
         
     }
  Merge(a,8,MergeArray);
   getch();
   return 0;
}       

int Merge(int InputArray[],int Length,int* MergeArray)
{
 if (Length=1)
 return InputArray[0]; 
 
 else
 Length=(Length/2);
 int LeftArray[Length], RightArray[Length];
 for(int i=0;i<Length;i++)
 {
         LeftArray[i]=InputArray[i];
         printf("Left element of [%d] is %d \n",i,LeftArray[i]);
 }
  for(int i=Length/2;i<2*Length;i++)
 {
         LeftArray[i-Length]=InputArray[i];
 }
 Merge(LeftArray,Length,MergeArray);
 Merge(RightArray,Length,MergeArray);
 MergeSort(LeftArray,RightArray,MergeArray,Length);
 
 
}     
int* MergeSort(int array1[],int array2[],int *merge, int size)
{
       for(int i=0;i<4;i++)
       {
               for(int j=0;j<4;j++)
                   {
                       if(array1[i]<=array2[j])
                   { 
                        merge[count]=array1[i];
                        merge[count+1]=array2[j];
                    }
                    else
                    {
                       merge[count+1]=array1[i];
                        merge[count]=array2[j];
                    }
                       count++;
                    } 
                    }         
return merge;
}           
       
       
       
