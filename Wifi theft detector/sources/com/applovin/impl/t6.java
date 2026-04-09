package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t6 extends v6 {

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f8148g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinAdRewardListener f8149h;

    public t6(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateAppLovinReward", kVar);
        this.f8148g = bVar;
        this.f8149h = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.q6
    public void a(JSONObject jSONObject) throws JSONException {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f8148g.getAdZone().e());
        String clCode = this.f8148g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.q6
    public String f() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.v6
    public boolean h() {
        return this.f8148g.K0();
    }

    @Override // com.applovin.impl.v6
    public void a(o4 o4Var) {
        this.f8148g.a(o4Var);
        String strB = o4Var.b();
        Map<String, String> mapA = o4Var.a();
        if (strB.equals("accepted")) {
            this.f8149h.userRewardVerified(this.f8148g, mapA);
            return;
        }
        if (strB.equals("quota_exceeded")) {
            this.f8149h.userOverQuota(this.f8148g, mapA);
        } else if (strB.equals("rejected")) {
            this.f8149h.userRewardRejected(this.f8148g, mapA);
        } else {
            this.f8149h.validationRequestFailed(this.f8148g, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.q6
    public void a(int i10) {
        String str;
        super.a(i10);
        if (i10 >= 400 && i10 < 500) {
            this.f8149h.userRewardRejected(this.f8148g, Collections.EMPTY_MAP);
            str = "rejected";
        } else {
            this.f8149h.validationRequestFailed(this.f8148g, i10);
            str = "network_timeout";
        }
        this.f8148g.a(o4.a(str));
    }
}
