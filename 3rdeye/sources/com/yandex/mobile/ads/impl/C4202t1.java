package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* renamed from: com.yandex.mobile.ads.impl.t1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4202t1 {

    /* renamed from: a, reason: collision with root package name */
    private final h61 f33360a;

    /* renamed from: b, reason: collision with root package name */
    private final tr f33361b;

    /* renamed from: c, reason: collision with root package name */
    private final lt f33362c;

    /* renamed from: d, reason: collision with root package name */
    private final z31 f33363d;

    /* renamed from: e, reason: collision with root package name */
    private final xg f33364e;

    public /* synthetic */ C4202t1(h61 h61Var, tr trVar, lt ltVar) {
        this(h61Var, trVar, ltVar, new b41(), new xg());
    }

    public final boolean a(ExtendedNativeAdView nativeAdView) {
        kotlin.jvm.internal.l.f(nativeAdView, "nativeAdView");
        try {
            if (!(this.f33360a instanceof pz1)) {
                return true;
            }
            ((pz1) this.f33360a).a(this.f33364e.a(nativeAdView, this.f33363d));
            ((pz1) this.f33360a).b(this.f33362c);
            return true;
        } catch (v51 unused) {
            this.f33361b.f();
            return false;
        }
    }

    public C4202t1(h61 nativeAdPrivate, tr contentCloseListener, lt adEventListener, z31 nativeAdAssetViewProvider, xg assetsNativeAdViewProviderCreator) {
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        kotlin.jvm.internal.l.f(adEventListener, "adEventListener");
        kotlin.jvm.internal.l.f(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        kotlin.jvm.internal.l.f(assetsNativeAdViewProviderCreator, "assetsNativeAdViewProviderCreator");
        this.f33360a = nativeAdPrivate;
        this.f33361b = contentCloseListener;
        this.f33362c = adEventListener;
        this.f33363d = nativeAdAssetViewProvider;
        this.f33364e = assetsNativeAdViewProviderCreator;
    }

    public final void a() {
        h61 h61Var = this.f33360a;
        if (h61Var instanceof pz1) {
            ((pz1) h61Var).b((lt) null);
        }
    }
}
