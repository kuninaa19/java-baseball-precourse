package baseball.model;

import baseball.view.ComputerView;

public class Computer {
    Ball ball;
    BallJudgment ballJudgment;
    ComputerView computerView;
    int ballNumber;

    public Computer(Ball ball, BallJudgment ballJudgment, ComputerView computerView) {
        this.ball = ball;
        this.ballJudgment = ballJudgment;
        this.computerView = computerView;
    }

    public void generateBallNumber() {
        this.ballNumber = ball.generateBallNumber();
    }

    public void judgmentPlayerBall(int playerBallNumber) {
        String[] computerBallNumberStringArray = ballJudgment.convertIntToStringArray(ballNumber);
        String[] playerBallNumberStringArray = ballJudgment.convertIntToStringArray(playerBallNumber);

        int ballCount = ballJudgment.countBall(computerBallNumberStringArray, playerBallNumberStringArray);
        int strikeCount = ballJudgment.countStrike(computerBallNumberStringArray, playerBallNumberStringArray);

        printIfPlayerBallResult(ballResultString(ballCount), strikeResultString(strikeCount));
        printIfThreeStrike(strikeCount);
        printIfNothing(ballCount, strikeCount);
    }

    public String ballResultString(int ballCount) {
        if (ballCount > 0) {
            return ballCount + "볼";
        }
        return "";
    }

    public String strikeResultString(int strikeCount) {
        if (strikeCount > 0) {
            return strikeCount + "스트라이크";
        }
        return "";
    }

    public void printIfPlayerBallResult(String ballResult, String strikeResult) {
        String result = ballResult + " " + strikeResult;
        result = result.trim();

        if (result.length() > 0) {
            computerView.printPlayerBallResult(result);
        }
    }

    public void printIfThreeStrike(int strikeCount) {
        if (strikeCount == 3) {
            computerView.printPlayerWin();
        }
    }

    public void printIfNothing(int ballCount, int strikeCount) {
        if (ballCount == 0 && strikeCount == 0) {
            computerView.printNothing();
        }
    }
}
