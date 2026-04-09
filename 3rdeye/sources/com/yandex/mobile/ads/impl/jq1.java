package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* loaded from: classes3.dex */
public final class jq1 implements w00<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4105f1 f29263a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29264b;

    public jq1(InterfaceC4105f1 adActivityListener, int i) {
        kotlin.jvm.internal.l.f(adActivityListener, "adActivityListener");
        this.f29263a = adActivityListener;
        this.f29264b = i;
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView container = (ExtendedNativeAdView) viewGroup;
        kotlin.jvm.internal.l.f(container, "container");
        if (this.f29264b == 1) {
            this.f29263a.a(7);
        } else {
            this.f29263a.a(6);
        }
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
    }
}
