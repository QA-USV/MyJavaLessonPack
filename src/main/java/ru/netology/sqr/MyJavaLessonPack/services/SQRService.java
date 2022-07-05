package ru.netology.sqr.MyJavaLessonPack.services;

public class SQRService {

    public int culculate(int minRange, int maxRange, int lowerLimit, int upperLimit) {

        int amountSQRs = 0; // The start amount of square roots in the Big number range
        int i;
        for (i = minRange; i <= maxRange; i++) {
            if (i * i >= lowerLimit) {
                if (i * i <= upperLimit) {
                    amountSQRs++;
                }
            }
        }
        return amountSQRs;
    }
}