package com.applovin.impl;

import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class q6 extends i5 {
    public q6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    public abstract void a(JSONObject jSONObject);

    public void a(JSONObject jSONObject, q0.e eVar) {
        Map mapC = r0.c(this.f4287a);
        if (((Boolean) this.f4287a.a(x4.G5)).booleanValue() || ((Boolean) this.f4287a.a(x4.f6190z5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f4287a).b(r0.b(f(), this.f4287a)).a(r0.a(f(), this.f4287a)).b(mapC).a(jSONObject).c("POST").b(((Boolean) this.f4287a.a(x4.P5)).booleanValue()).a((Object) new JSONObject()).a(g()).a(u4.a.a(((Integer) this.f4287a.a(x4.f6175x5)).intValue())).a(), this.f4287a, eVar);
        aVar.c(x4.f6093n0);
        aVar.b(x4.f6101o0);
        this.f4287a.q0().a(aVar);
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        String strE = this.f4287a.w0().e();
        if (((Boolean) this.f4287a.a(x4.B3)).booleanValue() && StringUtils.isValidString(strE)) {
            JsonUtils.putString(jSONObject, "cuid", strE);
        }
        if (((Boolean) this.f4287a.a(x4.D3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f4287a.u());
        }
        if (((Boolean) this.f4287a.a(x4.F3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f4287a.h0());
        }
        a(jSONObject);
        return jSONObject;
    }

    public abstract String f();

    public abstract int g();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends l6 {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ q0.e f5167m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, q0.e eVar) {
            super(aVar, kVar);
            this.f5167m = eVar;
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i4) {
            this.f5167m.a(str, jSONObject, i4);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i4, String str2, JSONObject jSONObject) {
            this.f5167m.a(str, i4, str2, jSONObject);
        }
    }

    public void a(int i4) {
        r0.a(i4, this.f4287a);
    }
}
