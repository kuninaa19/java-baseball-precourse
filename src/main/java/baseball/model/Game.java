package baseball.model;

import baseball.view.GameView;

public class Game {
    Computer computer;
    Player player;
    GameView gameView;

    public Game(Computer computer, Player player, GameView gameView) {
        this.computer = computer;
        this.player = player;
        this.gameView = gameView;
    }

    public void play() {
        computer.generateBallNumber();

        progress();
    }

    public void progress() {
        boolean end = false;

        while (!end) {
            gameView.printPlayerInputGuide();

            int inputNumber = player.input();
            player.validateInputBallNumber(inputNumber);

            end = computer.judgmentPlayerBall(player.getBallNumber());
        }
    }
}
