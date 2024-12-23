package com.csc;

import java.util.stream.IntStream;

public class Calculator {

    // For-loop implementations
    public int maximumUsingForLoop(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) max = num;
        }
        return max;
    }

    public int minimumUsingForLoop(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) min = num;
        }
        return min;
    }

    public int sumUsingForLoop(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public double averageUsingForLoop(int[] nums) {
        return (double) sumUsingForLoop(nums) / nums.length;
    }

    // Stream API implementations
    public int maximumUsingStream(int[] nums) {
        return IntStream.of(nums).max().orElseThrow();
    }

    public int minimumUsingStream(int[] nums) {
        return IntStream.of(nums).min().orElseThrow();
    }

    public int sumUsingStream(int[] nums) {
        return IntStream.of(nums).sum();
    }

    public double averageUsingStream(int[] nums) {
        return IntStream.of(nums).average().orElseThrow();
    }

    // Add-ons using Stream API
    public int[] evensOnly(int[] nums) {
        return IntStream.of(nums).filter(num -> num % 2 == 0).toArray();
    }

    public int[] oddsOnly(int[] nums) {
        return IntStream.of(nums).filter(num -> num % 2 != 0).toArray();
    }

    public int[] addFive(int[] nums) {
        return IntStream.of(nums).map(num -> num + 5).toArray();
    }

    public int[] squareNumbers(int[] nums) {
        return IntStream.of(nums).map(num -> num * num).toArray();
    }
}