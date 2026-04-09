package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class wi1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4122h4 f34992a;

    /* renamed from: b, reason: collision with root package name */
    private final tn0 f34993b;

    public wi1(C4122h4 playingAdInfo, tn0 playingVideoAd) {
        kotlin.jvm.internal.l.f(playingAdInfo, "playingAdInfo");
        kotlin.jvm.internal.l.f(playingVideoAd, "playingVideoAd");
        this.f34992a = playingAdInfo;
        this.f34993b = playingVideoAd;
    }

    public final C4122h4 a() {
        return this.f34992a;
    }

    public final tn0 b() {
        return this.f34993b;
    }

    public final C4122h4 c() {
        return this.f34992a;
    }

    public final tn0 d() {
        return this.f34993b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi1)) {
            return false;
        }
        wi1 wi1Var = (wi1) obj;
        return kotlin.jvm.internal.l.b(this.f34992a, wi1Var.f34992a) && kotlin.jvm.internal.l.b(this.f34993b, wi1Var.f34993b);
    }

    public final int hashCode() {
        return this.f34993b.hashCode() + (this.f34992a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayingAdData(playingAdInfo=" + this.f34992a + ", playingVideoAd=" + this.f34993b + ")";
    }
}
