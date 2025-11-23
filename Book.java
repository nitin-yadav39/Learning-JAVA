public class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        setTitle(title);
        setAuthor(author);
        this.available = true;
    }


    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            this.title = "Unknown Title";
        }
    }

    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        } else {
            this.author = "Unknown Author";
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void borrow() {
        if (available) {
            available = false;
            System.out.println("Borrowed: " + title);
        } else {
            System.out.println("Already borrowed: " + title);
        }
    }

    public void giveBack() {
        if (!available) {
            available = true;
            System.out.println("Returned: " + title);
        } else {
            System.out.println("This book was not borrowed.");
        }
    }

    
    public String toString() {
        return String.format("Title: %s | Author: %s | Available: %s",
                             title, author, available ? "Yes" : "No");
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "N. Modi");

        System.out.println(book1);

        book1.setAuthor("F. Scott Fitzgerald");
        book1.setTitle("The Great Gatsby (Updated)");

        book1.borrow();
        book1.borrow();
        book1.giveBack();
        book1.giveBack();

        System.out.println(book1);
    }
}
