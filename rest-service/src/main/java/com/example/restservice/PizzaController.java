package com.example.restservice;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaController {
    ArrayList<Pizza> pizzas = createPizzas();


	@GetMapping("/pizza")
    public ArrayList<Pizza> pizza(){
        return pizzas;
    }

    private ArrayList<Pizza> createPizzas(){
        ArrayList<Pizza> result = new ArrayList<Pizza>();
        result.add(new Pizza(1, "Margherita", true, 7, new String[]{}));
        result.add(new Pizza(2, "Salami", false, 9, new String[]{"Salami"}));
        result.add(new Pizza(3, "Tonno", false, 10, new String[]{"Tuna", "Onion", "Olives"}));

        return result;
    }
}
