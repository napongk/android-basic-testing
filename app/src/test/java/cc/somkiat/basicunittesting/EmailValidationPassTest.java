package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by napkkk on 15/11/2560.
 */

public class EmailValidationPassTest {
    @Test
    public void อีเมลตรงรูปแบบ() {
        EmailValidation validation = new EmailValidation();
        boolean result = validation.checkEmailPattern("ee@gmail.com");
        assertTrue("",result);
    }
}
