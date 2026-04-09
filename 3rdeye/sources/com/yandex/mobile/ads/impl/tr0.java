package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class tr0 {

    /* renamed from: a, reason: collision with root package name */
    private final pz1 f33764a;

    /* renamed from: b, reason: collision with root package name */
    private final a8<String> f33765b;

    public tr0(pz1 sliderAd, a8<String> adResponse) {
        kotlin.jvm.internal.l.f(sliderAd, "sliderAd");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f33764a = sliderAd;
        this.f33765b = adResponse;
    }

    public final a8<String> a() {
        return this.f33765b;
    }

    public final pz1 b() {
        return this.f33764a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr0)) {
            return false;
        }
        tr0 tr0Var = (tr0) obj;
        return kotlin.jvm.internal.l.b(this.f33764a, tr0Var.f33764a) && kotlin.jvm.internal.l.b(this.f33765b, tr0Var.f33765b);
    }

    public final int hashCode() {
        return this.f33765b.hashCode() + (this.f33764a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadedFeedItem(sliderAd=" + this.f33764a + ", adResponse=" + this.f33765b + ")";
    }
}
