package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class es {
    public static final Context a(Context context) {
        kotlin.jvm.internal.l.f(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public static final ef1 b(Context context) {
        kotlin.jvm.internal.l.f(context, "<this>");
        int i = context.getResources().getConfiguration().orientation;
        return i != 1 ? i != 2 ? ef1.f26823e : ef1.f26821c : ef1.f26822d;
    }
}
