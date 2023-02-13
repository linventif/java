class UseBook{
    public static void main(String[] args) {
        Book[] bibilio = new Book[3];
        bibilio[0] = new Book("Le petit prince", "Antoine de Saint-Exupéry", 1943);
        bibilio[1] = new Book("Le seigneur des anneaux", "J.R.R. Tolkien", 1954);
        bibilio[2] = new Book("Harry Potter", "J.K. Rowling", 1997);
        for (int i = 0; i < bibilio.length; i++) {
            System.out.println(bibilio[i].getInfo());
        }
    }
}