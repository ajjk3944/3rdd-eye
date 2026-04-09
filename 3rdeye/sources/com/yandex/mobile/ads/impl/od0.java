package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class od0 implements v8 {
    @Override // com.yandex.mobile.ads.impl.v8
    public final boolean a(Context context, vy1 sizeInfo) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sizeInfo, "sizeInfo");
        return sizeInfo.c(context) > 0 && sizeInfo.a(context) > 0;
    }
}
