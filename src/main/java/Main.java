import ru.netology.sqr.MyJavaLessonPack.services.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();
        int lowerLimit = 250; // The lower limit of the Big number range
        int upperLimit = 999; // The upper limit of the Big number range
        int amountSQRs = service.culculate(lowerLimit, upperLimit);
        System.out.println(amountSQRs);
    }
}
