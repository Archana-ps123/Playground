#include<stdio.h>
int natural_num(int num);
int main() {
 int n;
  scanf("%d", &n);
  printf("%d",natural_num(n));
  	return 0;
}
int natural_num(int num){
  int sum = 0;
  for(int i = 0; i <= num; i++)
  {
    sum = sum + i;
  }
  return sum;
}