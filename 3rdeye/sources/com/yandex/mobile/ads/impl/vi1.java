package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class vi1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4115g4 f34552a;

    /* renamed from: b, reason: collision with root package name */
    private final tn0 f34553b;

    public vi1(C4115g4 playingAdInfo, tn0 playingVideoAd) {
        kotlin.jvm.internal.l.f(playingAdInfo, "playingAdInfo");
        kotlin.jvm.internal.l.f(playingVideoAd, "playingVideoAd");
        this.f34552a = playingAdInfo;
        this.f34553b = playingVideoAd;
    }

    public final C4115g4 a() {
        return this.f34552a;
    }

    public final tn0 b() {
        return this.f34553b;
    }

    public final C4115g4 c() {
        return this.f34552a;
    }

    public final tn0 d() {
        return this.f34553b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi1)) {
            return false;
        }
        vi1 vi1Var = (vi1) obj;
        return kotlin.jvm.internal.l.b(this.f34552a, vi1Var.f34552a) && kotlin.jvm.internal.l.b(this.f34553b, vi1Var.f34553b);
    }

    public final int hashCode() {
        return this.f34553b.hashCode() + (this.f34552a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayingAdData(playingAdInfo=" + this.f34552a + ", playingVideoAd=" + this.f34553b + ")";
    }
}
