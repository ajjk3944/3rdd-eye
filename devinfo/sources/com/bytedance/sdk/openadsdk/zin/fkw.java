package com.bytedance.sdk.openadsdk.zin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw {
    public static int bly = 4;

    /* renamed from: cf, reason: collision with root package name */
    public static int f8861cf = 16;
    protected static long fkw = 15360;

    /* renamed from: le, reason: collision with root package name */
    public static int f8862le = 0;

    /* renamed from: lh, reason: collision with root package name */
    protected static int f8863lh = 1;
    protected static String ouw = "images";
    public static int pno = 2;
    public static int ra = 1;
    public static int ryl = 32;
    public static int tlj = 8;
    protected static String vt = null;
    protected static int yu = 30;

    public static boolean ouw() {
        return false;
    }

    public static float vt(Context context) {
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static Bitmap ouw(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static boolean ouw(Context context, int i4) {
        if (f8862le == 0) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                f8862le |= bly;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                f8862le |= tlj;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                f8862le |= f8861cf;
            }
        }
        return (f8862le & i4) != 0;
    }

    public static boolean ouw(Context context) {
        boolean z3;
        boolean z10;
        if (Build.VERSION.SDK_INT >= 33) {
            z3 = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z3 = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z10 = false;
            }
            return !z10 && z3;
        }
        z10 = true;
        if (z10) {
        }
    }

    public static boolean ouw(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }
}
