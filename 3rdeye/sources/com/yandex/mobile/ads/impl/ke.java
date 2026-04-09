package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class ke {
    public static final String a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
            fp0.c(new Object[0]);
            return null;
        }
    }

    public static final String b(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            fp0.c(new Object[0]);
            return null;
        }
    }
}
