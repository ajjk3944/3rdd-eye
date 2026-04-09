package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class jt1 implements cj {
    @Override // com.yandex.mobile.ads.impl.cj
    public final int a(Context context, int i, ef1 orientation) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(orientation, "orientation");
        float fA = jh2.a(context, orientation) * 0.15f;
        if (100.0f <= fA) {
            fA = 100.0f;
        }
        if (fA < 50.0f) {
            fA = 50.0f;
        }
        return com.google.gson.internal.c.y(fA);
    }
}
