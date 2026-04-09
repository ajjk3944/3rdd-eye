package com.bytedance.adsdk.ugeno.uym;

/* loaded from: classes.dex */
public final class xq {
    public static float emc(String str, float f2) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f2;
        }
    }

    public static int emc(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static long emc(String str, long j6) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j6;
        }
    }

    public static double emc(String str, double d6) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d6;
        }
    }

    public static boolean emc(String str, boolean z6) {
        try {
            return Boolean.parseBoolean(str);
        } catch (NumberFormatException unused) {
            return z6;
        }
    }
}
