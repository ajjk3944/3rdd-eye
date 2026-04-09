package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.d3;
import com.applovin.impl.f8;
import com.applovin.impl.g8;
import com.applovin.impl.mediation.ads.a;

/* loaded from: classes.dex */
public class b implements g8.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6633a;

    /* renamed from: b, reason: collision with root package name */
    private final d3 f6634b;

    /* renamed from: c, reason: collision with root package name */
    private final g8 f6635c;

    /* renamed from: d, reason: collision with root package name */
    private final f8 f6636d;

    /* renamed from: e, reason: collision with root package name */
    private final a.InterfaceC0078a f6637e;

    public b(d3 d3Var, ViewGroup viewGroup, a.InterfaceC0078a interfaceC0078a, com.applovin.impl.sdk.k kVar) {
        this.f6633a = kVar;
        this.f6634b = d3Var;
        this.f6637e = interfaceC0078a;
        this.f6636d = new f8(viewGroup, kVar);
        g8 g8Var = new g8(viewGroup, kVar, this);
        this.f6635c = g8Var;
        g8Var.a(d3Var);
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public void a() {
        this.f6635c.b();
    }

    public d3 b() {
        return this.f6634b;
    }

    public void c() {
        this.f6633a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f6633a.O().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f6634b.u0().compareAndSet(false, true)) {
            this.f6633a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f6633a.O().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f6634b.getNativeAd().isExpired()) {
                com.applovin.impl.sdk.o.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f6633a.f().a(this.f6634b);
            }
            this.f6633a.X().processRawAdImpression(this.f6634b, this.f6637e);
        }
    }

    @Override // com.applovin.impl.g8.a
    public void onLogVisibilityImpression() {
        a(this.f6636d.a(this.f6634b));
    }

    private void a(long j10) {
        if (this.f6634b.v0().compareAndSet(false, true)) {
            this.f6633a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f6633a.O().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f6633a.X().processViewabilityAdImpressionPostback(this.f6634b, j10, this.f6637e);
        }
    }
}
