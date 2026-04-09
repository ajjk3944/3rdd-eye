package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class km2 implements com.yandex.mobile.ads.nativeads.video.b {

    /* renamed from: a, reason: collision with root package name */
    private final rt f29730a;

    public km2(rt nativeAdVideoController) {
        kotlin.jvm.internal.l.f(nativeAdVideoController, "nativeAdVideoController");
        this.f29730a = nativeAdVideoController;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof km2) && kotlin.jvm.internal.l.b(this.f29730a, ((km2) obj).f29730a);
    }

    public final int hashCode() {
        return this.f29730a.hashCode();
    }

    @Override // com.yandex.mobile.ads.nativeads.video.b, com.yandex.mobile.ads.nativeads.video.NativeAdVideoController
    public final void pauseAd() {
        this.f29730a.a();
    }

    @Override // com.yandex.mobile.ads.nativeads.video.b, com.yandex.mobile.ads.nativeads.video.NativeAdVideoController
    public final void resumeAd() {
        this.f29730a.b();
    }

    public final String toString() {
        return "YandexNativeAdVideoControllerAdapter(nativeAdVideoController=" + this.f29730a + ")";
    }
}
