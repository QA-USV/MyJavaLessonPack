import ru.netology.sqr.MyJavaLessonPack.services.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();
        int minRange = 10; // Specify the lower range limit for iteration
        int maxRange = 99; // Specify the upper range limit for iteration
        int lowerLimit = 250; // Specify the lower limit of the Big number range
        int upperLimit = 999; // Specify the upper limit of the Big number range

        int amountSQRs = service.culculate(minRange, maxRange, lowerLimit, upperLimit);
        System.out.println(amountSQRs);
    }
}