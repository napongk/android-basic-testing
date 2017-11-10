package cc.somkiat.basicunittesting;

/**
 * Created by student on 11/10/2017 AD.
 */

class NameValidation {

    public boolean validate(String name){
        return isEmpty(name);
    }

    public boolean isEmpty(String name) {
        if(name.isEmpty()){
            return false;
        }
        return true;
    }

    public boolean isNull(String name) {
        if(name == null){
            return false;
        }
        return true;
    }

}
