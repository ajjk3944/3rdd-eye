package com.applovin.impl;

import N7.H7;
import com.applovin.impl.i4;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class x4 extends w4 {
    public x4(com.applovin.impl.sdk.k kVar) {
        super("TaskApiSubmitData", kVar);
    }

    private void b(JSONObject jSONObject) throws JSONException {
        com.applovin.impl.sdk.l lVarB = this.f21692a.B();
        Map mapN = lVarB.n();
        a7.a("platform", "type", mapN);
        a7.a("api_level", "sdk_version", mapN);
        JsonUtils.putObject(jSONObject, "device_info", new JSONObject(mapN));
        Map mapD = lVarB.D();
        a7.a("sdk_version", "applovin_sdk_version", mapD);
        a7.a("ia", "installed_at", mapD);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(mapD));
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.d(this.f21693b, "Submitting user data...");
        }
        Map mapC = AbstractC2135n0.c(this.f21692a);
        JSONObject jSONObject = new JSONObject();
        b(jSONObject);
        if (((Boolean) this.f21692a.a(l4.f19923f5)).booleanValue() || ((Boolean) this.f21692a.a(l4.f19878Z4)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a(mapC, jSONObject);
    }

    public class a extends z5 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, JSONObject jSONObject, int i) {
            x4.this.a(jSONObject);
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            AbstractC2135n0.a(i, this.f21692a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(H7.q("results", jSONObject), 0, new JSONObject());
        this.f21692a.o0().a(l4.f19917f, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.f21692a.o0().a(l4.f19948j, JsonUtils.getString(jSONObject2, "device_token", ""));
        AbstractC2135n0.a(jSONObject2, this.f21692a);
    }

    private void a(Map map, JSONObject jSONObject) {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f21692a).b(AbstractC2135n0.b("2.0/device", this.f21692a)).a(AbstractC2135n0.a("2.0/device", this.f21692a)).b(map).a(jSONObject).c("POST").b(((Boolean) this.f21692a.a(l4.f19976m5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f21692a.a(l4.f19821R2)).intValue()).a(i4.a.a(((Integer) this.f21692a.a(l4.f19864X4)).intValue())).a(), this.f21692a);
        aVar.c(l4.f20011r0);
        aVar.b(l4.f20019s0);
        this.f21692a.q0().a(aVar);
    }
}
