public class Book {
//    • Four private instance variables: name (String), author
//    (of the class Author you have just created), price (double),
//    and qtyInStock (int). Assuming that each book is written by one
//        author.
    private String name;

    private double price;
    private int qtyInStock;

    private Author author;
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }
}
