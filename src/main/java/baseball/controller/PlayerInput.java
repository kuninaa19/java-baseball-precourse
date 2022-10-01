package baseball.controller;

import camp.nextstep.edu.missionutils.Console;

public class PlayerInput {
    public int input() {
        String readLine = Console.readLine();
        try {
            return Integer.parseInt(readLine);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("입력값은 정수여야합니다. 입력값 : " + readLine);
        }
    }
}
