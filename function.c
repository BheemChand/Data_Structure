#include<stdio.h>
int reverse(int n)
{
 reverse=0, rem;    
printf("Enter a number: ");    
  scanf("%d", &n);    
  while(n!=0)    
  {    
     rem=n%10;    
     reverse=reverse*10+rem;    
     n/=10;    
  }    
  printf("Reversed Number: %d",reverse);    

return reverse;
}
int main()
{
    reverse();
    return 0;
}