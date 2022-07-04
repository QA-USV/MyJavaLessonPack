package ru.netology.sqr.MyJavaLessonPack.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/paramsForTests.csv")
    public void shouldCulcRange(int expected, int lowerLimit, int upperLimit) {
        SQRService service = new SQRService();

        int actual = service.culculate(lowerLimit, upperLimit);

        Assertions.assertEquals(expected, actual);
    }
}