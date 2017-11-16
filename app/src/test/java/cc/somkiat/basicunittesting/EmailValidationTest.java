package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by napkkk on 15/11/2560.
 */

public class EmailValidationTest {
    EmailValidation validation = new EmailValidation();

    @Test
    public void emailIsNull() {
        boolean result = validation.checknullEmail(null);
        assertTrue("Email are null",result);
    }

    @Test
    public void emailAreEmpty() {
        boolean result = validation.checkEmptyEMail("");
        assertTrue("",result);
    }

    @Test
    public void emailHasOnlyName() {
        boolean result = validation.checkEmailPattern("abc");
        assertFalse("",result);
    }

    @Test
    public void emailHasNameAndSign() {
        boolean result = validation.checkEmailPattern("abc@");
        assertFalse("",result);
    }

    @Test
    public void emailHasNameSignandHost() {
        boolean result = validation.checkEmailPattern("abc@domain");
        assertFalse("",result);
    }

    @Test
    public void emailHasSignHostandDomain() {
        boolean result = validation.checkEmailPattern("@domain.com");
        assertFalse("",result);
    }

    @Test
    public void incorrectEmailPattern() {
        boolean result = validation.checkEmailPattern("av!s@$main.2com");
        assertFalse("",result);
    }

    @Test
    public void correctEmailPattern() {
        boolean result = validation.checkEmailPattern("abc@domain.com");
        assertTrue("",result);
    }

    @Test
    public void completeEmailPattern() {
        boolean result = validation.validate("abc@domain.com");
        assertTrue("",result);
    }
}
