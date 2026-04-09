package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.xo;

/* loaded from: classes3.dex */
public abstract class o51 extends p81 implements h61 {

    /* renamed from: O, reason: collision with root package name */
    private final d61 f31193O;

    /* renamed from: P, reason: collision with root package name */
    private ej0 f31194P;

    /* renamed from: Q, reason: collision with root package name */
    private final o71 f31195Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o51(Context context, w31 nativeAd, d61 nativeAdManager, ej0 imageProvider, el binderConfiguration, v41 nativeAdControllers) {
        super(context, binderConfiguration, nativeAdControllers);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
        kotlin.jvm.internal.l.f(nativeAdManager, "nativeAdManager");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(binderConfiguration, "binderConfiguration");
        kotlin.jvm.internal.l.f(nativeAdControllers, "nativeAdControllers");
        this.f31193O = nativeAdManager;
        this.f31194P = imageProvider;
        o71 o71VarA = a(nativeAd, binderConfiguration.d().a());
        this.f31195Q = o71VarA;
        a(o71VarA);
    }

    private final o71 a(w31 w31Var, C4072a3 c4072a3) {
        ar1 ar1VarG = w31Var.g();
        return new o71(c4072a3, ar1VarG.a(), e(), a(), new qy1(w31Var, new yq1(), new o7(), new dr()), null);
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final void b(nt listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f31193O.a(listener);
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final kt getAdAssets() {
        return this.f31193O.a();
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final ar1 getAdType() {
        return this.f31193O.b();
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final String getInfo() {
        return this.f31193O.c();
    }

    @Override // com.yandex.mobile.ads.impl.p81, com.yandex.mobile.ads.impl.h61
    public final rt getNativeAdVideoController() {
        return super.getNativeAdVideoController();
    }

    @Override // com.yandex.mobile.ads.impl.p81, com.yandex.mobile.ads.impl.h61
    public final void loadImages() {
        this.f31193O.d();
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final void b(b71 viewProvider, oo clickConnector) throws v51 {
        kotlin.jvm.internal.l.f(viewProvider, "viewProvider");
        kotlin.jvm.internal.l.f(clickConnector, "clickConnector");
        View viewD = viewProvider.d();
        i71 i71Var = new i71(viewProvider);
        ej0 ej0Var = this.f31194P;
        xo.f35374a.getClass();
        a(viewD, ej0Var, i71Var, xo.a.a(), clickConnector);
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final void b(b71 viewProvider) throws v51 {
        kotlin.jvm.internal.l.f(viewProvider, "viewProvider");
        this.f31195Q.a(viewProvider.e());
        View viewD = viewProvider.d();
        i71 i71Var = new i71(viewProvider);
        ej0 ej0Var = this.f31194P;
        xo.f35374a.getClass();
        a(viewD, ej0Var, i71Var, xo.a.a());
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final void a(nt listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f31193O.b(listener);
    }
}
