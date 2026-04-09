package com.yandex.mobile.ads.impl;

import H6.C0675l;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* loaded from: classes3.dex */
public final class ba0 implements w00<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    private final pk1 f25147a;

    /* renamed from: b, reason: collision with root package name */
    private final f20 f25148b;

    /* renamed from: c, reason: collision with root package name */
    private final mp1 f25149c;

    public ba0(pk1 preloadedDivKitDesign, f20 divKitActionAdapter, mp1 reporter) {
        kotlin.jvm.internal.l.f(preloadedDivKitDesign, "preloadedDivKitDesign");
        kotlin.jvm.internal.l.f(divKitActionAdapter, "divKitActionAdapter");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        this.f25147a = preloadedDivKitDesign;
        this.f25148b = divKitActionAdapter;
        this.f25149c = reporter;
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView container = (ExtendedNativeAdView) viewGroup;
        kotlin.jvm.internal.l.f(container, "container");
        try {
            container.removeAllViews();
            C0675l c0675lD = this.f25147a.d();
            ng2.a(c0675lD);
            p10.a(c0675lD).a(this.f25148b);
            container.addView(c0675lD);
        } catch (Throwable th) {
            fp0.b(new Object[0]);
            this.f25149c.reportError("Failed to bind DivKit Feed Preloaded Ad", th);
        }
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
        C0675l c0675lD = this.f25147a.d();
        p10.a(c0675lD).a((f20) null);
        ng2.a(c0675lD);
    }
}
