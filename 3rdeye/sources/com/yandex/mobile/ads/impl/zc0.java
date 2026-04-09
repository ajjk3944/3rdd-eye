package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class zc0 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f36408a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36409b;

    /* renamed from: c, reason: collision with root package name */
    private final av1 f36410c;

    public zc0(a8<?> adResponse, String htmlResponse, av1 sdkFullscreenHtmlAd) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(htmlResponse, "htmlResponse");
        kotlin.jvm.internal.l.f(sdkFullscreenHtmlAd, "sdkFullscreenHtmlAd");
        this.f36408a = adResponse;
        this.f36409b = htmlResponse;
        this.f36410c = sdkFullscreenHtmlAd;
    }

    public final a8<?> a() {
        return this.f36408a;
    }

    public final av1 b() {
        return this.f36410c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc0)) {
            return false;
        }
        zc0 zc0Var = (zc0) obj;
        return kotlin.jvm.internal.l.b(this.f36408a, zc0Var.f36408a) && kotlin.jvm.internal.l.b(this.f36409b, zc0Var.f36409b) && kotlin.jvm.internal.l.b(this.f36410c, zc0Var.f36410c);
    }

    public final int hashCode() {
        return this.f36410c.hashCode() + C4121h3.a(this.f36409b, this.f36408a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FullScreenDataHolder(adResponse=" + this.f36408a + ", htmlResponse=" + this.f36409b + ", sdkFullscreenHtmlAd=" + this.f36410c + ")";
    }
}
