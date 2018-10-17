package eu.chargetime.ocpp.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utilities for model classes. Used to validate values.
 */
public abstract class ModelUtil {

    /**
     * Check if a value is in a list of values.
     *
     * @param needle   value we want to search for.
     * @param hayStack list of value that we search in.
     * @return true if value was found in list.
     */
    public static boolean isAmong(String needle, String... hayStack) {
        boolean found = false;
        if (hayStack != null) {
            for (String straw : hayStack) {
                if (found = isNullOrEqual(straw, needle)) {
                    break;
                }
            }
        }
        return found;
    }

    /**
     * Compares two values.
     * @param object1   Right value to compare.
     * @param object2   Left value to compare.
     * @return Both values are null or equal.
     */
    private static boolean isNullOrEqual(Object object1, Object object2) {
        boolean nullOrEqual = false;
        if (object1 == null && object2 == null) {
            nullOrEqual = true;
        } else if (object1 != null && object2 != null) {
            nullOrEqual = object1.equals(object2);
        }
        return nullOrEqual;
    }

    /**
     * Check if a string exceeds a given length.
     *
     * @param input         The string to check.
     * @param maxLength     The largest length accepted.
     * @return The string length does not exceed max length.
     */
    public static boolean validate(String input, int maxLength) {
        return input != null && input.length() <= maxLength;
    }

    /**
     * 校验字符串，判断是否属于IdentifierString类型的字符串。
     * IdentifierString只允许使用以下字符：
     * a-z, A-Z, 0-9, '*', '-', '_', '=', ':', '+', '|', '@', '.'
     *
     * @param input         The string to check.
     * @return 是否属于IdentifierString类型
     */
    public static boolean validateIdentifierString(String input) {
        String allowCharsRegEx ="^[a-zA-Z0-9*-_=:+|@\\.]+$";
        return input != null && Pattern.matches(allowCharsRegEx,input);
    }

}
