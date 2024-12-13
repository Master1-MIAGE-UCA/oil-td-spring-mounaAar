package com.example.Dice;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/dice")
public class DiceController {

    private final Random random = new Random();

    @GetMapping("/rollDice")
    public int rollSingleDice() {
        return random.nextInt(6) + 1;
    }

    @GetMapping("/rollDices/{count}")
    public List<Integer> rollMultipleDices(@PathVariable int count) {
        List<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            rolls.add(random.nextInt(6) + 1);
        }
        return rolls;
    }
}