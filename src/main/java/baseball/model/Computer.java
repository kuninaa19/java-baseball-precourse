package baseball.model;

public class Computer {
    Ball ball;
    int ballNumber;

    public Computer(Ball ball) {
        this.ball = ball;
    }

    public void generateBallNumber() {
        this.ballNumber = ball.generateBallNumber();
    }
}
