#include <stdio.h>
int main() {
	int n, row, col;
  scanf("%d", &n);
  for(row = 1; row <= n; row++)
  {
    for(int space = 1; space <= n- row; space++)
    {
      printf(" ");
    }
    for(col = 1; col <= 2 * row - 1; col++)
    {
      printf("*");
    }
    printf("\n");
  }
	return 0;
}