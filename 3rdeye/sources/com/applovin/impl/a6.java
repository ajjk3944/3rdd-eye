package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a6 extends c6 {

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f18942g;

    public a6(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        super("TaskReportAppLovinReward", kVar);
        this.f18942g = bVar;
    }

    @Override // com.applovin.impl.e6
    public void a(JSONObject jSONObject) throws JSONException {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f18942g.getAdZone().e());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f18942g.Z());
        String clCode = this.f18942g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.c6
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Reported reward successfully for ad: " + this.f18942g);
        }
    }

    @Override // com.applovin.impl.e6
    public String f() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.c6
    public b4 h() {
        return this.f18942g.i();
    }

    @Override // com.applovin.impl.c6
    public void i() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.b(this.f21693b, "No reward result was found for ad: " + this.f18942g);
        }
    }

    @Override // com.applovin.impl.e6
    public void a(int i) {
        super.a(i);
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.b(this.f21693b, "Failed to report reward for ad: " + this.f18942g + " - error code: " + i);
        }
        this.f21692a.g().a(y1.f21821u, this.f18942g);
    }
}
