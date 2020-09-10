package Upr1;

public class Book {
    private String Name;
    private String Author;
    private int Size;
    private int ReleaseYear;
    private String Publisher;

    public Book(String Name,String Author,int Size,int ReleaseYear,String Publisher){
        this.Name=Name;
        this.Author=Author;
        this.Size=Size;
        this.ReleaseYear=ReleaseYear;
        this.Publisher=Publisher;
    }

    public String getName() {
        return Name;
    }

    public String getAuthor() {
        return Author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public int getSize() {
        return Size;
    }

    public int getReleaseYear() {
        return ReleaseYear;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public void setReleaseYear(int releaseYear) {
        ReleaseYear = releaseYear;
    }

    public void setSize(int size) {
        Size = size;
    }

    @Override
    public String toString() {
        return "Book stats:" +
                "Name '" + Name + '\'' +
                ", Author '" + Author + '\'' +
                ", Size " + Size +
                ", ReleaseYear " + ReleaseYear +
                ", Publisher '" + Publisher + '\'';
    }
}
