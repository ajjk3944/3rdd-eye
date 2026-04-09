package com.bytedance.adsdk.emc.ypw.bw;

/* loaded from: classes.dex */
public class emc {
    public static boolean dg(char c6) {
        return '+' == c6 || '-' == c6 || '*' == c6 || '/' == c6 || '%' == c6 || '=' == c6 || '>' == c6 || '<' == c6 || '!' == c6 || '&' == c6 || '|' == c6 || '?' == c6 || ':' == c6;
    }

    public static boolean emc(char c6) {
        return c6 == ' ';
    }

    public static boolean xq(char c6) {
        return c6 >= '0' && c6 <= '9';
    }

    public static boolean ypw(char c6) {
        if (c6 < 'A' || c6 > 'Z') {
            return c6 >= 'a' && c6 <= 'z';
        }
        return true;
    }
}
