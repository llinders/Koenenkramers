package dea.oose.ica.luclinders;

import nl.oose.dea.koenenkramers.KramersDictionary;

public class KramersDictionaryAdapter implements IDictionary {
    private KramersDictionary instance;
    private final String DICTIONARY_NAME = "Kramers";

    public KramersDictionaryAdapter(KramersDictionary kramersDictionary) {
        this.instance = kramersDictionary;
    }

    public String translate(String word) throws WordNotFoundInDictionaryException {
        if (instance.find(word) == null)
            throw new WordNotFoundInDictionaryException("Word was not found in this dictionary");

        return instance.find(word);
    }

    public String getName() {
        return DICTIONARY_NAME;
    }
}
