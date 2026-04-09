package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import r3.C7571i;

/* loaded from: classes.dex */
public abstract class p {
    public static boolean a(Context context, int i10) throws PackageManager.NameNotFoundException {
        if (!b(context, i10, "com.google.android.gms")) {
            return false;
        }
        try {
            return C7571i.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    public static boolean b(Context context, int i10, String str) {
        return w3.c.a(context).f(i10, str);
    }
}
