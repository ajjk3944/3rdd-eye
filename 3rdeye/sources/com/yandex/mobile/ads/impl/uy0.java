package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class uy0 implements cj {
    @Override // com.yandex.mobile.ads.impl.cj
    public final int a(Context context, int i, ef1 orientation) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(orientation, "orientation");
        return (i <= 632 || 90.0f > ((float) jh2.a(context, orientation)) * 0.15f) ? 50 : 90;
    }
}
