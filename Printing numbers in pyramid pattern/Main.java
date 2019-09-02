#include <stdio.h>
int main() {
	int n, col, row;
  scanf("%d", &n);
  int val = 1;
  for(row = 1; row <= n; row++)
  {
    for(int space = 1; space <= n - row; space ++)
    {
      printf(" ");
    }
    for(col = 1; col <= row; col++)
    {
      printf("%d ", val);
      val++;
    }
    printf("\n");
  }
	return 0;
}