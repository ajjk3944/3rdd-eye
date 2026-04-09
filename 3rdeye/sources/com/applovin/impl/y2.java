package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class y2 extends q2 {
    public y2(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.h hVar, com.applovin.impl.sdk.k kVar) {
        super(map, jSONObject, jSONObject2, hVar, kVar);
    }

    public float c0() {
        return a("viewability_min_alpha", ((Float) this.f18925a.a(l4.f20036u1)).floatValue() / 100.0f);
    }

    public int d0() {
        return a("viewability_min_pixels", -1);
    }

    public int e0() {
        MaxAdFormat format = getFormat();
        l4 l4Var = format == MaxAdFormat.BANNER ? l4.f19980n1 : format == MaxAdFormat.MREC ? l4.f19996p1 : format == MaxAdFormat.LEADER ? l4.f20012r1 : format == MaxAdFormat.NATIVE ? l4.f20028t1 : null;
        if (l4Var != null) {
            return a("viewability_min_height", ((Integer) this.f18925a.a(l4Var)).intValue());
        }
        return 0;
    }

    public float f0() {
        return a("viewability_min_percentage_dp", -1.0f);
    }

    public float g0() {
        return a("viewability_min_percentage_pixels", -1.0f);
    }

    public long h0() {
        return a("viewability_timer_min_visible_ms", ((Long) this.f18925a.a(l4.f20044v1)).longValue());
    }

    public int i0() {
        MaxAdFormat format = getFormat();
        l4 l4Var = format == MaxAdFormat.BANNER ? l4.f19972m1 : format == MaxAdFormat.MREC ? l4.f19988o1 : format == MaxAdFormat.LEADER ? l4.f20004q1 : format == MaxAdFormat.NATIVE ? l4.f20020s1 : null;
        if (l4Var != null) {
            return a("viewability_min_width", ((Integer) this.f18925a.a(l4Var)).intValue());
        }
        return 0;
    }

    public boolean j0() {
        return d0() >= 0 || f0() >= 0.0f || g0() >= 0.0f;
    }
}
