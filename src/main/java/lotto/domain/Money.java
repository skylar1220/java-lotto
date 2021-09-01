package lotto.domain;

import static lotto.domain.Lotto.LOTTO_PRICE;

import java.util.Objects;

public class Money {

    private static final String MONEY_NEGATIVE_MONEY_ERROR_MESSAGE = "돈은 음수가 들어올 수 없다.";
    private static final String MONEY_UNAVAILABLE_PURCHAGE_LOTTO_ERROR_MESSAGE = "로또 게임을 진행하려면 로또 가격보다 많은 돈을 넣어야 한다.";

    private final int money;

    public Money(int money) {
        checkNegativeMoney(money);

        this.money = money;
    }

    private void checkNegativeMoney(int money) {
        if (money < 0) {
            throw new IllegalArgumentException(MONEY_NEGATIVE_MONEY_ERROR_MESSAGE);
        }
    }

    public int calculatePurchaseCount() {
        return money / LOTTO_PRICE;
    }

    public Money useMoney(int lottoCount) {
        checkAvailableForPurchaseLotto();

        return new Money(money - lottoCount * LOTTO_PRICE);
    }

    private void checkAvailableForPurchaseLotto() {
        if (money / LOTTO_PRICE == 0) {
            throw new IllegalArgumentException(MONEY_UNAVAILABLE_PURCHAGE_LOTTO_ERROR_MESSAGE);
        }
    }

    public double calculateYeild(double winMoney) {
        double buyMoney = money * calculatePurchaseCount();
        return winMoney / buyMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Money money1 = (Money) o;
        return money == money1.money;
    }

    @Override
    public int hashCode() {
        return Objects.hash(money);
    }

}