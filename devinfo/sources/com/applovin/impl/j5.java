package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u4;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
class j5 extends i5 {
    public j5(com.applovin.impl.sdk.k kVar) {
        super("TaskApiSubmitData", kVar);
    }

    private void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.l lVarA = this.f4287a.A();
        Map mapP = lVarA.p();
        n7.a("platform", "type", mapP);
        n7.a("api_level", "sdk_version", mapP);
        JsonUtils.putObject(jSONObject, "device_info", new JSONObject(mapP));
        Map mapG = lVarA.G();
        n7.a("sdk_version", "applovin_sdk_version", mapG);
        n7.a("ia", "installed_at", mapG);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(mapG));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.d(this.f4288b, "Submitting user data...");
        }
        Map mapC = r0.c(this.f4287a);
        JSONObject jSONObject = new JSONObject();
        b(jSONObject);
        if (((Boolean) this.f4287a.a(x4.F5)).booleanValue() || ((Boolean) this.f4287a.a(x4.f6190z5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a(mapC, jSONObject);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i4) {
            j5.this.a(jSONObject);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i4, String str2, JSONObject jSONObject) {
            r0.a(i4, this.f4287a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(a0.g.s("results", jSONObject), 0, new JSONObject());
        this.f4287a.o0().a(x4.f6028f, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.f4287a.o0().a(x4.j, JsonUtils.getString(jSONObject2, "device_token", ""));
        r0.a(jSONObject2, this.f4287a);
    }

    private void a(Map map, JSONObject jSONObject) {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f4287a).b(r0.b("2.0/device", this.f4287a)).a(r0.a("2.0/device", this.f4287a)).b(map).a(jSONObject).c("POST").b(((Boolean) this.f4287a.a(x4.M5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f4287a.a(x4.Z2)).intValue()).a(u4.a.a(((Integer) this.f4287a.a(x4.f6167w5)).intValue())).a(), this.f4287a);
        aVar.c(x4.f6093n0);
        aVar.b(x4.f6101o0);
        this.f4287a.q0().a(aVar);
    }
}
