package dea.oose.ica.luclinders;

public interface IDictionary {

    String translate(String word) throws WordNotFoundInDictionaryException;

    String getName();

}
