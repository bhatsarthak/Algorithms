 #include<stdio.h>
 #include<conio.h>
 #include<stdlib.h>
 #include<stdbool.h>
 typedef  struct node
 {
         void *data;
         struct node *link;
 }NODE;


typedef struct STACK
{
 int count;
 struct node* STACK_TOP;
}STACK;
 //bool push(NODE** pList,char datain);
 STACK* CreateStack();
 STACK* push(STACK* pStackTop,void* datainptr);
 STACK* pop(STACK* pStackTop);
 int main(void)
{    STACK* Top=CreateStack();

   int i=0,p=2,q=4,r=6;
   Top= push(Top,&i);
   i=10;
   Top= push(Top,&i);
   i=20;
   Top= push(Top,&i);
   i=40;
     Top= push(Top,&i);
   //  for(int i=0;i<10;i++)
//    {
//             printf("\n Top before push is %d and value of i is %d",Top,i);
//        Top= push(Top,&i);
//           // printf("\n Top after push is %d value of i si %d",Top,i);
//     }
     
     printf("\n\nEntering pop next Top after push is %d and address is %d",*(int*)(Top->STACK_TOP->data),Top->STACK_TOP);
     for(int j=0;j<3;j++)
     {
       Top= pop(Top);
    }
      getch();
      return 0;   
}    
STACK* CreateStack()
 {
      STACK *FirstStack;
      FirstStack=(STACK*)malloc(sizeof(STACK));
      if (FirstStack)
      { 
                FirstStack->count=0;
                FirstStack->STACK_TOP=NULL;
      }
      return FirstStack;         
 }
 
 STACK* push(STACK* pStackTop,void* datainptr)
 {
      NODE *StackNode;
      StackNode=(NODE*)malloc(sizeof(NODE));
     printf("\n Address of new node is %d and stack top is %d  and data input is \n"  ,*((int*)(StackNode->data)),*((int*)(datainptr)));
      if(StackNode)
      {  
    
     StackNode->data=datainptr;
       StackNode->link=pStackTop->STACK_TOP;
       pStackTop->STACK_TOP=StackNode; 
       pStackTop->count=pStackTop->count+1;
     printf("\n New stack top is %d and element in it is %d \n",pStackTop->STACK_TOP,*((int*)pStackTop->STACK_TOP->data));//,*((int*)pStackTop->count));
      return pStackTop;
       }
        return pStackTop;
}
STACK* pop(STACK* pStackTop)
{ printf("\n\n Top for pop is %d and address is %d",*(int*)(pStackTop->STACK_TOP->data),pStackTop->STACK_TOP);
     if (pStackTop->STACK_TOP)
     {
       NODE* PopNode;
       PopNode=pStackTop->STACK_TOP;
     //  printf("\n Elemnt in %d is %d",pStackTop,*((int*)pStackTop->STACK_TOP->data));
         printf("\n Elemnt in %d is %d",pStackTop->STACK_TOP->link,*((int*)pStackTop->STACK_TOP->data));
       pStackTop->STACK_TOP=PopNode->link;
       pStackTop->count=pStackTop->count-1;
     return pStackTop;
     } 
}
