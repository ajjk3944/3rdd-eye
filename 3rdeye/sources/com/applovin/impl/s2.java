package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import com.github.appintro.AppIntroBaseFragmentKt;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class s2 extends y2 {
    public s2(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(map, jSONObject, jSONObject2, null, kVar);
    }

    @Override // com.applovin.impl.q2
    public q2 a(com.applovin.impl.mediation.h hVar) {
        return new s2(this, hVar);
    }

    public long k0() {
        long jA = a("ad_refresh_ms", -1L);
        return jA >= 0 ? jA : b("ad_refresh_ms", ((Long) this.f18925a.a(g3.f19393V6)).longValue());
    }

    public long l0() {
        return a7.e(a(AppIntroBaseFragmentKt.ARG_BG_COLOR, (String) null));
    }

    public int m0() {
        int iA = a("ad_view_height", -2);
        if (iA != -2) {
            return iA;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getHeight();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public long n0() {
        return a("viewability_imp_delay_ms", ((Long) this.f18925a.a(l4.f19965l1)).longValue());
    }

    public int o0() {
        int iA = a("ad_view_width", -2);
        if (iA != -2) {
            return iA;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getWidth();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public boolean p0() {
        return k0() >= 0;
    }

    public boolean q0() {
        return a("proe", (Boolean) this.f18925a.a(g3.f19422x7)).booleanValue();
    }

    private s2(s2 s2Var, com.applovin.impl.mediation.h hVar) {
        super(s2Var.i(), s2Var.a(), s2Var.g(), hVar, s2Var.f18925a);
    }
}
