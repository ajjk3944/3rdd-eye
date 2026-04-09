package com.bytedance.adsdk.emc.ypw.bw;

/* loaded from: classes.dex */
public class emc {
    public static boolean dg(char c10) {
        return '+' == c10 || '-' == c10 || '*' == c10 || '/' == c10 || '%' == c10 || '=' == c10 || '>' == c10 || '<' == c10 || '!' == c10 || '&' == c10 || '|' == c10 || '?' == c10 || ':' == c10;
    }

    public static boolean emc(char c10) {
        return c10 == ' ';
    }

    public static boolean xq(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public static boolean ypw(char c10) {
        if (c10 < 'A' || c10 > 'Z') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }
}
