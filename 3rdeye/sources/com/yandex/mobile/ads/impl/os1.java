package com.yandex.mobile.ads.impl;

import android.os.Build;
import java.io.File;

/* loaded from: classes3.dex */
public final class os1 {

    /* renamed from: a, reason: collision with root package name */
    public static final os1 f31497a = new os1();

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f31498b = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};

    private os1() {
    }

    public static boolean a() {
        try {
            if (new File("/system/app/Superuser/Superuser.apk").exists()) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            String[] strArr = f31498b;
            boolean z10 = false;
            for (int i = 0; i < 8; i++) {
                z10 = z10 || (Build.VERSION.SDK_INT < 31 && new File(strArr[i]).exists());
            }
            if (z10) {
                return true;
            }
        } catch (Throwable unused2) {
        }
        return false;
    }
}
