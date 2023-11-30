package racingcar.domain;

public enum GameRules {
    NAME_LENGTH_LIMIT(5),
    MOVE_CONDITION(4),
    RANDOM_NUMBER_START(0),
    RANDOM_NUMBER_END(9);

    private final int value;

    GameRules(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
