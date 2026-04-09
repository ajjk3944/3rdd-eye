package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.singular.sdk.internal.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b6 extends c6 {

    /* renamed from: g, reason: collision with root package name */
    private final t2 f19107g;

    public b6(t2 t2Var, com.applovin.impl.sdk.k kVar) {
        super("TaskReportMaxReward", kVar);
        this.f19107g = t2Var;
    }

    @Override // com.applovin.impl.e6
    public void a(JSONObject jSONObject) throws JSONException {
        JsonUtils.putString(jSONObject, Constants.ADMON_AD_UNIT_ID, this.f19107g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f19107g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f19107g.e());
        String strL0 = this.f19107g.l0();
        if (!StringUtils.isValidString(strL0)) {
            strL0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strL0);
        String strC = this.f19107g.C();
        if (!StringUtils.isValidString(strC)) {
            strC = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strC);
    }

    @Override // com.applovin.impl.c6
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Reported reward successfully for mediated ad: " + this.f19107g);
        }
    }

    @Override // com.applovin.impl.e6
    public String f() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.c6
    public b4 h() {
        return this.f19107g.h0();
    }

    @Override // com.applovin.impl.c6
    public void i() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.b(this.f21693b, "No reward result was found for mediated ad: " + this.f19107g);
        }
    }

    @Override // com.applovin.impl.e6
    public void a(int i) {
        super.a(i);
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Failed to report reward for mediated ad: " + this.f19107g + " - error code: " + i);
        }
        this.f21692a.P().a(y1.f21793f0, this.f19107g);
    }
}
