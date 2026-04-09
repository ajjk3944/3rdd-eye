package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;

/* loaded from: classes3.dex */
public final class j10 {
    public static int a(Context context, float f10) {
        kotlin.jvm.internal.l.f(context, "context");
        return com.google.gson.internal.c.y(TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics()));
    }
}
