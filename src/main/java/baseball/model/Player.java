package baseball.model;

import baseball.controller.PlayerInput;

public class Player {
    PlayerInput playerInput;
    Ball ball;
    int ballNumber;

    public Player(PlayerInput playerInput, Ball ball) {
        this.ball = ball;
        this.playerInput = playerInput;
    }

    public void inputBallNumber() {
        ballNumber = playerInput.input();
        if (!ball.validateBallNumber(ballNumber)) {
            throw new IllegalArgumentException("자릿수마다 중복되지않는 세자리정수를 입력해주세요 입력값 : " + ballNumber);
        }
    }
}