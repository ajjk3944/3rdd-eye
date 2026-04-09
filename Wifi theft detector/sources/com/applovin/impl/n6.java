package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n6 extends o6 {

    /* renamed from: g, reason: collision with root package name */
    private final c3 f7032g;

    public n6(c3 c3Var, com.applovin.impl.sdk.k kVar) {
        super("TaskReportMaxReward", kVar);
        this.f7032g = c3Var;
    }

    @Override // com.applovin.impl.q6
    public void a(JSONObject jSONObject) throws JSONException {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, this.f7032g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f7032g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f7032g.e());
        String strS0 = this.f7032g.s0();
        if (!StringUtils.isValidString(strS0)) {
            strS0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strS0);
        String strB = this.f7032g.B();
        if (!StringUtils.isValidString(strB)) {
            strB = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strB);
    }

    @Override // com.applovin.impl.o6
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Reported reward successfully for mediated ad: " + this.f7032g);
        }
    }

    @Override // com.applovin.impl.q6
    public String f() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.o6
    public o4 h() {
        return this.f7032g.o0();
    }

    @Override // com.applovin.impl.o6
    public void i() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.b(this.f6219b, "No reward result was found for mediated ad: " + this.f7032g);
        }
    }

    @Override // com.applovin.impl.q6
    public void a(int i10) {
        super.a(i10);
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Failed to report reward for mediated ad: " + this.f7032g + " - error code: " + i10);
        }
        this.f6218a.P().a(d2.f5756u0, this.f7032g);
    }
}
