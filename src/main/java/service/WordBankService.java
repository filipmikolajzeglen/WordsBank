package service;

import model.IrregularVerbTranslation;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static repository.WordsBankLocalRepository.getIrregularVerbsAsList;

public class WordBankService implements Study {

    private int correct = 0;
    private int allAnswers = 0;
    private boolean end = true;
    private List<IrregularVerbTranslation> verbs = getIrregularVerbsAsList();
    private Scanner scanner = new Scanner(System.in);

    public WordBankService() {
    }

    private IrregularVerbTranslation getRandomVerb() {
        Random random = new Random();
        return verbs.get(random.nextInt(verbs.size()));
    }

    @Override
    public boolean validateWordsObject(IrregularVerbTranslation verb) {
        return verb == null;
    }

    @Override
    public void start() throws Exception {
        do {
            IrregularVerbTranslation verb = getRandomVerb();

            if (!validateWordsObject(verb)) {
                System.out.println("Please write correct translate in Polish");
                System.out.println(verb.getIFrom()
                        + " | " + verb.getIIForm()
                        + " | " + verb.getIIIForm()
                        + " | Good answers: ".toUpperCase() + correct + "/" + allAnswers++);

                String answer = scanner.nextLine().toUpperCase();
                System.out.println(verb.getTranslation().contains(answer)
                        ? "Good! " + verb.getTranslation()
                        : "Wrong! Correct answer is " + verb.getTranslation());

                correct = verb.getTranslation().contains(answer) ? correct + 1 : correct;
                if (!verb.getTranslation().contains(answer)) {
                    System.out.println("Would you like to continue? Write YES | NO: ");
                    end = "YES".contains(scanner.nextLine().toUpperCase());
                }

            } else {
                throw new Exception("Verb is null");
            }
        } while (end);
    }
}
