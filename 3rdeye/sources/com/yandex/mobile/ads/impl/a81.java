package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.xo;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class a81 extends p81 implements pz1 {

    /* renamed from: O, reason: collision with root package name */
    private final z71 f24554O;

    /* renamed from: P, reason: collision with root package name */
    private final ej0 f24555P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a81(Context context, z71 nativeCompositeAd, ej0 imageProvider, el binderConfiguration, v41 nativeAdControllers) {
        super(context, binderConfiguration, nativeAdControllers);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeCompositeAd, "nativeCompositeAd");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(binderConfiguration, "binderConfiguration");
        kotlin.jvm.internal.l.f(nativeAdControllers, "nativeAdControllers");
        this.f24554O = nativeCompositeAd;
        this.f24555P = imageProvider;
        a(a(binderConfiguration.d().a()));
    }

    @Override // com.yandex.mobile.ads.impl.pz1
    public final void a(b71 viewBinder, oo clickConnector) throws v51 {
        kotlin.jvm.internal.l.f(viewBinder, "viewBinder");
        kotlin.jvm.internal.l.f(clickConnector, "clickConnector");
        View viewD = viewBinder.d();
        i71 i71Var = new i71(viewBinder);
        ej0 ej0Var = this.f24555P;
        xo.f35374a.getClass();
        a(viewD, ej0Var, i71Var, xo.a.a(), clickConnector);
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final void b(nt listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f24554O.b(listener);
    }

    @Override // com.yandex.mobile.ads.impl.pz1
    public final ArrayList d() {
        return new ArrayList(this.f24554O.e());
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final kt getAdAssets() {
        return this.f24554O.getAdAssets();
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final ar1 getAdType() {
        return this.f24554O.getAdType();
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final String getInfo() {
        return this.f24554O.getInfo();
    }

    @Override // com.yandex.mobile.ads.impl.p81, com.yandex.mobile.ads.impl.h61
    public final rt getNativeAdVideoController() {
        return super.getNativeAdVideoController();
    }

    @Override // com.yandex.mobile.ads.impl.p81, com.yandex.mobile.ads.impl.h61
    public final void loadImages() {
        this.f24554O.loadImages();
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final void b(b71 viewProvider, oo clickConnector) throws v51 {
        kotlin.jvm.internal.l.f(viewProvider, "viewProvider");
        kotlin.jvm.internal.l.f(clickConnector, "clickConnector");
        this.f24554O.b(viewProvider, clickConnector);
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final void b(b71 viewProvider) throws v51 {
        kotlin.jvm.internal.l.f(viewProvider, "viewProvider");
        this.f24554O.b(viewProvider);
    }

    @Override // com.yandex.mobile.ads.impl.pz1
    public final void a(b71 viewProvider) throws v51 {
        kotlin.jvm.internal.l.f(viewProvider, "viewProvider");
        View viewD = viewProvider.d();
        i71 i71Var = new i71(viewProvider);
        ej0 ej0Var = this.f24555P;
        xo.f35374a.getClass();
        a(viewD, ej0Var, i71Var, xo.a.a());
    }

    @Override // com.yandex.mobile.ads.impl.pz1
    public final void b(lt ltVar) {
        super.a(ltVar);
    }

    @Override // com.yandex.mobile.ads.impl.h61
    public final void a(nt listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f24554O.a(listener);
    }

    @Override // com.yandex.mobile.ads.impl.p81, com.yandex.mobile.ads.impl.h61
    public final void a(lt ltVar) {
        this.f24554O.a(ltVar);
    }

    private final o71 a(C4072a3 c4072a3) {
        o71 o71Var = new o71(c4072a3, r91.f32563e.a(), e(), a(), new m71(), null);
        o71Var.a(v71.f34408c);
        return o71Var;
    }
}
