package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.AdPodInfo;

/* loaded from: classes3.dex */
public final class xk2 implements AdPodInfo {

    /* renamed from: a, reason: collision with root package name */
    private final mc2 f35344a;

    public xk2(mc2 adPodInfo) {
        kotlin.jvm.internal.l.f(adPodInfo, "adPodInfo");
        this.f35344a = adPodInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xk2) && kotlin.jvm.internal.l.b(this.f35344a, ((xk2) obj).f35344a);
    }

    @Override // com.yandex.mobile.ads.video.playback.model.AdPodInfo
    public final int getAdPosition() {
        return this.f35344a.a();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.AdPodInfo
    public final int getAdsCount() {
        return this.f35344a.b();
    }

    public final int hashCode() {
        return this.f35344a.hashCode();
    }

    public final String toString() {
        return "YandexAdPodInfo(adPodInfo=" + this.f35344a + ")";
    }
}
