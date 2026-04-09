package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class u6 extends v6 {
    private final c3 g;

    public u6(c3 c3Var, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateMaxReward", kVar);
        this.g = c3Var;
    }

    @Override // com.applovin.impl.q6
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, this.g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.g.e());
        JsonUtils.putString(jSONObject, "ad_format", this.g.getFormat().getLabel());
        String strS0 = this.g.s0();
        if (!StringUtils.isValidString(strS0)) {
            strS0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strS0);
        String strB = this.g.B();
        if (!StringUtils.isValidString(strB)) {
            strB = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strB);
    }

    @Override // com.applovin.impl.q6
    public String f() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.v6
    public boolean h() {
        return this.g.w0();
    }

    @Override // com.applovin.impl.v6
    public void a(o4 o4Var) {
        this.g.a(o4Var);
    }

    @Override // com.applovin.impl.q6
    public void a(int i4) {
        String str;
        super.a(i4);
        if (i4 >= 400 && i4 < 500) {
            str = "rejected";
        } else {
            str = "network_timeout";
        }
        this.g.a(o4.a(str));
        this.f4287a.P().a(d2.f3912v0, this.g, CollectionUtils.hashMap("error_message", str));
    }
}
