package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.vw0;
import java.util.List;

/* loaded from: classes3.dex */
public final class ov1 extends vw0 {

    /* renamed from: d, reason: collision with root package name */
    private final jg2<ImageView, jj0> f31506d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov1(CustomizableMediaView mediaView, rj0 imageViewAdapter, cx0 mediaViewRenderController, jg2<ImageView, jj0> imageViewWrapper) {
        super(mediaView, mediaViewRenderController);
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(imageViewAdapter, "imageViewAdapter");
        kotlin.jvm.internal.l.f(mediaViewRenderController, "mediaViewRenderController");
        kotlin.jvm.internal.l.f(imageViewWrapper, "imageViewWrapper");
        this.f31506d = imageViewWrapper;
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void a(View view) {
        CustomizableMediaView mediaView = (CustomizableMediaView) view;
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        this.f31506d.a();
        super.a((ov1) mediaView);
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    public final vw0.a d() {
        return vw0.a.f34722f;
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void a(ag asset, lg2 viewConfigurator, sw0 sw0Var) {
        sw0 sw0Var2 = sw0Var;
        kotlin.jvm.internal.l.f(asset, "asset");
        kotlin.jvm.internal.l.f(viewConfigurator, "viewConfigurator");
        this.f31506d.a(asset, viewConfigurator, a(sw0Var2 != null ? sw0Var2.a() : null));
    }

    private static jj0 a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (jj0) list.get(0);
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    public final void a(CustomizableMediaView mediaView) {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        this.f31506d.a();
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final boolean a(View view, sw0 sw0Var) {
        CustomizableMediaView mediaView = (CustomizableMediaView) view;
        sw0 mediaValue = sw0Var;
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
        jj0 jj0VarA = a(mediaValue.a());
        if (jj0VarA != null) {
            return this.f31506d.a(jj0VarA);
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.vw0, com.yandex.mobile.ads.impl.ig2
    /* renamed from: a */
    public final void b(CustomizableMediaView mediaView, sw0 mediaValue) {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
        super.b(mediaView, mediaValue);
        jj0 jj0VarA = a(mediaValue.a());
        if (jj0VarA == null) {
            return;
        }
        this.f31506d.b(jj0VarA);
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    public final void a(sw0 mediaValue) {
        kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
        jj0 jj0VarA = a(mediaValue.a());
        if (jj0VarA == null) {
            return;
        }
        this.f31506d.b(jj0VarA);
    }
}
