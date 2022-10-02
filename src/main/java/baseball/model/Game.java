package baseball.model;

import baseball.view.GameView;

public class Game {
    Computer computer;
    Player player;
    GameView gameView;

    public Game(Computer computer, Player player, GameView gameView) {
        this.computer= computer;
        this.player = player;
        this.gameView = gameView;
    }

    public void play() {
        computer.generateBallNumber();

        gameView.printPlayerInputGuide();

        int inputNumber = player.input();
        player.validateInputBallNumber(inputNumber);

        computer.judgmentPlayerBall(player.getBallNumber());
    }
}
