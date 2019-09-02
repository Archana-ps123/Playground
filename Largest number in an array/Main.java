#include<stdio.h>
int main()
{
  int size;
  scanf("%d", &size);
  int arr[size];
  for(int i = 0; i < size; i++)
  {
    scanf("%d", &arr[i]);
  }
  int large = arr[0];
  for(int i = 0; i < size; i++)
  {
    if(arr[i] >  large)
    {
   large = arr[i];
  }
}
  printf("%d", large);
return 0;
}