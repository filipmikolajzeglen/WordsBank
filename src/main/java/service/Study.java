package service;

import model.IrregularVerbTranslation;

public interface Study {
    boolean validateWordsObject(IrregularVerbTranslation verb);
    void start() throws Exception;
}
