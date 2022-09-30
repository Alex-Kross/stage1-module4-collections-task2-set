package com.epam.mjc.collections.set;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Iterator<Integer> iterator = sourceList.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            treeSet.add(number * number);
        }
        return treeSet.subSet(lowerBound, upperBound + 1);
    }
}
