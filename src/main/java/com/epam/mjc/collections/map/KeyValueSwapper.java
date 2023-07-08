package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {

        Map<String, Integer> map = new HashMap<>();

        for (Map.Entry<Integer, String> element : sourceMap.entrySet()) {

            String key = element.getValue();
            Integer value = element.getKey();

            if (map.containsKey(key) && value > map.get(key))
                continue;

            map.put(key, value);
        }

        return map;
    }
}
