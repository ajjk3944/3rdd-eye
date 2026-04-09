package com.applovin.impl;

import a6.C1653b;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class u2 extends y2 implements o1 {

    /* renamed from: t, reason: collision with root package name */
    private final AtomicBoolean f21535t;

    /* renamed from: u, reason: collision with root package name */
    private final AtomicBoolean f21536u;

    public u2(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(map, jSONObject, jSONObject2, null, kVar);
        this.f21535t = new AtomicBoolean();
        this.f21536u = new AtomicBoolean();
    }

    private long k0() {
        long jA = a("ad_expiration_ms", -1L);
        return jA < 0 ? b("ad_expiration_ms", ((Long) this.f18925a.a(g3.f19414p7)).longValue()) : jA;
    }

    @Override // com.applovin.impl.q2
    public q2 a(com.applovin.impl.mediation.h hVar) {
        return new u2(this, hVar);
    }

    @Override // com.applovin.impl.o1
    public long getTimeToLiveMillis() {
        return k0() - (SystemClock.elapsedRealtime() - H());
    }

    public MaxNativeAdView l0() {
        return this.f20755m.f();
    }

    public ViewGroup m0() {
        return this.f20755m.h();
    }

    public AtomicBoolean n0() {
        return this.f21535t;
    }

    public String o0() {
        return BundleUtils.getString(C1653b.KEY_TEMPLATE, "", l());
    }

    public AtomicBoolean p0() {
        return this.f21536u;
    }

    public boolean q0() {
        return a("inacc", (Boolean) this.f18925a.a(g3.f19372J7)).booleanValue();
    }

    public boolean r0() {
        return this.f20755m == null;
    }

    @Override // com.applovin.impl.o1
    public void setExpired() {
        MaxNativeAd nativeAd = getNativeAd();
        if (nativeAd != null) {
            nativeAd.setExpired();
        }
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f20755m.a(maxNativeAdView);
    }

    public void a(ViewGroup viewGroup) {
        this.f20755m.a(viewGroup);
    }

    private u2(u2 u2Var, com.applovin.impl.mediation.h hVar) {
        super(u2Var.i(), u2Var.a(), u2Var.g(), hVar, u2Var.f18925a);
        this.f21535t = new AtomicBoolean();
        this.f21536u = new AtomicBoolean();
    }
}
