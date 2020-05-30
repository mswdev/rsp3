package org.rspeer.commons;

import java.util.Arrays;

/**
 * A numeric range, only the minimum and maximum values are provided.
 */
public class Range {

    private final int min;
    private final int max;

    private Range(int min, int max) {
        this.min = Math.min(min, max);
        this.max = Math.max(min, max);
    }

    public static Range of(int min, int max) {
        return new Range(min, max);
    }

    public boolean within(int value) {
        return value <= max && value >= min;
    }

    public int random() {
        return Random.nextInt(min, max);
    }

    public int[] fill() {
        int[] array = new int[max - min];
        Arrays.setAll(array, index -> min + index);
        return array;
    }
}
