package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f34874a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th2) {
        try {
            AbstractC7901p.l(context);
            AbstractC7901p.l(th2);
            return false;
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
            return false;
        }
    }
}
