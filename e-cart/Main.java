//package test;
//import required packages here
import java.util.*;
class Item
{
private int price;
//create various method to return attribute value(s)

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}
}
 
class Customer
{
private String product;
private int quantity;
//create various method to return attribute value(s)
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}

class Bill
{
//implement your logic to calculate total price
	public int calc(int a,int b)
	{
		 int calc  = a * b;
		 return calc;
	}
	
}
class Main
{
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  Item i = new Item();
  Customer c = new Customer();
  Bill obj = new Bill();
  c.setProduct(sc.nextLine());
   i.setPrice(sc.nextInt());
   c.setQuantity(sc.nextInt());
  System.out.println( "Total Price is : "+obj.calc(i.getPrice(),c.getQuantity()));
  //write the logic here
}
}