package com.xprotech.app.algorithm;

public class TestBubbleSort {
    public void runApp() {
        int[] scores = {90, 70, 50, 80, 60, 85};
        sortArray(scores);
    }

    private void sortArray(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - i - 1; j++) {
                if (scores[i] > scores[i + 1]) {

                }
            }
        }
    }
}
