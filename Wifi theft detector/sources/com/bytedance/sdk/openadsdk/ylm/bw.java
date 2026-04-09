package com.bytedance.sdk.openadsdk.ylm;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;

/* loaded from: classes.dex */
public class bw {
    protected static long bw = 15360;
    protected static int dg = 30;
    protected static String emc = "images";
    public static int gbl = 16;
    public static int msw = 2;
    public static int ru = 8;
    public static int sup = 32;
    public static int uym = 1;
    protected static int xq = 1;
    public static int ycc = 0;
    protected static String ypw = null;
    public static int zz = 4;

    public static boolean emc(Context context, String str) {
        return false;
    }

    public static boolean ypw(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    public static Bitmap emc(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static float ypw(Context context) {
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static boolean emc(Context context, int i10) {
        boolean zEmc;
        boolean zEmc2;
        if (ycc == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                zEmc = emc(context, "android.permission.READ_MEDIA_IMAGES");
                zEmc2 = true;
            } else {
                zEmc = emc(context, "android.permission.READ_EXTERNAL_STORAGE");
                zEmc2 = emc(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean zEmc3 = emc(context, "android.permission.CAMERA");
            boolean zEmc4 = emc(context, "android.permission.RECORD_AUDIO");
            PackageManager packageManager = context.getPackageManager();
            if (zEmc && zEmc2) {
                ycc |= uym;
            }
            if (zEmc3 && packageManager.hasSystemFeature("android.hardware.camera")) {
                ycc |= msw;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                ycc |= zz;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                ycc |= ru;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                ycc |= gbl;
            }
            if (zEmc4 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                ycc |= sup;
            }
        }
        return (ycc & i10) != 0;
    }

    public static boolean emc(Context context) {
        boolean z10;
        boolean z11;
        if (Build.VERSION.SDK_INT >= 33) {
            z10 = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z10 = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z11 = false;
            }
            return !z11 && z10;
        }
        z11 = true;
        if (z11) {
        }
    }
}
