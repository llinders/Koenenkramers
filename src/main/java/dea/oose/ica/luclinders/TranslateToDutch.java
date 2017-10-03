package dea.oose.ica.luclinders;

public class TranslateToDutch {
    private IDictionary koenen;
    private IDictionary kramers;

    public static void main(String[] args) {
        TranslateToDutch translator = new TranslateToDutch();
        translator.translate();
    }

    public TranslateToDutch() {
        DictionaryFactory dictionaryFactory = DictionaryFactory.getInstance();
        koenen = dictionaryFactory.createDictionary(DictionaryType.KOENEN);
        kramers = dictionaryFactory.createDictionary(DictionaryType.KRAMERS);
    }

    private void translate() {
        System.out.println(koenen.getName());
        System.out.println(kramers.getName());
        try {
            System.out.println(koenen.translate("cat"));
        } catch (WordNotFoundInDictionaryException e) {
            e.printStackTrace();
        }
    }
}
