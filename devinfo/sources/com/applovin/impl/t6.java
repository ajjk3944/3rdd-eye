package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class t6 extends v6 {
    private final com.applovin.impl.sdk.ad.b g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinAdRewardListener f5774h;

    public t6(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateAppLovinReward", kVar);
        this.g = bVar;
        this.f5774h = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.q6
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.g.getAdZone().e());
        String clCode = this.g.getClCode();
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
        return this.g.K0();
    }

    @Override // com.applovin.impl.v6
    public void a(o4 o4Var) {
        this.g.a(o4Var);
        String strB = o4Var.b();
        Map<String, String> mapA = o4Var.a();
        if (strB.equals("accepted")) {
            this.f5774h.userRewardVerified(this.g, mapA);
            return;
        }
        if (strB.equals("quota_exceeded")) {
            this.f5774h.userOverQuota(this.g, mapA);
        } else if (strB.equals("rejected")) {
            this.f5774h.userRewardRejected(this.g, mapA);
        } else {
            this.f5774h.validationRequestFailed(this.g, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.q6
    public void a(int i4) {
        String str;
        super.a(i4);
        if (i4 >= 400 && i4 < 500) {
            this.f5774h.userRewardRejected(this.g, Collections.EMPTY_MAP);
            str = "rejected";
        } else {
            this.f5774h.validationRequestFailed(this.g, i4);
            str = "network_timeout";
        }
        this.g.a(o4.a(str));
    }
}
