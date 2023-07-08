package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> map = new HashMap<>();
        String[] splited = sentence.split("[, .]");

        for (String element : splited) {
            String lower = element.toLowerCase();

            int value;
            if (map.containsKey(lower)) {
                value = map.get(lower);
                map.put(lower, ++value);
            } else if (!lower.isEmpty()) {
                value = 1;
                map.put(lower, value);
            }
        }
        return map;
    }
}
