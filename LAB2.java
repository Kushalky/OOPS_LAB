class Book {
    int bookId;
    String title;
    String author;
    double price;

    static int count = 0;
    
    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;

        count++;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs." + price);
        System.out.println("----------------------");
    }

    void search(int id) {
        if (bookId == id) {
            System.out.println("Book Found by ID!");
            display();
        }
    }

    void search(String t) {
        if (title.equalsIgnoreCase(t)) {
            System.out.println("Book Found by Title!");
            display();
        }
    }

    Book costlier(Book b) {
        if (this.price > b.price) {
            return this;
        } else {
            return b;
        }
    }
    
    static void displayCount() {
        System.out.println("Total Books Created: " + count);
    }
}

class lab2{
   public static void main(String[]args){
      Book b1 = new Book(101, "Java Programming",
                           "James Gosling", 550);

        Book b2 = new Book(102, "Python Basics",
                           "Guido Rossum", 450);

        Book b3 = new Book(103, "C Programming",
                           "Dennis Ritchie", 600);
        b1.display();
        
        b1.search(101);
        
        b2.search("Python basics");
        
        Book result = b1.costlier(b2);
        result.display();
        
        Book.displayCount();
      System.out.println("Kushal K Y");
      System.out.println("1WN25CS118");
    }
}
 
   
