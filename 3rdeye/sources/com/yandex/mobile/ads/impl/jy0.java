package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener;

/* loaded from: classes3.dex */
public final class jy0 implements b81 {

    /* renamed from: a, reason: collision with root package name */
    private final fx0<MediatedNativeAdapter, MediatedNativeAdapterListener> f29381a;

    /* renamed from: b, reason: collision with root package name */
    private final j71 f29382b;

    public jy0(x51 nativeAdLoadManager, a8<p61> adResponse, vy0 mediationData, C4072a3 adConfiguration, zx0 extrasCreator, ux0 mediatedAdapterReporter, nx0<MediatedNativeAdapter> mediatedAdProvider, gy0 mediatedAdCreator, C4198s4 adLoadingPhasesManager, cg1 passbackAdLoader, hy0 mediatedNativeAdLoader, fx0<MediatedNativeAdapter, MediatedNativeAdapterListener> mediatedAdController, j71 mediatedNativeAdapterListener) {
        kotlin.jvm.internal.l.f(nativeAdLoadManager, "nativeAdLoadManager");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(mediationData, "mediationData");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(extrasCreator, "extrasCreator");
        kotlin.jvm.internal.l.f(mediatedAdapterReporter, "mediatedAdapterReporter");
        kotlin.jvm.internal.l.f(mediatedAdProvider, "mediatedAdProvider");
        kotlin.jvm.internal.l.f(mediatedAdCreator, "mediatedAdCreator");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(passbackAdLoader, "passbackAdLoader");
        kotlin.jvm.internal.l.f(mediatedNativeAdLoader, "mediatedNativeAdLoader");
        kotlin.jvm.internal.l.f(mediatedAdController, "mediatedAdController");
        kotlin.jvm.internal.l.f(mediatedNativeAdapterListener, "mediatedNativeAdapterListener");
        this.f29381a = mediatedAdController;
        this.f29382b = mediatedNativeAdapterListener;
    }

    @Override // com.yandex.mobile.ads.impl.b81
    public final void a(Context context, a8<p61> adResponse) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f29381a.a(context, (Context) this.f29382b);
    }
}
