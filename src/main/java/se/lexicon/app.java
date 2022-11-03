package se.lexicon;

public class app {
    public static void main(String[] args) {
   Book book1 = new Book("Lord of the rings", "tahsin", "Pinkhouse", "1996");
   System.out.println(book1.getDisplayBooks());
   Person Alam = new Person("ALAM", "kHAN", "alam@jsdid", "1234");
   System.out.println(Alam.getPersonInformation());
   book1.setLender(Alam);
        System.out.println(book1.getLenderInformation());
        


    }
  
            
}