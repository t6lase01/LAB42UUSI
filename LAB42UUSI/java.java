public class java {
public static void main(String[] args) {
Product product = new Product("Edam", 3.3, 120);
product.changePrice(20);
System.out.println("Product value is " + product.countValue());
product.printProduct();
}
}
class Product {
private String name;
private double price;
private int amount; //Amount in storage
public Product(String name, double price, int amount) {
this.name = name;
this.price = price;
this.amount = changeValue(5);
}
public int changeValue(int newvalue){
    amount = newvalue;
    return amount;
}
public double changePrice(double newvalue){
    price = newvalue;
    return price;
}
public double countValue() {
return(amount * price);
}
public void printProduct() {
System.out.printf("Product %s, price %4.1f and balance %d pcs",
name,price,amount);
}
}