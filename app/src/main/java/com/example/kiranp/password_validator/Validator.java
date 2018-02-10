package com.example.kiranp.password_validator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validator {
    public int pass_rules = 0; /*to count the number of failed rules*/

    /*validate method*/
    public int validate(String a) {
        pass_rules = 0;
        String text1 = a;/*to get the password*/
        if (!((a.equalsIgnoreCase("password")))) {
            pass_rules += 1;/*rule 1 case sensitive*/
        }
        if (!(text1.length() < 9)) {
            pass_rules += 1;/*rule 2 length greater than 8*/
        }
        Pattern special = Pattern.compile("[^a-z A-Z0-9]");
        Matcher special_charac = special.matcher(text1);
        if (special_charac.find()){
            pass_rules += 1;/* 3rd rule,one special character must in password*/
        }
        Pattern repeat = Pattern.compile("(?=(.)\\1{3})(\\1+)");
        Matcher repeat_charac = repeat.matcher(text1);
        if (!(repeat_charac.find())){
            pass_rules += 1;/* 4th rule, not more than 3 consecutive repeated letters*/
        }
        Pattern number = Pattern.compile("[0-9]");
        Matcher numb_present = number.matcher(text1);
        if (numb_present.find()){
            pass_rules += 1;/* 5th rule,one number must in password*/
        }
        return pass_rules;
    }
}