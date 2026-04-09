package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.singular.sdk.internal.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h6 extends i6 {

    /* renamed from: g, reason: collision with root package name */
    private final t2 f19505g;

    public h6(t2 t2Var, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateMaxReward", kVar);
        this.f19505g = t2Var;
    }

    @Override // com.applovin.impl.e6
    public void a(JSONObject jSONObject) throws JSONException {
        JsonUtils.putString(jSONObject, Constants.ADMON_AD_UNIT_ID, this.f19505g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f19505g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f19505g.e());
        JsonUtils.putString(jSONObject, "ad_format", this.f19505g.getFormat().getLabel());
        String strL0 = this.f19505g.l0();
        if (!StringUtils.isValidString(strL0)) {
            strL0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strL0);
        String strC = this.f19505g.C();
        if (!StringUtils.isValidString(strC)) {
            strC = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strC);
    }

    @Override // com.applovin.impl.e6
    public String f() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.i6
    public boolean h() {
        return this.f19505g.n0();
    }

    @Override // com.applovin.impl.i6
    public void a(b4 b4Var) {
        this.f19505g.a(b4Var);
    }

    @Override // com.applovin.impl.e6
    public void a(int i) {
        String str;
        super.a(i);
        if (i >= 400 && i < 500) {
            str = "rejected";
        } else {
            str = "network_timeout";
        }
        this.f19505g.a(b4.a(str));
        this.f21692a.P().a(y1.f21795g0, this.f19505g, CollectionUtils.hashMap("error_message", str));
    }
}
