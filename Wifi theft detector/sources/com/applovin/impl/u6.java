package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class u6 extends v6 {

    /* renamed from: g, reason: collision with root package name */
    private final c3 f8221g;

    public u6(c3 c3Var, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateMaxReward", kVar);
        this.f8221g = c3Var;
    }

    @Override // com.applovin.impl.q6
    public void a(JSONObject jSONObject) throws JSONException {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, this.f8221g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f8221g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f8221g.e());
        JsonUtils.putString(jSONObject, "ad_format", this.f8221g.getFormat().getLabel());
        String strS0 = this.f8221g.s0();
        if (!StringUtils.isValidString(strS0)) {
            strS0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strS0);
        String strB = this.f8221g.B();
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
        return this.f8221g.w0();
    }

    @Override // com.applovin.impl.v6
    public void a(o4 o4Var) {
        this.f8221g.a(o4Var);
    }

    @Override // com.applovin.impl.q6
    public void a(int i10) {
        String str;
        super.a(i10);
        if (i10 >= 400 && i10 < 500) {
            str = "rejected";
        } else {
            str = "network_timeout";
        }
        this.f8221g.a(o4.a(str));
        this.f6218a.P().a(d2.f5758v0, this.f8221g, CollectionUtils.hashMap("error_message", str));
    }
}
