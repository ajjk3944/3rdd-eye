package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.AbstractC2147u;
import com.applovin.impl.C2132m0;
import com.applovin.impl.i4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k5 extends w4 {

    /* renamed from: g, reason: collision with root package name */
    private final C2132m0.e f19658g;

    public k5(C2132m0.e eVar, com.applovin.impl.sdk.k kVar) {
        super("TaskFetchMediationDebuggerInfo", kVar, true);
        this.f19658g = eVar;
    }

    public Map e() {
        HashMap map = new HashMap();
        map.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f21692a.a(l4.f19783L4)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f21692a.i0());
        }
        Map mapD = this.f21692a.B().D();
        map.put("package_name", String.valueOf(mapD.get("package_name")));
        map.put("app_version", String.valueOf(mapD.get("app_version")));
        Map mapL = this.f21692a.B().L();
        map.put("platform", String.valueOf(mapL.get("platform")));
        map.put("os", String.valueOf(mapL.get("os")));
        return map;
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        Map mapE = e();
        JSONObject jSONObjectA = a(a());
        if (((Boolean) this.f21692a.a(l4.f19900c5)).booleanValue() || ((Boolean) this.f21692a.a(l4.f19878Z4)).booleanValue()) {
            JsonUtils.putAll(jSONObjectA, (Map<String, ?>) mapE);
            mapE = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f21692a).c("POST").b(b3.i(this.f21692a)).a(b3.h(this.f21692a)).b(mapE).a(jSONObjectA).a((Object) new JSONObject()).c(((Long) this.f21692a.a(g3.f19384Q6)).intValue()).a(i4.a.a(((Integer) this.f21692a.a(l4.f19830S4)).intValue())).a(), this.f21692a, d());
        aVar.c(g3.f19376M6);
        aVar.b(g3.f19378N6);
        this.f21692a.q0().a(aVar);
    }

    public class a extends z5 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10) {
            super(aVar, kVar, z10);
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, JSONObject jSONObject, int i) {
            k5.this.f19658g.a(str, jSONObject, i);
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            k5.this.f19658g.a(str, i, str2, jSONObject);
        }
    }

    private JSONObject a(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, "installed_mediation_adapters", l3.b(this.f21692a));
        JsonUtils.putBoolean(jSONObject, "is_tablet", AppLovinSdkUtils.isTablet(context));
        AbstractC2147u.a aVarF = this.f21692a.B().f();
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", aVarF.b().b());
        JsonUtils.putStringIfValid(jSONObject, "idfa", aVarF.a());
        Map mapK0 = this.f21692a.k0();
        if (!CollectionUtils.isEmpty(mapK0)) {
            JsonUtils.putJSONObject(jSONObject, "segments", new JSONObject(mapK0));
        }
        return jSONObject;
    }
}
