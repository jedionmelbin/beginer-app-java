package com.xprotech.app.algorithm;

public class TestMaxValue {
    public void runApp() {
        int[] scores = {60, 50, 95, 80, 70};
        int maxValue = maxValue(scores);
        System.out.println("MAX Value " + maxValue);
    }

    private int maxValue(int[] scores) {
        int length = scores.length;
        for (int i = 0; i < length - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                int temp = scores[i];
                scores[i] = scores[i + 1];
                scores[i  + 1] = temp;
            }
        }
        return scores[length - 1];
    }
}
