import service.Study;
import service.WordBankService;

public class Main {

    public static void main(String[] args) throws Exception {
        Study study = new WordBankService();
        study.start();
    }
}
