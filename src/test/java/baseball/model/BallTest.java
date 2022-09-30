package baseball.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {
    private Ball ball;

    @BeforeEach
    void setUp() {
        ball = new Ball();
    }

    @Test
    @DisplayName("서로 다른 임의의 수 3개 선택")
    void generateNotDuplicatedNumber() {
        int ballNumber = ball.generateBallNumber();
        String strNum = Integer.toString(ballNumber);
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < strNum.length(); i++) {
            set.add(strNum.charAt(i) - '0');
        }

        assertThat(set.size()).isEqualTo(3);
    }
}
