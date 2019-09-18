public class Book extends Product {

    private String author;
    private int pages;

    @Override
    public boolean equals (Object object) {
        if (this.toString().equalsIgnoreCase(object.toString())) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString()  {
        return this.getDescription() + " written by "  + author + " with code: " + this.getCode();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
