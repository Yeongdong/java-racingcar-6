package racingcar.application;

import racingcar.domain.Cars;
import racingcar.domain.Round;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class RacingGame {
    public void play() {
        Cars cars = Cars.from(InputView.registerCar());
        Round round = Round.from(InputView.inputRound());
        ResultView.printResultMessage();
        for (int i = 0; round.getRound() > i; i++) {
            cars.startRace();
            ResultView.showRoundResult(cars);
        }
        ResultView.showFinalWinner(cars.findWinners());
    }
}
