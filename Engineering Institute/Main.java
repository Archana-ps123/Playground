//import required packages
import java.util.*;
class Faculty
{
  int baseSalary;
  public void salary(int a)
  {
    baseSalary = a;
    System.out.println("Base Salary: "+ baseSalary);
    //write your Faculty class statements
  }
}
class CSE extends Faculty
{
  
  public void salary(int a)
  {
    baseSalary = a;
    System.out.println("CSE Faculty: "+ (baseSalary+3000));
    //write your
    //write your CSE class statements
  }
}
class IT extends Faculty
{
  public void salary(int a)
  {
    //write your IT class statements
    baseSalary = a;
    System.out.println("IT Faculty: "+ (baseSalary+5000));
    //write your
  }
}
class ECE extends Faculty
{
  public void salary(int a)
  {
    //write your ECE class statements
     baseSalary = a;
    System.out.println("ECE Faculty: "+ (baseSalary+4500));
    //write your
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    Faculty fac = new Faculty();
    fac.salary(base);
     CSE cse = new CSE();
     IT it = new IT();
     ECE ece = new ECE();
     cse.salary(fac.baseSalary);
    it.salary(fac.baseSalary);
     ece.salary(fac.baseSalary);
    
    //implement your required concept here
  }
}








