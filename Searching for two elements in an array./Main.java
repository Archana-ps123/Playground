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
  int n1, n2;
  scanf("%d\n%d", &n1, &n2);
  int count = 0;
  for(int i = 0; i < size ;i++)
  {
    if(n1 == arr[i])  
    {
      printf("%d\n", i);
     count++; 
    }
  if(n2 == arr[i])
  {
    printf("%d\n", i);
    count++;
  }
  }
  if(count<2)
  {
    printf("-1");
  }
  return 0;
}