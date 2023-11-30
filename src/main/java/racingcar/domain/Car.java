package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String carName;
    private int position;

    private Car(String carName) {
        this.carName = carName;
    }

    public static Car from(String carName) {
        validateLength(carName);
        validateNotNull(carName);
        return new Car(carName);
    }

    public void move() {
        if (Randoms.pickNumberInRange(GameRules.RANDOM_NUMBER_START.getValue(), GameRules.RANDOM_NUMBER_END.getValue()) >= GameRules.MOVE_CONDITION.getValue())
            this.position++;
    }

    private static void validateLength(String carName) {
        if (carName.length() > GameRules.NAME_LENGTH_LIMIT.getValue())
            throw new IllegalArgumentException();
    }

    private static void validateNotNull(String carName) {
        if (carName.isEmpty())
            throw new IllegalArgumentException();
    }

    public String getCarName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }
}
