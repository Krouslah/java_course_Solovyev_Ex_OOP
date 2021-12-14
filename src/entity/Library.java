package entity;

public class Library {
    public String genre;
    private int countOfBooks;
    private int year;
    public Library (String genre, int year, int countOfBooks){
        this.genre = genre;
        this.countOfBooks = countOfBooks;
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCountOfBooks() {
        return countOfBooks;
    }

    public void setCountOfBooks(int countOfBooks) {
        this.countOfBooks = countOfBooks;
    }
    public void printReaction(){

    }
    public void getInfo(){

    }
}
