package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class Lotto {
    private List<LottoNumber> games;

    public Lotto(int money, LottoNumberGenerator lottoNumberGenerator) {
        if (money < LottoRule.price()) {
            throw new IllegalArgumentException();
        }

        this.games = new ArrayList<>();
        int numberOfGames = money / LottoRule.price();
        while (numberOfGames-- > 0) {
            games.add(lottoNumberGenerator.numbers());
        }
    }

    public List<LottoNumber> games() {
        return this.games;
    }

    public Winners winners(WinningNumber winningNumber) {
        Winners winners = new Winners();

        for (LottoNumber game : games) {
            int countOfMatch = winningNumber.countOfMatch(game);
            boolean matchBonus = winningNumber.matchBonus(game);
            winners.increase(Rank.valueOf(countOfMatch, matchBonus));
        }
        return winners;
    }
}