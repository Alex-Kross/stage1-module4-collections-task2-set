package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> firstConditionSet = new HashSet<>(firstSet);
        Set<String> secondConditionSet = new HashSet<>(thirdSet);
        firstConditionSet.retainAll(secondSet);
        firstConditionSet.removeAll(thirdSet);
        secondConditionSet.removeAll(firstSet);
        secondConditionSet.removeAll(secondSet);
        firstConditionSet.addAll(secondConditionSet);
        return firstConditionSet;
    }
}
