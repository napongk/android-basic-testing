package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * Created by student on 11/10/2017 AD.
 */

public class NameValidationFailTest {

    @Test
    public void nameIsEmpty() {
        NameValidation validation = new NameValidation();
        boolean result = validation.isEmpty("");
        assertFalse("",result);
    }
}
