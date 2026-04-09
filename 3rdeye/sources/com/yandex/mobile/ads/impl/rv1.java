package com.yandex.mobile.ads.impl;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.vw0;

/* loaded from: classes3.dex */
public final class rv1 extends vw0 {

    /* renamed from: d, reason: collision with root package name */
    private final jg2<ob1, ya2> f32787d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv1(CustomizableMediaView mediaView, eg2 videoViewAdapter, cx0 mediaViewRenderController, jg2<ob1, ya2> videoViewWrapper) {
        super(mediaView, mediaViewRenderController);
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(videoViewAdapter, "videoViewAdapter");
        kotlin.jvm.internal.l.f(mediaViewRenderController, "mediaViewRenderController");
        kotlin.jvm.internal.l.f(videoViewWrapper, "videoViewWrapper");
        this.f32787d = videoViewWrapper;
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void a(View view) {
        CustomizableMediaView mediaView = (CustomizableMediaView) view;
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        this.f32787d.a();
        super.a((rv1) mediaView);
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    public final vw0.a d() {
        return vw0.a.f34720d;
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void a(ag asset, lg2 viewConfigurator, sw0 sw0Var) {
        sw0 sw0Var2 = sw0Var;
        kotlin.jvm.internal.l.f(asset, "asset");
        kotlin.jvm.internal.l.f(viewConfigurator, "viewConfigurator");
        this.f32787d.a(asset, viewConfigurator, sw0Var2 != null ? sw0Var2.c() : null);
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void a() {
        this.f32787d.b();
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    public final void a(CustomizableMediaView mediaView) {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        this.f32787d.a();
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final boolean a(View view, sw0 sw0Var) {
        CustomizableMediaView mediaView = (CustomizableMediaView) view;
        sw0 mediaValue = sw0Var;
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
        ya2 ya2VarC = mediaValue.c();
        if (ya2VarC != null) {
            return this.f32787d.a(ya2VarC);
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.vw0, com.yandex.mobile.ads.impl.ig2
    /* renamed from: a */
    public final void b(CustomizableMediaView mediaView, sw0 mediaValue) {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
        super.b(mediaView, mediaValue);
        ya2 ya2VarC = mediaValue.c();
        if (ya2VarC == null) {
            return;
        }
        this.f32787d.b(ya2VarC);
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    public final void a(sw0 mediaValue) {
        kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
    }
}
