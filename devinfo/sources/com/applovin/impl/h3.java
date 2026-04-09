package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class h3 extends y2 {
    public h3(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.h hVar, com.applovin.impl.sdk.k kVar) {
        super(a3Var, jSONObject, jSONObject2, hVar, kVar);
    }

    public float j0() {
        return a("viewability_min_alpha", ((Float) this.f4362a.a(x4.f6163w1)).floatValue() / 100.0f);
    }

    public int k0() {
        return a("viewability_min_pixels", -1);
    }

    public int l0() {
        MaxAdFormat format = getFormat();
        x4 x4Var = format == MaxAdFormat.BANNER ? x4.f6109p1 : format == MaxAdFormat.MREC ? x4.f6124r1 : format == MaxAdFormat.LEADER ? x4.f6140t1 : format == MaxAdFormat.NATIVE ? x4.f6155v1 : null;
        if (x4Var != null) {
            return a("viewability_min_height", ((Integer) this.f4362a.a(x4Var)).intValue());
        }
        return 0;
    }

    public float m0() {
        return a("viewability_min_percentage_dp", -1.0f);
    }

    public float n0() {
        return a("viewability_min_percentage_pixels", -1.0f);
    }

    public long o0() {
        return a("viewability_timer_min_visible_ms", ((Long) this.f4362a.a(x4.f6171x1)).longValue());
    }

    public int p0() {
        MaxAdFormat format = getFormat();
        x4 x4Var = format == MaxAdFormat.BANNER ? x4.f6102o1 : format == MaxAdFormat.MREC ? x4.f6117q1 : format == MaxAdFormat.LEADER ? x4.f6132s1 : format == MaxAdFormat.NATIVE ? x4.f6148u1 : null;
        if (x4Var != null) {
            return a("viewability_min_width", ((Integer) this.f4362a.a(x4Var)).intValue());
        }
        return 0;
    }

    public boolean q0() {
        return k0() >= 0 || m0() >= 0.0f || n0() >= 0.0f;
    }
}
