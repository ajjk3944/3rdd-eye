package com.instagram.common.viewpoint.core;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class XY {
    public static byte[] A00;
    public static String[] A01 = {"fKOq3CLbRisV2HCvxbP8DswDC3h61WtS", "qQcG8iivYcbnleQXnFNfPBjKpUSTKwt1", "90Y8NMpYXvys60lz4Y4AY7bkcR6rkmkz", "C2raqoqRf1xXuaxgLg", "Co6wMAKL4SYYucOnnpwSDFFGSy", "pPL6tu27HuVGqH4ILm", "ywYYaeUt5bOEJr09A3", "jMc4mNTDFQmf2DaMzWYBnxz0IZlySjfz"};
    public static final String A02;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{27, 57, 54, 127, 44, 120, 60, 61, 44, 61, 42, 53, 49, 54, 61, 120, 49, 62, 120, 57, 40, 40, 120, 49, 43, 120, 13, 54, 49, 44, 33, 118, 55, 13, 94, 43, 16, 23, 10, 7, 94, 31, 14, 14, 68, 94, 88, 84, 86, 21, 93, 90, 88, 94, 89, 84, 84, 80, 21, 73, 94, 90, 88, 79, 21, 105, 94, 90, 88, 79, 122, 88, 79, 82, 77, 82, 79, 66, 18, 30, 28, 95, 4, 31, 24, 5, 8, 66, 21, 95, 1, 29, 16, 8, 20, 3, 95, 36, 31, 24, 5, 8, 33, 29, 16, 8, 20, 3, 48, 18, 5, 24, 7, 24, 5, 8};
    }

    static {
        A01();
        A02 = XY.class.getSimpleName();
    }

    public static boolean A02() {
        try {
            Class.forName(A00(46, 32, 44));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A03() {
        try {
            Class.forName(A00(78, 38, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH));
            if (A01[2].charAt(21) != '7') {
                throw new RuntimeException();
            }
            A01[2] = "fqSGPLRwldKX66WDmKKlg7YQ1V3cstss";
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A04(int i4, int i10) {
        return i4 >= 640 && i10 >= 640;
    }

    public static boolean A05(T8 t82) {
        boolean z3 = false;
        try {
            PackageManager packageManager = t82.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            boolean isUnity = true;
            ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(t82.getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                int length = activityInfoArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    boolean activityDeclared = A00(78, 38, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH).equals(activityInfoArr[i4].name);
                    if (!activityDeclared) {
                        i4++;
                    } else {
                        z3 = true;
                        break;
                    }
                }
            }
            if (!z3) {
                boolean activityDeclared2 = A03();
                if (!activityDeclared2) {
                    isUnity = false;
                }
            }
            boolean activityDeclared3 = t82.A05().AAO();
            if (activityDeclared3) {
                String str = A00(32, 14, 105) + isUnity;
            }
            return isUnity;
        } catch (Throwable th2) {
            if (t82.A05().AAO()) {
                Log.e(A02, A00(0, 32, 79), th2);
            }
            return false;
        }
    }
}
