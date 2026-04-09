package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class kt1 implements cj {
    @Override // com.yandex.mobile.ads.impl.cj
    public final int a(Context context, int i, ef1 orientation) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(orientation, "orientation");
        int iA = jh2.a(context, orientation);
        float f10 = orientation == ef1.f26821c ? 90.0f : 100.0f;
        float f11 = iA * 0.15f;
        if (f10 > f11) {
            f10 = f11;
        }
        if (f10 < 50.0f) {
            f10 = 50.0f;
        }
        return com.google.gson.internal.c.y(f10);
    }
}
