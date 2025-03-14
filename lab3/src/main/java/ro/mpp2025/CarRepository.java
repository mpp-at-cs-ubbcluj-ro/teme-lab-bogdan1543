package ro.mpp2025;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ro.mpp2025.Car;

public interface CarRepository extends Repository<Integer, Car> {
    List<Car> findByManufacturer(String manufacturer);
    List<Car> findBetweenYears(int min, int max);
}
