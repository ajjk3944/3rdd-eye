package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.TypedArray;

/* loaded from: classes3.dex */
public final class hh {
    public static final int a(Context context, int i) {
        int color;
        kotlin.jvm.internal.l.f(context, "<this>");
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        kotlin.jvm.internal.l.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            color = typedArrayObtainStyledAttributes.getColor(0, 0);
        } catch (Exception unused) {
            color = -16777216;
        }
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }
}
