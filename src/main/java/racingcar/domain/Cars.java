package racingcar.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private static final String NAME_SPLITTER = ",";
    private static final String WINNER_DELIMITER = ", ";
    private final List<Car> carList;

    private Cars(List<Car> carList) {
        this.carList = carList;
    }

    public static Cars from(String carNames) {
        List<Car> carList = Arrays.stream(carNames.split(NAME_SPLITTER))
                .map(Car::from)
                .toList();
        return new Cars(carList);
    }

    public void startRace() {
        for (Car car : carList) {
            car.move();
        }
    }

    public String findWinners() {
        return carList.stream()
                .filter(car -> car.getPosition() == findFirstCar())
                .map(Car::getCarName)
                .collect(Collectors.joining(WINNER_DELIMITER));
    }

    private int findFirstCar() {
        int maxPosition = Integer.MIN_VALUE;
        for (Car car : carList) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        return maxPosition;
    }

    public List<Car> getCarList() {
        return carList;
    }
}
