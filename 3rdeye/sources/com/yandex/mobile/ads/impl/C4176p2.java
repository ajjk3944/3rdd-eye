package com.yandex.mobile.ads.impl;

import android.content.Context;

/* renamed from: com.yandex.mobile.ads.impl.p2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4176p2 {

    /* renamed from: a, reason: collision with root package name */
    private final C4078b2 f31567a;

    /* renamed from: b, reason: collision with root package name */
    private final xf2 f31568b;

    public C4176p2(Context context, C4078b2 adBreak) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        this.f31567a = adBreak;
        this.f31568b = new xf2(context);
    }

    public final void a() {
        this.f31568b.a(this.f31567a, "breakEnd");
    }

    public final void b() {
        this.f31568b.a(this.f31567a, com.vungle.ads.internal.presenter.g.ERROR);
    }

    public final void c() {
        this.f31568b.a(this.f31567a, "breakStart");
    }
}
