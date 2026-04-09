package com.yandex.mobile.ads.impl;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.vw0;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class sv1 extends vw0 {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f33288j;

    /* renamed from: d, reason: collision with root package name */
    private final vw0 f33289d;

    /* renamed from: e, reason: collision with root package name */
    private final vw0 f33290e;

    /* renamed from: f, reason: collision with root package name */
    private final uy1 f33291f;

    /* renamed from: g, reason: collision with root package name */
    private final ao1 f33292g;

    /* renamed from: h, reason: collision with root package name */
    private final ao1 f33293h;
    private final uv1 i;

    public static final class a implements CustomizableMediaView.a {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<sv1> f33294a;

        public a(WeakReference<sv1> weakSdkMediaViewVideoWithFallbackAdapter) {
            kotlin.jvm.internal.l.f(weakSdkMediaViewVideoWithFallbackAdapter, "weakSdkMediaViewVideoWithFallbackAdapter");
            this.f33294a = weakSdkMediaViewVideoWithFallbackAdapter;
        }

        @Override // com.monetization.ads.nativeads.CustomizableMediaView.a
        public final void a(int i, int i10) {
            sv1 sv1Var = this.f33294a.get();
            if (sv1Var != null) {
                uy1 uy1Var = sv1Var.f33291f;
                if (i < uy1Var.b() || i10 < uy1Var.a()) {
                    sv1.a(sv1Var, sv1Var.f33290e);
                }
            }
        }
    }

    static {
        kotlin.jvm.internal.n nVar = new kotlin.jvm.internal.n(sv1.class, "weakMediaView", "getWeakMediaView()Lcom/monetization/ads/nativeads/CustomizableMediaView;");
        kotlin.jvm.internal.x.f43661a.getClass();
        f33288j = new w9.i[]{nVar, new kotlin.jvm.internal.n(sv1.class, "weakMediaValue", "getWeakMediaValue()Lcom/monetization/ads/network/model/MediaValue;"), new kotlin.jvm.internal.n(sv1.class, "currentViewAdapter", "getCurrentViewAdapter()Lcom/monetization/ads/nativeads/assetadapter/viewadapter/MediaViewAdapter;")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv1(CustomizableMediaView mediaView, rv1 videoViewAdapter, vw0 fallbackAdapter, cx0 mediaViewRenderController, uy1 fallbackSize) {
        super(mediaView, mediaViewRenderController);
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(videoViewAdapter, "videoViewAdapter");
        kotlin.jvm.internal.l.f(fallbackAdapter, "fallbackAdapter");
        kotlin.jvm.internal.l.f(mediaViewRenderController, "mediaViewRenderController");
        kotlin.jvm.internal.l.f(fallbackSize, "fallbackSize");
        this.f33289d = videoViewAdapter;
        this.f33290e = fallbackAdapter;
        this.f33291f = fallbackSize;
        this.f33292g = bo1.a(null);
        this.f33293h = bo1.a(null);
        this.i = new uv1(videoViewAdapter, this);
        mediaView.setOnSizeChangedListener$mobileads_externalRelease(new a(new WeakReference(this)));
    }

    public static final sw0 c(sv1 sv1Var) {
        return (sw0) sv1Var.f33293h.getValue(sv1Var, f33288j[1]);
    }

    public static final CustomizableMediaView d(sv1 sv1Var) {
        return (CustomizableMediaView) sv1Var.f33292g.getValue(sv1Var, f33288j[0]);
    }

    public static final void a(sv1 sv1Var, vw0 vw0Var) {
        sv1Var.i.setValue(sv1Var, f33288j[2], vw0Var);
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    public final vw0.a d() {
        return this.i.getValue(this, f33288j[2]).d();
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void a(View view) {
        CustomizableMediaView view2 = (CustomizableMediaView) view;
        kotlin.jvm.internal.l.f(view2, "view");
        this.f33289d.a((vw0) view2);
        this.f33290e.a((vw0) view2);
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void a(ag asset, lg2 viewConfigurator, sw0 sw0Var) {
        sw0 sw0Var2 = sw0Var;
        kotlin.jvm.internal.l.f(asset, "asset");
        kotlin.jvm.internal.l.f(viewConfigurator, "viewConfigurator");
        this.f33289d.a(asset, viewConfigurator, sw0Var2);
        this.f33290e.a(asset, viewConfigurator, sw0Var2);
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void a() {
        this.i.getValue(this, f33288j[2]).a();
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    public final void a(CustomizableMediaView mediaView) {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        this.f33289d.a(mediaView);
        this.f33290e.a(mediaView);
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final boolean a(View view, sw0 sw0Var) {
        CustomizableMediaView view2 = (CustomizableMediaView) view;
        sw0 value = sw0Var;
        kotlin.jvm.internal.l.f(view2, "view");
        kotlin.jvm.internal.l.f(value, "value");
        return this.i.getValue(this, f33288j[2]).a((vw0) view2, (CustomizableMediaView) value);
    }

    @Override // com.yandex.mobile.ads.impl.vw0, com.yandex.mobile.ads.impl.ig2
    /* renamed from: a */
    public final void b(CustomizableMediaView mediaView, sw0 value) {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(value, "value");
        ao1 ao1Var = this.f33292g;
        w9.i<?>[] iVarArr = f33288j;
        ao1Var.setValue(this, iVarArr[0], mediaView);
        this.f33293h.setValue(this, iVarArr[1], value);
        this.i.getValue(this, iVarArr[2]).b(mediaView, value);
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    public final void a(sw0 mediaValue) {
        kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
        this.i.getValue(this, f33288j[2]).a(mediaValue);
    }
}
