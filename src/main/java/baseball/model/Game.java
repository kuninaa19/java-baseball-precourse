package baseball.model;

public class Game {
    Computer computer;

    public Game(Computer aComputer) {
        computer = aComputer;
    }

    public void play() {
        computer.generateBallNumber();
    }
}
