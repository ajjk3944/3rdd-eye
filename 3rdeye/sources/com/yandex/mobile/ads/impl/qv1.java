package com.yandex.mobile.ads.impl;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.vw0;
import java.util.List;

/* loaded from: classes3.dex */
public final class qv1 extends vw0 {

    /* renamed from: d, reason: collision with root package name */
    private final jg2<Q1.f, List<jj0>> f32360d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv1(CustomizableMediaView mediaView, i31 multiBannerViewAdapter, cx0 mediaViewRenderController, jg2<Q1.f, List<jj0>> multiBannerViewWrapper) {
        super(mediaView, mediaViewRenderController);
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(multiBannerViewAdapter, "multiBannerViewAdapter");
        kotlin.jvm.internal.l.f(mediaViewRenderController, "mediaViewRenderController");
        kotlin.jvm.internal.l.f(multiBannerViewWrapper, "multiBannerViewWrapper");
        this.f32360d = multiBannerViewWrapper;
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void a(View view) {
        CustomizableMediaView mediaView = (CustomizableMediaView) view;
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        this.f32360d.a();
        super.a((qv1) mediaView);
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    public final vw0.a d() {
        return vw0.a.f34721e;
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void a(ag asset, lg2 viewConfigurator, sw0 sw0Var) {
        sw0 sw0Var2 = sw0Var;
        kotlin.jvm.internal.l.f(asset, "asset");
        kotlin.jvm.internal.l.f(viewConfigurator, "viewConfigurator");
        this.f32360d.a(asset, viewConfigurator, sw0Var2 != null ? sw0Var2.a() : null);
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    public final void a(CustomizableMediaView mediaView) {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        this.f32360d.a();
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final boolean a(View view, sw0 sw0Var) {
        CustomizableMediaView mediaView = (CustomizableMediaView) view;
        sw0 mediaValue = sw0Var;
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
        List<jj0> listA = mediaValue.a();
        if (listA == null || !(!listA.isEmpty())) {
            return false;
        }
        return this.f32360d.a(listA);
    }

    @Override // com.yandex.mobile.ads.impl.vw0, com.yandex.mobile.ads.impl.ig2
    /* renamed from: a */
    public final void b(CustomizableMediaView mediaView, sw0 mediaValue) {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
        super.b(mediaView, mediaValue);
        List<jj0> listA = mediaValue.a();
        if (listA == null || !(!listA.isEmpty())) {
            return;
        }
        this.f32360d.b(listA);
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    public final void a(sw0 mediaValue) {
        kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
        List<jj0> listA = mediaValue.a();
        if (listA == null || !(!listA.isEmpty())) {
            return;
        }
        this.f32360d.b(listA);
    }
}
