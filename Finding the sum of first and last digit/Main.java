#include <stdio.h>
int main() {
	int n , temp, ld, fd;
  scanf("%d", &n);
  temp = n;
  int sum = 0;
  ld = n % 10;
  while (n >= 10)
  {
    n = n / 10;
  }
  fd = n;
  sum = ld + fd;
  printf("%d", sum);
	return 0;
}