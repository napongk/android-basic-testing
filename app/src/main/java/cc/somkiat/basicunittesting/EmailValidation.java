package cc.somkiat.basicunittesting;

import android.text.Editable;

/**
 * Created by napkkk on 14/11/2560.
 */

public class EmailValidation {
    public boolean checkEmptyEMail(String email){
        return email == null || email.equals("");
    }

    public static boolean isValidEmail(CharSequence email) {
        return email != null && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}
