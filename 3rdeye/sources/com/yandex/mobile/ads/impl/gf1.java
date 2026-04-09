package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class gf1 implements x00 {

    /* renamed from: a, reason: collision with root package name */
    private final int f27677a;

    public gf1(int i) {
        this.f27677a = i;
    }

    @Override // com.yandex.mobile.ads.impl.x00
    public final boolean a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return this.f27677a == context.getResources().getConfiguration().orientation;
    }
}
