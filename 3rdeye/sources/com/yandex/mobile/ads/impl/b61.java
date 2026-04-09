package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class b61 implements a61 {

    /* renamed from: a, reason: collision with root package name */
    private final c61 f25092a;

    /* renamed from: b, reason: collision with root package name */
    private final x51 f25093b;

    public b61(Context context, vu1 sdkEnvironmentModule, l61 requestData, c61 nativeAdLoadingItemFinishedListener, C4198s4 adLoadingPhasesManager, ns adType, C4072a3 adConfiguration, w51 nativeAdLoadListenerFactory, y51 nativeAdLoadManagerFactory) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(requestData, "requestData");
        kotlin.jvm.internal.l.f(nativeAdLoadingItemFinishedListener, "nativeAdLoadingItemFinishedListener");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(adType, "adType");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(nativeAdLoadListenerFactory, "nativeAdLoadListenerFactory");
        kotlin.jvm.internal.l.f(nativeAdLoadManagerFactory, "nativeAdLoadManagerFactory");
        this.f25092a = nativeAdLoadingItemFinishedListener;
        g61 g61VarA = w51.a(context, adConfiguration, adLoadingPhasesManager, this);
        x51 x51VarA = y51.a(context, sdkEnvironmentModule, requestData, adConfiguration, g61VarA, adLoadingPhasesManager);
        this.f25093b = x51VarA;
        g61VarA.a(x51VarA.f());
    }

    @Override // com.yandex.mobile.ads.impl.a61
    public final void a() {
        this.f25092a.a(this);
    }

    public final void b() {
        this.f25093b.y();
    }

    public final void c() {
        this.f25093b.z();
    }

    public final void a(ot otVar) {
        this.f25093b.a(otVar);
    }

    public final void a(ut utVar) {
        this.f25093b.a(utVar);
    }

    public final void a(du duVar) {
        this.f25093b.a(duVar);
    }

    public /* synthetic */ b61(Context context, vu1 vu1Var, l61 l61Var, c61 c61Var, ns nsVar, int i) {
        C4198s4 c4198s4 = new C4198s4();
        ns nsVar2 = (i & 32) != 0 ? ns.f30991g : nsVar;
        this(context, vu1Var, l61Var, c61Var, c4198s4, nsVar2, new C4072a3(nsVar2, vu1Var), new w51(), new y51());
    }
}
