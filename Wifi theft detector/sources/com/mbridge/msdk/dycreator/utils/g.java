package com.mbridge.msdk.dycreator.utils;

import android.util.Log;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f14598a = false;

    public static void a(String str) {
        if (f14598a) {
            new SecurityManager();
            Log.e(new Throwable().getStackTrace()[1].getFileName(), str);
        }
    }
}
