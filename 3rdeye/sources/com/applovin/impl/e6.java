package com.applovin.impl;

import com.applovin.impl.C2132m0;
import com.applovin.impl.i4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class e6 extends w4 {
    public e6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    public abstract void a(JSONObject jSONObject);

    public void a(JSONObject jSONObject, C2132m0.e eVar) throws JSONException {
        Map mapC = AbstractC2135n0.c(this.f21692a);
        if (((Boolean) this.f21692a.a(l4.f19931g5)).booleanValue() || ((Boolean) this.f21692a.a(l4.f19878Z4)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f21692a).b(AbstractC2135n0.b(f(), this.f21692a)).a(AbstractC2135n0.a(f(), this.f21692a)).b(mapC).a(jSONObject).c("POST").b(((Boolean) this.f21692a.a(l4.f20000p5)).booleanValue()).a((Object) new JSONObject()).a(g()).a(i4.a.a(((Integer) this.f21692a.a(l4.f19871Y4)).intValue())).a(), this.f21692a, eVar);
        aVar.c(l4.f20011r0);
        aVar.b(l4.f20019s0);
        this.f21692a.q0().a(aVar);
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strE = this.f21692a.w0().e();
        if (((Boolean) this.f21692a.a(l4.f20014r3)).booleanValue() && StringUtils.isValidString(strE)) {
            JsonUtils.putString(jSONObject, "cuid", strE);
        }
        if (((Boolean) this.f21692a.a(l4.f20030t3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f21692a.v());
        }
        if (((Boolean) this.f21692a.a(l4.f20046v3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f21692a.h0());
        }
        a(jSONObject);
        return jSONObject;
    }

    public abstract String f();

    public abstract int g();

    public class a extends z5 {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ C2132m0.e f19322m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, C2132m0.e eVar) {
            super(aVar, kVar);
            this.f19322m = eVar;
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, JSONObject jSONObject, int i) {
            this.f19322m.a(str, jSONObject, i);
        }

        @Override // com.applovin.impl.z5, com.applovin.impl.C2132m0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            this.f19322m.a(str, i, str2, jSONObject);
        }
    }

    public void a(int i) {
        AbstractC2135n0.a(i, this.f21692a);
    }
}
