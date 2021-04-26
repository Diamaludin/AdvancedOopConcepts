package Assingmentby1;


public class Fiction extends Book {

   
    public Fiction(String title) {
        super(title);
        setPrice();
    }


    
    public void setPrice() {
        price=24.99;

    }

    
    
    public String toString() {
        System.out.println(" Fiction Books ");
        return "Title :"+getTitle()+"\nPrice :$"+getPrice()+"\n";
    }
    

}
