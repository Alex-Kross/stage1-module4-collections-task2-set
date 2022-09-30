package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSetFromList = new HashSet<>();
        for (int number : sourceList) {
            if (number % 2 == 0) {
                hashSetFromList.add(number);
                while (number % 2 == 0) {
                    number /= 2;
                    hashSetFromList.add(number);
                }
            } else if (number % 2 == 1) {
                hashSetFromList.add(number);
                hashSetFromList.add(number * 2);
            }
        }
        return hashSetFromList;
    }
}
