package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private final static String INPUT_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private final static String INPUT_ROUND_MESSAGE = "시도할 회수는 몇회인가요?";

    public static String registerCar() {
        System.out.println(INPUT_CAR_NAME_MESSAGE);
        return Console.readLine().trim();
    }

    public static String inputRound() {
        System.out.println(INPUT_ROUND_MESSAGE);
        return Console.readLine();
    }
}
