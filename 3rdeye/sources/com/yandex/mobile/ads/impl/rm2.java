package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class rm2 implements vu1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f32714a;

    public rm2(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f32714a = es.a(context);
    }

    @Override // com.yandex.mobile.ads.impl.vu1
    public final ym2 a() {
        return new ym2(new le1());
    }

    @Override // com.yandex.mobile.ads.impl.vu1
    public final bl2 b() {
        return new bl2();
    }

    @Override // com.yandex.mobile.ads.impl.vu1
    public final g01 c() {
        return gd.a(this.f32714a, wm2.f35021a, new bl2());
    }

    @Override // com.yandex.mobile.ads.impl.vu1
    public final bn2 d() {
        return new bn2(new le1());
    }

    @Override // com.yandex.mobile.ads.impl.vu1
    public final sm2 e() {
        return new sm2();
    }

    @Override // com.yandex.mobile.ads.impl.vu1
    public final void f() {
        wm2 wm2Var = wm2.f35021a;
    }
}
