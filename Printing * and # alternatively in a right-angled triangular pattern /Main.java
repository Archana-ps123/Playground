#include <stdio.h>
int main(){
 int n, row, col, flag = 1;
  scanf("%d", &n);
  for(row = 1; row <= n; row++)
  {
    for(col = 1; col <= row; col++)
    {
      if(flag == 1)
      {
        printf("*");
      flag = 0;
      }
      else
      {
        printf("#");
      flag = 1;
      }
    }
  printf("\n");
  }
  	return 0;
}