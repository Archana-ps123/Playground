#include<stdio.h>
int power(int exponent,int base);
int main(){
  int base,exponent;
  scanf("%d%d",&base,&exponent);
  printf("%d",power(base,exponent));
   	return 0;
}
int power(int base,int exponent)
{
  int result = 1;
  while(exponent >= 1)
  {
    result = result * base;
    exponent--;
  }
  return result;
}