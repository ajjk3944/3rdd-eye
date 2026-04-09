package com.bytedance.sdk.component.utils;

/* loaded from: classes.dex */
public class cf {
    private static boolean emc = false;
    private static String xq = "";
    private static int ypw = 4;

    public static boolean dg() {
        return emc;
    }

    public static void emc(String str) {
        xq = str;
    }

    public static void xq() {
        emc = false;
        emc(7);
    }

    public static void ypw() {
        emc = true;
        emc(3);
    }

    public static void emc(int i10) {
        ypw = i10;
    }

    public static boolean emc() {
        return ypw <= 3;
    }
}
