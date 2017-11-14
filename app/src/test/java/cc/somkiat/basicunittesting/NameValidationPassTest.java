package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by napkkk on 15/11/2560.
 */

public class NameValidationPassTest {

    @Test
    public void ชื่ออยู่ในเงื่อนไข() {
        String name = "Napong";
        NameValidation validation = new NameValidation();
        boolean result = validation.checkEmptyName(name);
        boolean result2 = validation.checkNameLengthPass(name);
        assertFalse("",result);
        assertTrue("",result2);
    }
}
