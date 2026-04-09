package com.applovin.impl;

import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class q6 extends i5 {
    public q6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    public abstract void a(JSONObject jSONObject);

    public void a(JSONObject jSONObject, q0.e eVar) throws JSONException {
        Map mapC = r0.c(this.f6218a);
        if (((Boolean) this.f6218a.a(x4.G5)).booleanValue() || ((Boolean) this.f6218a.a(x4.f8632z5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f6218a).b(r0.b(f(), this.f6218a)).a(r0.a(f(), this.f6218a)).b(mapC).a(jSONObject).c("POST").b(((Boolean) this.f6218a.a(x4.P5)).booleanValue()).a((Object) new JSONObject()).a(g()).a(u4.a.a(((Integer) this.f6218a.a(x4.f8616x5)).intValue())).a(), this.f6218a, eVar);
        aVar.c(x4.f8531n0);
        aVar.b(x4.f8539o0);
        this.f6218a.q0().a(aVar);
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strE = this.f6218a.w0().e();
        if (((Boolean) this.f6218a.a(x4.B3)).booleanValue() && StringUtils.isValidString(strE)) {
            JsonUtils.putString(jSONObject, "cuid", strE);
        }
        if (((Boolean) this.f6218a.a(x4.D3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f6218a.u());
        }
        if (((Boolean) this.f6218a.a(x4.F3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f6218a.h0());
        }
        a(jSONObject);
        return jSONObject;
    }

    public abstract String f();

    public abstract int g();

    public class a extends l6 {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ q0.e f7386m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, q0.e eVar) {
            super(aVar, kVar);
            this.f7386m = eVar;
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            this.f7386m.a(str, jSONObject, i10);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            this.f7386m.a(str, i10, str2, jSONObject);
        }
    }

    public void a(int i10) {
        r0.a(i10, this.f6218a);
    }
}
