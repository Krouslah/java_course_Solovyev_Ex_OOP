package entity;

public class Book extends Library{
    private int countPages;
    private String author;
    private String coverType;
    public Book(int countPages, String author, String coverType, String genre, int countOfBooks, int year){
        super(genre, countOfBooks, year);
        this.countPages = countPages;
        this.author = author;
        this.coverType = coverType;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    @Override
    public void printReaction(){
        System.out.println("wow!");
    }

    @Override
    public void getInfo(){
        System.out.print("Развлекательная литература ");
    }
}
