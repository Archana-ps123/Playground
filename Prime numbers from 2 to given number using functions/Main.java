#include<stdio.h>
int prime_num(int n);
int main(){
  int n;
  scanf("%d",&n);
  for(int i = 2; i <= n; i++)
  {
    if(prime_num(i))
      {
      printf("%d\n",i);
    }
  }
    
    return 0;
}
int prime_num(int n)
{
  int flag = 1;
  for(int num = 2; num <= n / 2; num++)
  {
    if(n % num == 0)
    {
     flag = 0;
      break;
    }
  }
  return flag;
}