package Bean;

/**
 * Created by Nick on 2/12/2017.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public void spellCheck(){
       spellChecker.checkSpell();
    }
}
