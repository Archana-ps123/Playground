import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int i=0,j=0;
      for(i=n;i>0;i--)
      {
         for(j=n;j>0;j--)
         {
           if(i<=j)
             System.out.print(j); 
           else
              System.out.print(i);
         }
         System.out.println();
      }
    }
}