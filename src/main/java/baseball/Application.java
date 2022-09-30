package baseball;

import baseball.model.Ball;
import baseball.model.Computer;
import baseball.model.Game;

public class Application {
    public static void main(String[] args) {
        Computer aComputer = new Computer(new Ball());

        Game aGame = new Game(aComputer);
        aGame.play();
    }
}
