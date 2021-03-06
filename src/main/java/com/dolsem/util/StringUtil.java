package com.dolsem.util;

import java.util.Collections;

public final class StringUtil {

    private StringUtil() {};

    public static String repeat(String string, int times) {
        return String.join("", Collections.nCopies(times, string));
    }
}
