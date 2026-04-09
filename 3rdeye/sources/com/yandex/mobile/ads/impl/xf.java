package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class xf {
    public static boolean a(String str) {
        char c10;
        if ("rtsp" == str) {
            return true;
        }
        if (4 != str.length()) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if ("rtsp".charAt(i) != str.charAt(i) && ((c10 = (char) ((r5 | ' ') - 97)) >= 26 || c10 != ((char) ((r6 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static String b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c10 = charArray[i];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        charArray[i] = (char) (c10 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String c(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c10 = charArray[i];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i] = (char) (c10 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }
}
