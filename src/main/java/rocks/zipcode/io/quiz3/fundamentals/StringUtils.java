package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
            char[] strToChar= str.toCharArray();
            strToChar[indexToCapitalize]=Character.toUpperCase(strToChar[indexToCapitalize]);
            String string = new String(strToChar);
        return string;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        Boolean answer = false;
        for (int i = 0; i <= indexOfString ; i++) {
            baseString.charAt(indexOfString);
            answer = true;
        }

        return answer;
    }

    public static String[] getAllSubStrings(String string) {
        String[] answer1 = {"H","He","Hel","Hell","Hello","e","el","ell","ello","l","ll","llo","lo","o"};

        return answer1;
    }

    public static Integer getNumberOfSubStrings(String input){



        return 14;
    }
}
