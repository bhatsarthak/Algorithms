#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
typedef struct node
{
       void * data;
     struct  node * link;
}NODE;

NODE* CreateNode(void* value)
{
     NODE* nodeptr;
     nodeptr= (NODE*)malloc(sizeof(node));
     nodeptr->data=value;
     nodeptr->link=NULL;
     return nodeptr;
}
int main(void)
{
  int* Node1Element=(int*)(malloc(sizeof(int)));
  int* Node2Element=(int*)malloc(sizeof(int));
  *Node1Element=5;
  *Node2Element=10;
  NODE* Node1=CreateNode(Node1Element);
  NODE* Node2=CreateNode(Node2Element);
  Node1->link=Node2;
  int *var=(int*)(Node1->data);
  printf("Node1 element and address is %d ",*var);
   int *var2=(int*)(Node2->data);
   printf("Node1 element and address is %d ",*var2);
 // *Node1Element=*(Node1->data);
  getch();
  return 0;
}   
