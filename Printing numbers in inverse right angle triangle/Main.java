#include <stdio.h>
int main() {
    int n, row, col;
  scanf("%d", &n);
  int val = n;
  for(row = 1; row <= n; row++)
  {
    for(col = val; col >= 1; col--)
    {
      printf("%d", col);
    }
    val--;
    printf("\n");
  }
	return 0;
}