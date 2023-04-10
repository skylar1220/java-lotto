package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LottoTest {

    @DisplayName("로또 번호를 6개로 만들 수 있다")
    @Test
    void getLotto() {
        Lotto lotto = new Lotto(List.of(
                LottoNumber.of(1),
                LottoNumber.of(2),
                LottoNumber.of(3),
                LottoNumber.of(4),
                LottoNumber.of(5),
                LottoNumber.of(6)));
        lotto.printLottoNumber();
        assertThat(lotto.printLottoNumber()).isEqualTo("[1, 2, 3, 4, 5, 6]");
    }

    @DisplayName("로또 번호는 중복될 수 없다.")
    @Test
    void getLotto2() {
        assertThatThrownBy(() -> {
            new Lotto(List.of(
                    LottoNumber.of(1),
                    LottoNumber.of(2),
                    LottoNumber.of(3),
                    LottoNumber.of(3),
                    LottoNumber.of(5),
                    LottoNumber.of(6)));
                }
        ).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호는 6자리 까지다.")
    @Test
    void getLotto3() {
        assertThatThrownBy(() -> {
                    new Lotto(List.of(
                        LottoNumber.of(1),
                        LottoNumber.of(2),
                        LottoNumber.of(3),
                        LottoNumber.of(4),
                        LottoNumber.of(5),
                        LottoNumber.of(6),
                        LottoNumber.of(7)));
                }
        ).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호 범위에서 벗어나면 예외가 발생한다")
    @Test
    void getLotto4() {
        assertThatThrownBy(() -> {
                    new Lotto(List.of(
                        LottoNumber.of(1),
                        LottoNumber.of(2),
                        LottoNumber.of(3),
                        LottoNumber.of(4),
                        LottoNumber.of(5),
                        LottoNumber.of(46)));
                }
        ).isInstanceOf(IllegalArgumentException.class);
    }
}