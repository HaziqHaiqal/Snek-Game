package sample;

public class SnakeList {
    private Snake Snakes[];
    private int numSnake;

    public void addSnake(Snake snake){
        Snakes[numSnake]=snake;
        numSnake++;

    }

    public Snake getSnakes(){
        return Snakes[numSnake];}
}
