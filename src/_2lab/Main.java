package _2lab;

public class Main {
    public static void main(String[] args) {
        Book book=new Book("Orwell","1984","anti-utopia",1948);
        System.out.println(book.toString());
        book.setYear(1949);
        System.out.println(book.getYear());
    }
}