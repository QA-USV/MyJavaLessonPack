package ru.netology.sqr.MyJavaLessonPack.services;

public class SQRService {

    public int culculate(int minRange, int maxRange, int lowerLimitBR, int upperLimitBR) {

        int amountSQRs = 0; // The start amount of square roots in the Big number range
        int i;
        for (i = minRange; i <= maxRange; i++) {
            if (i * i >= lowerLimitBR) {
                if (i * i <= upperLimitBR) {
                    amountSQRs++;
                }
            }
        }
        return amountSQRs;
    }
}