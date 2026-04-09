package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u4;
import com.applovin.impl.v;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class w5 extends i5 {

    /* renamed from: g, reason: collision with root package name */
    private final q0.e f8364g;

    public w5(q0.e eVar, com.applovin.impl.sdk.k kVar) {
        super("TaskFetchMediationDebuggerInfo", kVar, true);
        this.f8364g = eVar;
    }

    public Map e() {
        HashMap map = new HashMap();
        map.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f6218a.a(x4.f8510k5)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f6218a.i0());
        }
        Map mapG = this.f6218a.A().G();
        map.put(CampaignEx.JSON_KEY_PACKAGE_NAME, String.valueOf(mapG.get(CampaignEx.JSON_KEY_PACKAGE_NAME)));
        map.put("app_version", String.valueOf(mapG.get("app_version")));
        Map mapN = this.f6218a.A().N();
        map.put("platform", String.valueOf(mapN.get("platform")));
        map.put("os", String.valueOf(mapN.get("os")));
        return map;
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        Map mapE = e();
        JSONObject jSONObjectA = a(a());
        if (((Boolean) this.f6218a.a(x4.C5)).booleanValue() || ((Boolean) this.f6218a.a(x4.f8632z5)).booleanValue()) {
            JsonUtils.putAll(jSONObjectA, (Map<String, ?>) mapE);
            mapE = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f6218a).c("POST").b(l3.i(this.f6218a)).a(l3.h(this.f6218a)).b(mapE).a(jSONObjectA).a((Object) new JSONObject()).c(((Long) this.f6218a.a(r3.f7481t7)).intValue()).a(u4.a.a(((Integer) this.f6218a.a(x4.f8568r5)).intValue())).a(), this.f6218a, d());
        aVar.c(r3.f7473p7);
        aVar.b(r3.f7475q7);
        this.f6218a.q0().a(aVar);
    }

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10) {
            super(aVar, kVar, z10);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            w5.this.f8364g.a(str, jSONObject, i10);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            w5.this.f8364g.a(str, i10, str2, jSONObject);
        }
    }

    private JSONObject a(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, "installed_mediation_adapters", w3.b(this.f6218a));
        JsonUtils.putBoolean(jSONObject, "is_tablet", AppLovinSdkUtils.isTablet(context));
        v.a aVarF = this.f6218a.A().f();
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", aVarF.b().b());
        JsonUtils.putStringIfValid(jSONObject, "idfa", aVarF.a());
        Map mapK0 = this.f6218a.k0();
        if (!CollectionUtils.isEmpty(mapK0)) {
            JsonUtils.putJSONObject(jSONObject, "segments", new JSONObject(mapK0));
        }
        return jSONObject;
    }
}
