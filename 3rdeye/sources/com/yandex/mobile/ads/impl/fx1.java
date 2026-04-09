package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class fx1 implements hs1 {

    /* renamed from: a, reason: collision with root package name */
    private final gx1 f27488a;

    /* renamed from: b, reason: collision with root package name */
    private final h9 f27489b;

    public fx1(Context context, C4072a3 adConfiguration, gx1 serverSideReward, h9 adTracker) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(serverSideReward, "serverSideReward");
        kotlin.jvm.internal.l.f(adTracker, "adTracker");
        this.f27488a = serverSideReward;
        this.f27489b = adTracker;
    }

    @Override // com.yandex.mobile.ads.impl.hs1
    public final void a() {
        this.f27489b.a(this.f27488a.c(), m62.f30288j);
    }
}
