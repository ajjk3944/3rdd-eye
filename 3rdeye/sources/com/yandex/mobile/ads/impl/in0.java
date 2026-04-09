package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class in0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4118h0 f28756a;

    public in0(Context context, vu1 sdkEnvironmentModule, nu creative, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(creative, "creative");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        a aVar = new a();
        qu quVarD = creative.d();
        this.f28756a = new C4118h0(context, adConfiguration, null, aVar, quVarD != null ? quVarD.a() : null);
    }

    public final void a() {
        this.f28756a.e();
    }

    public static final class a implements InterfaceC4132j0 {
        @Override // com.yandex.mobile.ads.impl.InterfaceC4132j0
        public final void onReturnedToApplication() {
        }
    }
}
