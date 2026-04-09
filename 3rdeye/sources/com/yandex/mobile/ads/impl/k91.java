package com.yandex.mobile.ads.impl;

import A9.C0575f;
import android.content.Context;
import com.yandex.mobile.ads.impl.z41;

/* loaded from: classes3.dex */
public final class k91 {

    /* renamed from: a, reason: collision with root package name */
    private final A9.E f29567a;

    /* renamed from: b, reason: collision with root package name */
    private final f91 f29568b;

    /* renamed from: c, reason: collision with root package name */
    private final fa1 f29569c;

    public interface a {
        void a(sk1 sk1Var, j41 j41Var);
    }

    public /* synthetic */ k91(Context context, vu1 vu1Var, C4198s4 c4198s4, v41 v41Var, A9.E e4) {
        this(context, vu1Var, c4198s4, v41Var, e4, new f91(context, e4, c4198s4, v41Var), new fa1(context, vu1Var.a()));
    }

    public final void a() {
        this.f29568b.a();
        this.f29569c.a();
        A9.F.b(this.f29567a, null);
    }

    public k91(Context context, vu1 sdkEnvironmentModule, C4198s4 adLoadingPhasesManager, v41 controllers, A9.E coroutineScope, f91 nativeMediaLoader, fa1 nativeVerificationResourcesLoader) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(controllers, "controllers");
        kotlin.jvm.internal.l.f(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.l.f(nativeMediaLoader, "nativeMediaLoader");
        kotlin.jvm.internal.l.f(nativeVerificationResourcesLoader, "nativeVerificationResourcesLoader");
        this.f29567a = coroutineScope;
        this.f29568b = nativeMediaLoader;
        this.f29569c = nativeVerificationResourcesLoader;
    }

    public final void a(Context context, C4072a3 adConfiguration, j41 nativeAdBlock, z41.a.C0427a listener, zv debugEventReporter, x41 nativeAdCreationListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(nativeAdBlock, "nativeAdBlock");
        kotlin.jvm.internal.l.f(listener, "listener");
        kotlin.jvm.internal.l.f(debugEventReporter, "debugEventReporter");
        kotlin.jvm.internal.l.f(nativeAdCreationListener, "nativeAdCreationListener");
        C0575f.e(this.f29567a, new m91(nativeAdCreationListener), null, new l91(context, nativeAdCreationListener, listener, this, adConfiguration, nativeAdBlock, debugEventReporter, null), 2);
    }
}
