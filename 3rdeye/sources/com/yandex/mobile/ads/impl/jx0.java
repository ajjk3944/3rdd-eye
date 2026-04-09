package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class jx0 implements h51 {

    /* renamed from: a, reason: collision with root package name */
    private final a f29378a;

    public interface a {
        void a(g51 g51Var);
    }

    public jx0(a createEventControllerListener) {
        kotlin.jvm.internal.l.f(createEventControllerListener, "createEventControllerListener");
        this.f29378a = createEventControllerListener;
    }

    @Override // com.yandex.mobile.ads.impl.h51
    public final g51 a(Context context, a8 adResponse, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        g51 g51Var = new g51(context, adConfiguration, adResponse);
        this.f29378a.a(g51Var);
        return g51Var;
    }
}
