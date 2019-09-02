#include <stdio.h>
int main() {
	int n, row, col;
  scanf("%d", &n);
  for(row = 1; row <= n; row++)
  {
    for(col = 1;col <= n;col++)
    {
      if(((row % 2 == 0) && (col == 1)) || ((row % 2 != 0) && (col == n)))
      {
        printf("%d", row + 1);
      }
      else
      {
        printf("%d", row);
      }
    }
    printf("\n");
  }
	return 0;
}