package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class cu {

    /* renamed from: a, reason: collision with root package name */
    private final zr1 f25768a;

    public cu(Context context, zr1 adLoadController) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adLoadController, "adLoadController");
        this.f25768a = adLoadController;
        C4146l0.a(context);
    }

    public final void a() {
        this.f25768a.a();
    }

    public final void a(h7 adRequestData) {
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        this.f25768a.a(adRequestData);
    }

    public final void a(qm2 qm2Var) {
        this.f25768a.a(qm2Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cu(Context context, rm2 sdkEnvironmentModule) {
        this(context, as1.a(context, sdkEnvironmentModule));
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
    }
}
