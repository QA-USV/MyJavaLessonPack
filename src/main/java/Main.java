import ru.netology.sqr.MyJavaLessonPack.services.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();

        int lowerLimitBR = 250; // Specify the lower limit of the Big number range
        int upperLimitBR = 999; // Specify the upper limit of the Big number range
        int amountSQRs = service.culculate(lowerLimitBR, upperLimitBR);
        System.out.println(amountSQRs);
    }
}