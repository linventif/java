class program {
    public static void main(String[] args) {
        Book book = new Book("J. K. Rowling", "Harry Potter", 1997);
        System.out.println(book.getAuthor());
        System.out.println(book.getInfo());
    }
}