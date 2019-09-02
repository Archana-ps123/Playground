class MyModel1 {
     int camera = 2;
  int display = 5;
  public  MyModel1 ()
  {
 System.out.println("Features of MyModel 1");
   System.out.println("Camera mega pixels: "+camera);
}}
class MyModel2 extends MyModel1 {
    
  String lock =  "Fingerprint";
  public  MyModel2(){
    this.camera = 5;
 System.out.println("Features of MyModel 2");
   System.out.println("Camera mega pixels: "+camera+ "\nLock mechanism: "+lock+ "\nDisplay size: "+display);
  }
}
class MyModel2T extends MyModel2 {
    public MyModel2T()
    {
      this.display = 6;
      this.camera = 16;
       System.out.println("Features of MyModel 2T");
   System.out.println("Camera mega pixels: "+camera+ "\nLock mechanism: "+lock+ "\nDisplay size: "+display);
  }
}
public class Main 
{
    public static void main(String[] args) 
    {
          MyModel2T obj = new MyModel2T();
    }
}