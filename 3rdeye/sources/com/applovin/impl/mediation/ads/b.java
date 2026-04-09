package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.s7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.t7;
import com.applovin.impl.u2;

/* loaded from: classes.dex */
public class b implements t7.a {

    /* renamed from: a, reason: collision with root package name */
    private final k f20292a;

    /* renamed from: b, reason: collision with root package name */
    private final u2 f20293b;

    /* renamed from: c, reason: collision with root package name */
    private final t7 f20294c;

    /* renamed from: d, reason: collision with root package name */
    private final s7 f20295d;

    /* renamed from: e, reason: collision with root package name */
    private final a.InterfaceC0312a f20296e;

    public b(u2 u2Var, ViewGroup viewGroup, a.InterfaceC0312a interfaceC0312a, k kVar) {
        this.f20292a = kVar;
        this.f20293b = u2Var;
        this.f20296e = interfaceC0312a;
        this.f20295d = new s7(viewGroup, kVar);
        t7 t7Var = new t7(viewGroup, kVar, this);
        this.f20294c = t7Var;
        t7Var.a(u2Var);
        kVar.O();
        if (o.a()) {
            kVar.O().a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public void a() {
        this.f20294c.b();
    }

    public u2 b() {
        return this.f20293b;
    }

    public void c() {
        this.f20292a.O();
        if (o.a()) {
            this.f20292a.O().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f20293b.n0().compareAndSet(false, true)) {
            this.f20292a.O();
            if (o.a()) {
                this.f20292a.O().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f20293b.getNativeAd().isExpired()) {
                o.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f20292a.f().a(this.f20293b);
            }
            this.f20292a.X().processRawAdImpression(this.f20293b, this.f20296e);
        }
    }

    @Override // com.applovin.impl.t7.a
    public void onLogVisibilityImpression() {
        a(this.f20295d.a(this.f20293b));
    }

    private void a(long j4) {
        if (this.f20293b.p0().compareAndSet(false, true)) {
            this.f20292a.O();
            if (o.a()) {
                this.f20292a.O().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f20292a.X().processViewabilityAdImpressionPostback(this.f20293b, j4, this.f20296e);
        }
    }
}
