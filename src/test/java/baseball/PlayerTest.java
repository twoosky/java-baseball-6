package baseball;

import static baseball.utils.ErrorMessages.PLAYER_NUMBERS_INVALID_SIZE;

import baseball.domain.Player;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Player 클래스")
public class PlayerTest {


    @ParameterizedTest
    @ValueSource(strings = {"1", "12", "123456789"})
    void IllegalArgumentException_예외를_던진다(String input) {
        Assertions.assertThatThrownBy(() -> new Player(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(PLAYER_NUMBERS_INVALID_SIZE);
    }
}
