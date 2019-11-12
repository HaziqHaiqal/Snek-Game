package sample;

public class Player {

    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int score) {
        this.score += score;
    }
}
