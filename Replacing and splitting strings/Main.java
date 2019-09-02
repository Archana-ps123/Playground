
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
       String str2 = sc.nextLine();
      int parts = sc.nextInt();
    
        str1 = str2;
  
 int limit = str1.length();
  for(int i=0;i<limit;i++)
  {
    char a = str1.charAt(i);
    System.out.print(a);
    if(a == ' ')
      System.out.println();
  }
}
}
