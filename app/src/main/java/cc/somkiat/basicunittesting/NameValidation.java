package cc.somkiat.basicunittesting;

/**
 * Created by student on 11/10/2017 AD.
 */

class NameValidation {

//    public boolean validate(String name){
//        return isEmpty(name);
//    }

    public boolean checkEmptyName(String name){
        return name == null || name.equals("");
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

}
