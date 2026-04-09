package com.yandex.mobile.ads.impl;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.vw0;

/* loaded from: classes3.dex */
public final class pv1 extends vw0 {

    /* renamed from: d, reason: collision with root package name */
    private final jg2<m21, ku0> f31924d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv1(CustomizableMediaView mediaView, o21 mraidWebViewAdapter, cx0 mediaViewRenderController, jg2<m21, ku0> mraidWebViewWrapper) {
        super(mediaView, mediaViewRenderController);
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(mraidWebViewAdapter, "mraidWebViewAdapter");
        kotlin.jvm.internal.l.f(mediaViewRenderController, "mediaViewRenderController");
        kotlin.jvm.internal.l.f(mraidWebViewWrapper, "mraidWebViewWrapper");
        this.f31924d = mraidWebViewWrapper;
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void a(View view) {
        CustomizableMediaView mediaView = (CustomizableMediaView) view;
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        this.f31924d.a();
        super.a((pv1) mediaView);
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    public final vw0.a d() {
        return vw0.a.f34719c;
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void a(ag asset, lg2 viewConfigurator, sw0 sw0Var) {
        sw0 sw0Var2 = sw0Var;
        kotlin.jvm.internal.l.f(asset, "asset");
        kotlin.jvm.internal.l.f(viewConfigurator, "viewConfigurator");
        this.f31924d.a(asset, viewConfigurator, sw0Var2 != null ? sw0Var2.b() : null);
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    public final void a(CustomizableMediaView mediaView) {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        this.f31924d.a();
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final boolean a(View view, sw0 sw0Var) {
        CustomizableMediaView mediaView = (CustomizableMediaView) view;
        sw0 mediaValue = sw0Var;
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
        ku0 ku0VarB = mediaValue.b();
        if (ku0VarB != null) {
            return this.f31924d.a(ku0VarB);
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.vw0, com.yandex.mobile.ads.impl.ig2
    /* renamed from: a */
    public final void b(CustomizableMediaView mediaView, sw0 mediaValue) {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
        super.b(mediaView, mediaValue);
        ku0 ku0VarB = mediaValue.b();
        if (ku0VarB == null) {
            return;
        }
        this.f31924d.b(ku0VarB);
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    public final void a(sw0 mediaValue) {
        kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
    }
}
