#include<stdio.h>
#include<conio.h>
//prototype statements
void towers(int n, char source,char destination,char auxiliary);
int main(void)
{
      int numDisks;
      printf("Enter the number of disks");
      scanf("%d",&numDisks);
      printf("Starting tower of Hannoi");
      towers(numDisks,'A','C','B');
      getch();
      return 0;
}
void towers(int n,char source,char destination,char auxiliary)
{
     static int step=0;
     if (n==1)
        printf("\t\t\t Step %3d:Move from %c to %c \n",++step,source,destination);
     else
     {
        towers(n-1,source,auxiliary,destination);
     printf("\t\t\t Step %3d:Move from %c to %c \n",++step,source,destination);
       towers(n-1,auxiliary,destination,source);
     } 
    return;
}         
