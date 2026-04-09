package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m6 extends o6 {

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f6484g;

    public m6(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        super("TaskReportAppLovinReward", kVar);
        this.f6484g = bVar;
    }

    @Override // com.applovin.impl.q6
    public void a(JSONObject jSONObject) throws JSONException {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f6484g.getAdZone().e());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f6484g.P());
        String clCode = this.f6484g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.o6
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Reported reward successfully for ad: " + this.f6484g);
        }
    }

    @Override // com.applovin.impl.q6
    public String f() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.o6
    public o4 h() {
        return this.f6484g.i();
    }

    @Override // com.applovin.impl.o6
    public void i() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.b(this.f6219b, "No reward result was found for ad: " + this.f6484g);
        }
    }

    @Override // com.applovin.impl.q6
    public void a(int i10) {
        super.a(i10);
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.b(this.f6219b, "Failed to report reward for ad: " + this.f6484g + " - error code: " + i10);
        }
        this.f6218a.g().a(d2.H, this.f6484g);
    }
}
