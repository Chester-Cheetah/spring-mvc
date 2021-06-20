package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;


@Controller
public class CarsController {

    private final CarService service = new CarServiceImpl();

    @GetMapping ("/cars")
    public String getCarList (@RequestParam (value = "count", required = false) String count, Model model) {
        int c = 5;
        if (count != null) {
            c = Integer.parseInt(count);
        }
        List<Car> result = service.carList(c);
        model.addAttribute("carList", result);
        return "cars";
    }

}
