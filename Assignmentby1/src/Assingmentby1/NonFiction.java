package Assingmentby1;
public class NonFiction extends Book {

   
    public NonFiction(String title) {
        super(title);
        setPrice();
    }

   
  
    public void setPrice() {
        price=37.99;

    }
    
 
  
    public String toString() {
        System.out.println("Non-Fiction Books");
        return "Title :"+getTitle()+"\nPrice :$"+getPrice()+"\n";
    }

}