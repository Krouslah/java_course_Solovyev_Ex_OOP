package entity;

public class TrainingManual extends Library{
    private String typeOfKnowlege;
    private String degree;
    private String reaction;
    public TrainingManual(String typeOfKnowlege, String degree, String reaction, String genre, int countOfBooks, int year){
        super(genre, countOfBooks, year);
        this.typeOfKnowlege = typeOfKnowlege;
        this.degree = degree;
        this.reaction = reaction;
    }

    public String getTypeOfKnowlege() {
        return typeOfKnowlege;
    }

    public void setTypeOfKnowlege(String typeOfKnowlege) {
        this.typeOfKnowlege = typeOfKnowlege;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getReaction() {
        return reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }

    @Override
    public void printReaction() {
        System.out.println(reaction);
    }

    @Override
    public void getInfo() {
        System.out.print("Учебная литература ");
    }
}
