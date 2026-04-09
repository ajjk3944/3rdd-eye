package com.bytedance.adsdk.ugeno.ra;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {
    public static float ouw(String str, float f10) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return f10;
        }
    }

    public static double vt(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return 0.0d;
        }
    }

    public static int ouw(String str, int i4) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return i4;
        }
    }

    public static long ouw(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static boolean ouw(String str, boolean z3) {
        try {
            return Boolean.parseBoolean(str);
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return z3;
        }
    }
}
