package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class x51 extends vj<p61> {

    /* renamed from: A, reason: collision with root package name */
    private final x22 f35185A;

    /* renamed from: B, reason: collision with root package name */
    private final z41 f35186B;

    /* renamed from: C, reason: collision with root package name */
    private final a f35187C;

    /* renamed from: D, reason: collision with root package name */
    private final m51 f35188D;

    /* renamed from: w, reason: collision with root package name */
    private final l61 f35189w;

    /* renamed from: x, reason: collision with root package name */
    private final g61 f35190x;

    /* renamed from: y, reason: collision with root package name */
    private final r61 f35191y;

    /* renamed from: z, reason: collision with root package name */
    private final u61 f35192z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x51(Context context, vu1 sdkEnvironmentModule, l61 requestData, C4072a3 adConfiguration, g61 nativeAdOnLoadListener, C4198s4 adLoadingPhasesManager, A9.E coroutineScope, r61 adResponseControllerFactoryCreator, u61 nativeAdResponseReportManager, x22 strongReferenceKeepingManager, z41 nativeAdCreationManager) {
        super(context, adLoadingPhasesManager, adConfiguration, coroutineScope);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(requestData, "requestData");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(nativeAdOnLoadListener, "nativeAdOnLoadListener");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.l.f(adResponseControllerFactoryCreator, "adResponseControllerFactoryCreator");
        kotlin.jvm.internal.l.f(nativeAdResponseReportManager, "nativeAdResponseReportManager");
        kotlin.jvm.internal.l.f(strongReferenceKeepingManager, "strongReferenceKeepingManager");
        kotlin.jvm.internal.l.f(nativeAdCreationManager, "nativeAdCreationManager");
        this.f35189w = requestData;
        this.f35190x = nativeAdOnLoadListener;
        this.f35191y = adResponseControllerFactoryCreator;
        this.f35192z = nativeAdResponseReportManager;
        this.f35185A = strongReferenceKeepingManager;
        this.f35186B = nativeAdCreationManager;
        this.f35187C = new a();
        this.f35188D = new m51(context, this, this);
        nativeAdOnLoadListener.a(nativeAdResponseReportManager);
    }

    @Override // com.yandex.mobile.ads.impl.vj
    public final boolean a(h7 h7Var) {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.vj
    public final synchronized void b(h7 h7Var) {
        throw null;
    }

    @Override // com.yandex.mobile.ads.impl.vj
    @SuppressLint({"VisibleForTests"})
    public final C4128i3 x() {
        return n().c();
    }

    public final void y() {
        c();
        p().a();
        g().a();
        this.f35190x.a();
        this.f35185A.a(kq0.f29755b, this);
        a(EnumC4219v4.f34335b);
        this.f35186B.a();
    }

    public final void z() {
        h7 h7VarA = this.f35189w.a();
        if (!this.f35189w.d().a()) {
            b(i7.q());
            return;
        }
        C4198s4 c4198s4I = i();
        EnumC4191r4 enumC4191r4 = EnumC4191r4.f32456e;
        uj.a(c4198s4I, enumC4191r4, "adLoadingPhaseType", enumC4191r4, null);
        this.f35185A.b(kq0.f29755b, this);
        f().a(Integer.valueOf(this.f35189w.b()));
        f().a(h7VarA.a());
        f().a(this.f35189w.c());
        f().a(h7VarA.l());
        f().a(this.f35189w.e());
        synchronized (this) {
            c(h7VarA);
        }
    }

    public final class a implements x41 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.x41
        public final void a(C4128i3 error) {
            kotlin.jvm.internal.l.f(error, "error");
            x51.this.i().a(EnumC4191r4.f32456e);
            x51.this.b(error);
        }

        @Override // com.yandex.mobile.ads.impl.x41
        public final void a(h61 nativeAd) {
            kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
            x51.this.t();
            x51.this.f35190x.a(nativeAd);
        }

        @Override // com.yandex.mobile.ads.impl.x41
        public final void a(ArrayList nativeAds) {
            kotlin.jvm.internal.l.f(nativeAds, "nativeAds");
            x51.this.t();
            x51.this.f35190x.a(nativeAds);
        }

        @Override // com.yandex.mobile.ads.impl.x41
        public final void a(a81 sliderAd) {
            kotlin.jvm.internal.l.f(sliderAd, "sliderAd");
            x51.this.t();
            x51.this.f35190x.a(sliderAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vj
    public final tj<p61> a(String url, String query) {
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(query, "query");
        return this.f35188D.a(this.f35189w.d(), f(), this.f35189w.a(), url, query);
    }

    public final void a(a8<p61> adResponse, j51 adFactoriesProvider) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adFactoriesProvider, "adFactoriesProvider");
        if (h()) {
            return;
        }
        this.f35186B.a(adResponse, adResponse.I(), adFactoriesProvider, this.f35187C);
    }

    @Override // com.yandex.mobile.ads.impl.vj
    public final void a(C4128i3 error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f35190x.b(error);
    }

    @Override // com.yandex.mobile.ads.impl.vj, com.yandex.mobile.ads.impl.rq1.b
    public final void a(a8<p61> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        super.a((a8) adResponse);
        this.f35192z.a(adResponse);
        if (h()) {
            return;
        }
        b81 b81VarA = this.f35191y.a(adResponse).a(this);
        Context contextA = C4146l0.a();
        if (contextA != null) {
            fp0.a(new Object[0]);
        }
        if (contextA == null) {
            contextA = l();
        }
        b81VarA.a(contextA, adResponse);
    }

    public final void a(ot otVar) {
        this.f35190x.a(otVar);
    }

    public final void a(ut utVar) {
        this.f35190x.a(utVar);
    }

    public final void a(du duVar) {
        this.f35190x.a(duVar);
    }
}
