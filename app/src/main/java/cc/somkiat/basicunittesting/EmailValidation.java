package cc.somkiat.basicunittesting;

import android.text.Editable;
import android.util.Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by napkkk on 14/11/2560.
 */

public class EmailValidation {

    public boolean checkEmptyEMail(String email){
        return email == null || email.equals("");
    }

    public boolean checkEmailPattern(CharSequence email) {
        Pattern pattern;
        Matcher matcher;
        String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
