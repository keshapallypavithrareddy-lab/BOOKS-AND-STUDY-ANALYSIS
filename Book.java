public class Book {
    private int id;
    private String title;
    private String author;
    private String category;
    private int pages;
    private double rating;
    public Book(int id, String title, String author,
                String category, int pages, double rating) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.pages = pages;
        this.rating = rating;
    }
  public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getCategory() {
        return category;
    }
    public int getPages() {
        return pages;
    }
    public double getRating() {
        return rating;
    }
    @Override
    public String toString() {
        return id + " | " + title + " | " + author
                + " | " + category
                + " | Pages: " + pages
                + " | Rating: " + rating;
    }
}
