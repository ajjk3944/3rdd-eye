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
public class g6 extends i6 {

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f19436g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinAdRewardListener f19437h;

    public g6(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateAppLovinReward", kVar);
        this.f19436g = bVar;
        this.f19437h = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.e6
    public void a(JSONObject jSONObject) throws JSONException {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f19436g.getAdZone().e());
        String clCode = this.f19436g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.e6
    public String f() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.i6
    public boolean h() {
        return this.f19436g.W0();
    }

    @Override // com.applovin.impl.i6
    public void a(b4 b4Var) {
        this.f19436g.a(b4Var);
        String strB = b4Var.b();
        Map<String, String> mapA = b4Var.a();
        if (strB.equals("accepted")) {
            this.f19437h.userRewardVerified(this.f19436g, mapA);
            return;
        }
        if (strB.equals("quota_exceeded")) {
            this.f19437h.userOverQuota(this.f19436g, mapA);
        } else if (strB.equals("rejected")) {
            this.f19437h.userRewardRejected(this.f19436g, mapA);
        } else {
            this.f19437h.validationRequestFailed(this.f19436g, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.e6
    public void a(int i) {
        String str;
        super.a(i);
        if (i >= 400 && i < 500) {
            this.f19437h.userRewardRejected(this.f19436g, Collections.EMPTY_MAP);
            str = "rejected";
        } else {
            this.f19437h.validationRequestFailed(this.f19436g, i);
            str = "network_timeout";
        }
        this.f19436g.a(b4.a(str));
    }
}
