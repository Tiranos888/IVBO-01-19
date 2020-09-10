package Upr1;

public class BookTest {
    public static void main(String[] args){
        Book cl1=new Book("This is BOOK","Peter",46,1984,"WorldPublisher");
        System.out.println(cl1.toString());
        cl1.setAuthor("Alexandr");
        cl1.setName("That BOOK");
        cl1.setPublisher("OldWorldPublisher");
        cl1.setReleaseYear(2000);
        cl1.setSize(167);
        System.out.println(cl1.toString());
    }
}
