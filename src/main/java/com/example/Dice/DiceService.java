package com.example.Dice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class DiceService {
    @Autowired
    private DiceRollLogRepository diceRollLogRepository;

    public List<Integer> rollDices(int count) {
        List<Integer> rolls = new ArrayList<>();
        Dice dice = new Dice();
        for (int i = 0; i < count; i++) {
            rolls.add(dice.roll());
        }

        DiceRollLog log = new DiceRollLog();
        log.setDiceCount(count);
        log.setResults(rolls);
        log.setTimestamp(LocalDateTime.now());
        diceRollLogRepository.save(log);
        return rolls;
    }
}