package racingcar.domain;

public class Round {
    private final int round;

    private Round(int round) {
        this.round = round;
    }

    public static Round from(String inputRound) {
        try {
            int round = Integer.parseInt(inputRound);
            return new Round(round);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    public int getRound() {
        return round;
    }
}
