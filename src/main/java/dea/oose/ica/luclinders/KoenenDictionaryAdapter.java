package dea.oose.ica.luclinders;

import nl.oose.dea.koenenkramers.KoenenDictionary;

public class KoenenDictionaryAdapter implements IDictionary {
    private KoenenDictionary instance;
    private final String DICTIONARY_NAME = "Koenen";

    public KoenenDictionaryAdapter(KoenenDictionary koenenDictionary) {
        this.instance = koenenDictionary;
    }

    public String translate(String word) throws WordNotFoundInDictionaryException {
        instance.openEnglishDutch();
        if (instance.lookUp(word) == null)
            throw new WordNotFoundInDictionaryException("Word was not found in this dictionary");

        return instance.lookUp(word);
    }

    public String getName() {
        return DICTIONARY_NAME;
    }
}
