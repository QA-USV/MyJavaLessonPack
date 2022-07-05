package ru.netology.sqr.MyJavaLessonPack.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/paramsForTests.csv")
    public void shouldCulcRange(int expected, int lowerLimitBR, int upperLimitBR) {
        SQRService service = new SQRService();

        int actual = service.culculate(lowerLimitBR, upperLimitBR);

        Assertions.assertEquals(expected, actual);
    }
}