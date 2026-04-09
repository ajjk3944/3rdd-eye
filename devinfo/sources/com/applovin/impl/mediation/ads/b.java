package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.d3;
import com.applovin.impl.f8;
import com.applovin.impl.g8;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class b implements g8.a {

    /* renamed from: a, reason: collision with root package name */
    private final k f4632a;

    /* renamed from: b, reason: collision with root package name */
    private final d3 f4633b;

    /* renamed from: c, reason: collision with root package name */
    private final g8 f4634c;

    /* renamed from: d, reason: collision with root package name */
    private final f8 f4635d;

    /* renamed from: e, reason: collision with root package name */
    private final a.InterfaceC0014a f4636e;

    public b(d3 d3Var, ViewGroup viewGroup, a.InterfaceC0014a interfaceC0014a, k kVar) {
        this.f4632a = kVar;
        this.f4633b = d3Var;
        this.f4636e = interfaceC0014a;
        this.f4635d = new f8(viewGroup, kVar);
        g8 g8Var = new g8(viewGroup, kVar, this);
        this.f4634c = g8Var;
        g8Var.a(d3Var);
        kVar.O();
        if (o.a()) {
            kVar.O().a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public void a() {
        this.f4634c.b();
    }

    public d3 b() {
        return this.f4633b;
    }

    public void c() {
        this.f4632a.O();
        if (o.a()) {
            this.f4632a.O().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f4633b.u0().compareAndSet(false, true)) {
            this.f4632a.O();
            if (o.a()) {
                this.f4632a.O().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f4633b.getNativeAd().isExpired()) {
                o.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f4632a.f().a(this.f4633b);
            }
            this.f4632a.X().processRawAdImpression(this.f4633b, this.f4636e);
        }
    }

    @Override // com.applovin.impl.g8.a
    public void onLogVisibilityImpression() {
        a(this.f4635d.a(this.f4633b));
    }

    private void a(long j) {
        if (this.f4633b.v0().compareAndSet(false, true)) {
            this.f4632a.O();
            if (o.a()) {
                this.f4632a.O().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f4632a.X().processViewabilityAdImpressionPostback(this.f4633b, j, this.f4636e);
        }
    }
}
