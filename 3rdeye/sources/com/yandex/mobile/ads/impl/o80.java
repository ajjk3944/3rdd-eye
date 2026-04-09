package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class o80 {

    /* renamed from: a, reason: collision with root package name */
    private final h80 f31293a;

    /* renamed from: b, reason: collision with root package name */
    private final h9 f31294b;

    public /* synthetic */ o80(Context context, C4072a3 c4072a3, h80 h80Var) {
        this(context, c4072a3, h80Var, new h9(context, c4072a3));
    }

    public final void a(long j4) {
        if (j4 <= this.f31293a.c()) {
            this.f31294b.a(this.f31293a.d(), m62.f30284e);
        }
    }

    public o80(Context context, C4072a3 adConfiguration, h80 falseClick, h9 adTracker) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(falseClick, "falseClick");
        kotlin.jvm.internal.l.f(adTracker, "adTracker");
        this.f31293a = falseClick;
        this.f31294b = adTracker;
    }
}
