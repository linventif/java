class Book {
    // class attributes
    String author;
    String title;
    int year;

    // constructor
    Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    // class methods
    String getAuthor() {
        return this.author;
    }

    String getTitle() {
        return this.title;
    }

    String getInfo(){
        return this.title + " was written by " + this.author + " in " + this.year;
    }
}