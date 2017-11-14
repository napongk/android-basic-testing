package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by student on 11/10/2017 AD.
 */

public class NameValidationFailTest {

    @Test
    public void ชื่อว่างเปล่า() {
        NameValidation validation = new NameValidation();
        boolean result = validation.checkEmptyName("");
        assertTrue("",result);
    }

    @Test
    public void ความยาวชื่อน้อยกว่า2() {
        NameValidation validation = new NameValidation();
        boolean result = validation.checkNameLengthPass("a");
        assertFalse("",result);
    }

    @Test
    public void ความยาวชื่อมากกว่า20() {
        NameValidation validation = new NameValidation();
        boolean result = validation.checkNameLengthPass("aaaaaaaaaaaaaaaaaaaaa");
        assertFalse("",result);
    }
}
