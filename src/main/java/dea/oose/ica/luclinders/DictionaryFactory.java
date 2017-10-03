package dea.oose.ica.luclinders;

import nl.oose.dea.koenenkramers.KoenenDictionary;
import nl.oose.dea.koenenkramers.KramersDictionary;

public class DictionaryFactory {
    private static DictionaryFactory instance;
    private IDictionary dictionary;

    private DictionaryFactory() {
    }

    public static DictionaryFactory getInstance() {
        if (instance == null)
            instance = new DictionaryFactory();
        return instance;
    }

    public IDictionary createDictionary(DictionaryType type) {
        switch (type) {
            case KOENEN:
                KoenenDictionary koenenDictionary = new KoenenDictionary();
                dictionary = new KoenenDictionaryAdapter(koenenDictionary);
                break;
            case KRAMERS:
                KramersDictionary kramersDictionary = new KramersDictionary();
                dictionary = new KramersDictionaryAdapter(kramersDictionary);
                break;

        }
        return dictionary;
    }
}
