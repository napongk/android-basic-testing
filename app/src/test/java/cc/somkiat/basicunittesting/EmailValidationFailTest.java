package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by napkkk on 15/11/2560.
 */

public class EmailValidationFailTest {
    EmailValidation validation = new EmailValidation();

    @Test
    public void อีเมลว่างเปล่า() {
        boolean result = validation.checkEmptyEMail("");
        assertTrue("",result);
    }

    @Test
    public void อีเมลไม่ตรงรูปแบบ() {
        boolean result = validation.checkEmailPattern("ee");
        assertFalse("",result);
    }
}
