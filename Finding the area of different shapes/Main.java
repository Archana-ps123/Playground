import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      int opt = sc.nextInt();
     switch(opt)
     {
       case 1:
      
       int side1 = sc.nextInt();
        int square = side1 * side1;
        System.out.println(square);
      break;
      case 2:
      
        int l = sc.nextInt();
        int b = sc.nextInt();
        int Rectangle = l * b;
         System.out.println(Rectangle);
      break;
       case 3:
      
         b = sc.nextInt();
        int h = sc.nextInt();
        int Triangle= (b * h) / 2;
         System.out.println(Triangle);
      break;
       case 4:
      
        int r = sc.nextInt();
        //float PI = 3.14f;
        double Circle= 3.1399999999999999*(r * r);
         System.out.println(Circle);
      break;
      default: System.out.println("INVALID");
    }
}}