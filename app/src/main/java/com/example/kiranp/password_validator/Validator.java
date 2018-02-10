package com.example.kiranp.password_validator;

import java.util.Locale;


public class Validator {
    public int pass_rules = 0; /*to count the number of failed rules*/

    /*validate method*/
    public int validate(String a) {
        String text1 = a;/*to get the password*/
        String text2 = text1.toLowerCase();
        String text3 = text1.toUpperCase();
        if (!((a.equalsIgnoreCase("password")))) {
            pass_rules += 1;/*rule 1 case sensitive*/
        }
        if (!(text1.length() < 9)) {
            pass_rules += 1;/*rule 2 length greater than 8*/
        }
        return pass_rules;
    }
}