package ru.netology.sqr.MyJavaLessonPack.services;

public class SQRService {

    public int culculate(int lowerLimit, int upperLimit) {

        int maxRange = 99; // The upper range limit for iteration
        int minRange = 10; // The lower range limit for iteration
        int amountSQRs = 0; // The amount of square roots in the Big number range
        int i;
        for (i = minRange; i <= maxRange; i++) {
            if (i * i >= lowerLimit) {
                if (i * i <= upperLimit)
                    amountSQRs++;
            }
        }
        return amountSQRs;
    }
}

