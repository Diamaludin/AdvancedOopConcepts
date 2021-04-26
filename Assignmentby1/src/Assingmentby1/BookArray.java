package Assingmentby1;
public class BookArray {

    public static void main(String[] args) {
        
   
        Book bookArray[]={new Fiction("Lord of the Flies"),
                            new Fiction("Super God Gene"),
                            new Fiction("The fault in our stars"),
                            new Fiction("the Hobbit"),
                            new Fiction("My cold and beautiful wife"),
                            new NonFiction("Guns"),
                            new NonFiction("In Cold Blood"),
                            new NonFiction("Hiroshima"),
                            new NonFiction("Never Cry Wolf"),
                            new NonFiction("Love Without Limits")};

        
        for(int i=0;i<bookArray.length;i++)
        {
           
            System.out.println(bookArray[i].toString());
        }
    }

}