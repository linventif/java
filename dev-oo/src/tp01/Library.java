class Library{
    Book[] books;

    Library(){
        System.out.println("Library created");
    }

    public static void main(String[] args) {
        Book book = new Book("J. K. Rowling", "Harry Potter", 1997);
        System.out.println(book.getInfo());
    }
}