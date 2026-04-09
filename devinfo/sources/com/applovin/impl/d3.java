package com.applovin.impl;

import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class d3 extends h3 implements t1 {
    private final AtomicBoolean A;

    /* renamed from: z, reason: collision with root package name */
    private final AtomicBoolean f3929z;

    public d3(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(a3Var, jSONObject, jSONObject2, null, kVar);
        this.f3929z = new AtomicBoolean();
        this.A = new AtomicBoolean();
    }

    private long r0() {
        long jA = a("ad_expiration_ms", -1L);
        return jA < 0 ? b("ad_expiration_ms", ((Long) this.f4362a.a(r3.S7)).longValue()) : jA;
    }

    @Override // com.applovin.impl.y2
    public y2 a(com.applovin.impl.mediation.h hVar) {
        return new d3(this, hVar);
    }

    @Override // com.applovin.impl.t1
    public long getTimeToLiveMillis() {
        return r0() - (SystemClock.elapsedRealtime() - I());
    }

    public MaxNativeAdView s0() {
        return this.f6209n.f();
    }

    @Override // com.applovin.impl.t1
    public void setExpired() {
        MaxNativeAd nativeAd = getNativeAd();
        if (nativeAd != null) {
            nativeAd.setExpired();
        }
    }

    public ViewGroup t0() {
        return this.f6209n.h();
    }

    public AtomicBoolean u0() {
        return this.f3929z;
    }

    public AtomicBoolean v0() {
        return this.A;
    }

    public boolean w0() {
        return a("inacc", (Boolean) this.f4362a.a(r3.f5228m8)).booleanValue();
    }

    public boolean x0() {
        return this.f6209n == null;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f6209n.a(maxNativeAdView);
    }

    public void a(ViewGroup viewGroup) {
        this.f6209n.a(viewGroup);
    }

    private d3(d3 d3Var, com.applovin.impl.mediation.h hVar) {
        super(d3Var.N(), d3Var.a(), d3Var.g(), hVar, d3Var.f4362a);
        this.f3929z = new AtomicBoolean();
        this.A = new AtomicBoolean();
    }
}
