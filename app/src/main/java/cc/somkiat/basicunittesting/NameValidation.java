package cc.somkiat.basicunittesting;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by student on 11/10/2017 AD.
 */

class NameValidation {

    public boolean checknullName(String name) {
        return name == null;
    }

    public boolean checkEmptyName(String name){
        return name.equals("");
    }



    public boolean checkNameLengthPass(String name) {
        if(name.length() < 2){
            return false;
        }
        else if(name.length() > 20){
            return false;
        }
        return true;
    }

    public boolean checkNameAlphabet(String name){
        Pattern pattern;
        Matcher matcher;
        String NAME_PATTERN = "^[a-zA-Z ]+$";
        pattern = Pattern.compile(NAME_PATTERN);
        matcher = pattern.matcher(name);
        return matcher.matches();
        }

    public boolean validate(String name){
        return !checknullName(name) && !checkEmptyName(name) && checkNameLengthPass(name) && checkNameAlphabet(name);
    }

}
