package dea.oose.ica.luclinders;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DictionaryFactoryTest {

    @Test
    public void testTranslateKoenen() throws WordNotFoundInDictionaryException {
        // init
        IDictionary dictionary = DictionaryFactory.getInstance().createDictionary(DictionaryType.KOENEN);

        // test
        String translated = dictionary.translate("cat");

        // check
        assertEquals("kat", translated);
    }

    @Test
    public void testTranslateKramers() throws WordNotFoundInDictionaryException {
        // init
        IDictionary dictionary = DictionaryFactory.getInstance().createDictionary(DictionaryType.KRAMERS);

        // test
        String translated = dictionary.translate("cat");

        // check
        assertEquals("kat", translated);
    }

    @Test (expected = WordNotFoundInDictionaryException.class)
    public void testTranslateKoenenNonExistingWord() throws WordNotFoundInDictionaryException {
        // init
        IDictionary dictionary = DictionaryFactory.getInstance().createDictionary(DictionaryType.KOENEN);

        // test
        String translated = dictionary.translate("nonexistingword");
    }

    @Test (expected = WordNotFoundInDictionaryException.class)
    public void testTranslateKramersNonExistingWord() throws WordNotFoundInDictionaryException {
        // init
        IDictionary dictionary = DictionaryFactory.getInstance().createDictionary(DictionaryType.KRAMERS);

        // test
        String translated = dictionary.translate("nonexistingword");
    }

    @Test
    public void testGetNameKoenen() {
        // init
        IDictionary dictionary = DictionaryFactory.getInstance().createDictionary(DictionaryType.KOENEN);

        // test
        String name = dictionary.getName();

        // check
        assertEquals("Koenen", name);
    }

    @Test
    public void testGetNameKramers() {
        // init
        IDictionary dictionary = DictionaryFactory.getInstance().createDictionary(DictionaryType.KRAMERS);

        // test
        String name = dictionary.getName();

        // check
        assertEquals("Kramers", name);
    }

}