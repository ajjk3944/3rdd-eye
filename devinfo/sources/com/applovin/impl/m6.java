package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class m6 extends o6 {
    private final com.applovin.impl.sdk.ad.b g;

    public m6(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        super("TaskReportAppLovinReward", kVar);
        this.g = bVar;
    }

    @Override // com.applovin.impl.q6
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.g.getAdZone().e());
        JsonUtils.putInt(jSONObject, "fire_percent", this.g.P());
        String clCode = this.g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.o6
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Reported reward successfully for ad: " + this.g);
        }
    }

    @Override // com.applovin.impl.q6
    public String f() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.o6
    public o4 h() {
        return this.g.i();
    }

    @Override // com.applovin.impl.o6
    public void i() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.b(this.f4288b, "No reward result was found for ad: " + this.g);
        }
    }

    @Override // com.applovin.impl.q6
    public void a(int i4) {
        super.a(i4);
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.b(this.f4288b, "Failed to report reward for ad: " + this.g + " - error code: " + i4);
        }
        this.f4287a.g().a(d2.H, this.g);
    }
}
