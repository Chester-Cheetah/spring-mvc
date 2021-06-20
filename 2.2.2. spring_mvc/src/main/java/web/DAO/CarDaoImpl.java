package web.DAO;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDAO {

    private static final List <Car> CAR_LIST = new ArrayList<>(5);

    static {
        CAR_LIST.add(new Car("Метла", "Древняя русь", "Коричневый"));
        CAR_LIST.add(new Car("Ковёр-самолет", "Ирак", "Красный"));
        CAR_LIST.add(new Car("Невидимка", "США", "Бесцветный"));
        CAR_LIST.add(new Car("Верблюд", "Ливия", "Серый"));
        CAR_LIST.add(new Car("Минивэн", "США", "Белый"));
    }

    @Override
    public List<Car> carList(int count) {
        int s = Math.min(count, 5);
        int size = Math.max(0, s);
        return CAR_LIST.stream().limit(size).collect(Collectors.toList());
    }
}
