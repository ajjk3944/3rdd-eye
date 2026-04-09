package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class vr1 extends td0<vr1> {

    /* renamed from: t, reason: collision with root package name */
    private final om1 f34655t;

    /* renamed from: u, reason: collision with root package name */
    private final rt1 f34656u;

    /* renamed from: v, reason: collision with root package name */
    private final hs1 f34657v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr1(Context context, a8<String> adResponse, C4072a3 adConfiguration, wc0<vr1> fullScreenController, om1 proxyRewardedListener, is1 rewardedExecutorProvider, dg0 htmlAdResponseReportManager, pc0 fullScreenAdVisibilityValidator, rt1 sdkAdapterReporter) {
        super(context, adResponse, adConfiguration, fullScreenAdVisibilityValidator, fullScreenController, new C4129i4());
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(fullScreenController, "fullScreenController");
        kotlin.jvm.internal.l.f(proxyRewardedListener, "proxyRewardedListener");
        kotlin.jvm.internal.l.f(rewardedExecutorProvider, "rewardedExecutorProvider");
        kotlin.jvm.internal.l.f(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        kotlin.jvm.internal.l.f(fullScreenAdVisibilityValidator, "fullScreenAdVisibilityValidator");
        kotlin.jvm.internal.l.f(sdkAdapterReporter, "sdkAdapterReporter");
        this.f34655t = proxyRewardedListener;
        this.f34656u = sdkAdapterReporter;
        this.f34657v = rewardedExecutorProvider.a(context, adResponse, adConfiguration);
        htmlAdResponseReportManager.a(adResponse);
        htmlAdResponseReportManager.a(adConfiguration);
    }

    @Override // com.yandex.mobile.ads.impl.td0, com.yandex.mobile.ads.impl.u52, com.yandex.mobile.ads.impl.InterfaceC4086c3
    public final void a(int i, Bundle bundle) {
        if (i == 13) {
            r();
        } else {
            super.a(i, bundle);
        }
    }

    public final void r() {
        this.f34656u.b(e(), d());
        hs1 hs1Var = this.f34657v;
        if (hs1Var != null) {
            hs1Var.a();
        }
    }

    public final void a(nm1 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        a((hd0) listener);
        this.f34655t.a(listener);
    }

    @Override // com.yandex.mobile.ads.impl.td0
    public final td0 o() {
        return this;
    }
}
