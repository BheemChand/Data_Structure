#include<stdio.h>  
#include<stdlib.h>  
int main()
{  
  int n,*ptr,reverse=0;    
    printf("Enter number of elements: ");    
    scanf("%d",&n);    
    ptr=(int*)malloc(n*sizeof(int));  //memory allocated using malloc    
    if(ptr==NULL)                         
    {    
        printf("Sorry! unable to allocate memory");    
        exit(0);    
    }    
    printf("Enter elements of array: ");    
    for(int i=0;i<n;++i)    
    {

    }    
    free(ptr);     
return 0;  
}   