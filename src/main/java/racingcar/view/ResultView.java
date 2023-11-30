package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;

public class ResultView {
    private final static String RESULT_MESSAGE = "실행 결과";
    private final static String DELIMITER = " : ";
    private final static String PROGRESS = "-";
    private final static String WINNER_MESSAGE = "최종 우승자";

    public static void printResultMessage() {
        System.out.println(RESULT_MESSAGE);
    }

    public static void showRoundResult(Cars cars) {
        for (Car car : cars.getCarList()) {
            System.out.println(car.getCarName() + DELIMITER + PROGRESS.repeat(car.getPosition()));
        }
        System.out.println();
    }

    public static void showFinalWinner(String winners) {
        System.out.print(WINNER_MESSAGE + DELIMITER + winners);
    }
}
