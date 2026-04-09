package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.o91;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class d81 implements x41 {

    /* renamed from: a, reason: collision with root package name */
    private final o91.b f26020a;

    public d81(o91.b responseCreationListener) {
        kotlin.jvm.internal.l.f(responseCreationListener, "responseCreationListener");
        this.f26020a = responseCreationListener;
    }

    @Override // com.yandex.mobile.ads.impl.x41
    public final void a(C4128i3 error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f26020a.a(error);
    }

    @Override // com.yandex.mobile.ads.impl.x41
    public final void a(h61 nativeAd) {
        kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
        this.f26020a.a(nativeAd);
    }

    @Override // com.yandex.mobile.ads.impl.x41
    public final void a(ArrayList nativeAds) {
        kotlin.jvm.internal.l.f(nativeAds, "nativeAds");
        this.f26020a.a(i7.x());
    }

    @Override // com.yandex.mobile.ads.impl.x41
    public final void a(a81 sliderAd) {
        kotlin.jvm.internal.l.f(sliderAd, "sliderAd");
        this.f26020a.a(sliderAd);
    }
}
