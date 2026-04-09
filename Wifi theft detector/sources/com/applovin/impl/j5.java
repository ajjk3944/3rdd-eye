package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u4;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class j5 extends i5 {
    public j5(com.applovin.impl.sdk.k kVar) {
        super("TaskApiSubmitData", kVar);
    }

    private void b(JSONObject jSONObject) throws JSONException {
        com.applovin.impl.sdk.l lVarA = this.f6218a.A();
        Map mapP = lVarA.p();
        n7.a("platform", HandleInvocationsFromAdViewer.KEY_AD_TYPE, mapP);
        n7.a("api_level", "sdk_version", mapP);
        JsonUtils.putObject(jSONObject, "device_info", new JSONObject(mapP));
        Map mapG = lVarA.G();
        n7.a("sdk_version", "applovin_sdk_version", mapG);
        n7.a("ia", "installed_at", mapG);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(mapG));
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.d(this.f6219b, "Submitting user data...");
        }
        Map mapC = r0.c(this.f6218a);
        JSONObject jSONObject = new JSONObject();
        b(jSONObject);
        if (((Boolean) this.f6218a.a(x4.F5)).booleanValue() || ((Boolean) this.f6218a.a(x4.f8632z5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a(mapC, jSONObject);
    }

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            j5.this.a(jSONObject);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            r0.a(i10, this.f6218a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        this.f6218a.o0().a(x4.f8459f, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.f6218a.o0().a(x4.f8495j, JsonUtils.getString(jSONObject2, "device_token", ""));
        r0.a(jSONObject2, this.f6218a);
    }

    private void a(Map map, JSONObject jSONObject) {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f6218a).b(r0.b("2.0/device", this.f6218a)).a(r0.a("2.0/device", this.f6218a)).b(map).a(jSONObject).c("POST").b(((Boolean) this.f6218a.a(x4.M5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f6218a.a(x4.Z2)).intValue()).a(u4.a.a(((Integer) this.f6218a.a(x4.f8608w5)).intValue())).a(), this.f6218a);
        aVar.c(x4.f8531n0);
        aVar.b(x4.f8539o0);
        this.f6218a.q0().a(aVar);
    }
}
