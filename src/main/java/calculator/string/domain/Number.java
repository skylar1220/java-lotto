package calculator.string.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class Number {
    private int number;

    public Number(String number) {
        this.number = Integer.parseInt(number);
    }

    public int getNumber() {
        return number;
    }

}
