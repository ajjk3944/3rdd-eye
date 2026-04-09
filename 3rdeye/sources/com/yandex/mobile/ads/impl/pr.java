package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class pr implements cj {
    @Override // com.yandex.mobile.ads.impl.cj
    public final int a(Context context, int i, ef1 orientation) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(orientation, "orientation");
        float fA = jh2.a(context, orientation) * 0.15f;
        if (100.0f <= fA) {
            fA = 100.0f;
        }
        int iX = i > 655 ? com.google.gson.internal.c.x((i / 728.0d) * 90.0d) : i > 632 ? 81 : i > 526 ? com.google.gson.internal.c.x((i / 468.0d) * 60.0d) : i > 432 ? 68 : com.google.gson.internal.c.x((i / 320.0d) * 50.0d);
        int i10 = (int) fA;
        if (iX > i10) {
            iX = i10;
        }
        if (iX < 50) {
            return 50;
        }
        return iX;
    }
}
