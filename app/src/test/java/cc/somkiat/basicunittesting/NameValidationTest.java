package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NameValidationTest {
    NameValidation validation = new NameValidation();

    @Test
    public void nameIsNull() {
        boolean result = validation.checknullName(null);
        assertTrue("Name are null",result);
    }

    @Test
    public void nameIsEmpty() {
        boolean result = validation.checkEmptyName("");
        assertTrue("Name are empty",result);
    }

    @Test
    public void nameHasNotEnoughLength() {
        boolean result = validation.checkNameLengthPass("a");
        assertFalse("Too Short nmae",result);
    }

    @Test
    public void nameHasTooMuchLength() {
        boolean result = validation.checkNameLengthPass("aaaaaaaaaaaaaaaaaaaaa");
        assertFalse("Too Long name",result);
    }

    @Test
    public void nameNotOnlyAlphabet(){
        boolean result = validation.checkNameAlphabet("a1237");
        assertFalse("Only Alphabet available", result);
    }

    @Test
    public void nameIsCorrect() {
        NameValidation validation = new NameValidation();
        boolean result = validation.validate("Napong");
        assertTrue("",result);
    }
}
