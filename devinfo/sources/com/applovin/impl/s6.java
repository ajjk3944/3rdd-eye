package com.applovin.impl;

import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.impl.v;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class s6 extends i5 {
    private final p2 g;

    /* renamed from: h, reason: collision with root package name */
    private final Exception f5308h;

    public s6(com.applovin.impl.sdk.k kVar, p2 p2Var, Exception exc) {
        super("TaskValidateLicense", kVar);
        this.g = p2Var;
        this.f5308h = exc;
    }

    private String e() {
        return r0.a((String) this.f4287a.a(x4.f6154v0), (String) this.f4287a.a(x4.f6162w0), this.f4287a);
    }

    private JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        v.a aVarF = this.f4287a.A().f();
        JsonUtils.putBoolean(jSONObject, "dnt", aVarF.c());
        JsonUtils.putString(jSONObject, "dnt_code", aVarF.b().b());
        if (((Boolean) this.f4287a.a(x4.f6181y3)).booleanValue() && StringUtils.isValidString(aVarF.a())) {
            JsonUtils.putString(jSONObject, "idfa", aVarF.a());
        }
        l.b bVarH = this.f4287a.A().H();
        if (((Boolean) this.f4287a.a(x4.z3)).booleanValue() && bVarH != null) {
            JsonUtils.putString(jSONObject, "idfv", bVarH.f5587a);
            JsonUtils.putInt(jSONObject, "idfv_scope", bVarH.f5588b);
        }
        String strE = this.f4287a.w0().e();
        if (((Boolean) this.f4287a.a(x4.A3)).booleanValue() && StringUtils.isValidString(strE)) {
            JsonUtils.putString(jSONObject, "cuid", strE);
        }
        if (((Boolean) this.f4287a.a(x4.D3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f4287a.u());
        }
        if (((Boolean) this.f4287a.a(x4.F3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f4287a.h0());
        }
        JsonUtils.putAll(jSONObject, (Map<String, ?>) this.f4287a.A().e());
        JSONObject jSONObject2 = new JSONObject();
        p2 p2Var = this.g;
        if (p2Var != null) {
            JsonUtils.putString(jSONObject2, "lsig", p2Var.d());
            JsonUtils.putString(jSONObject2, "lsigd", this.g.e());
            JsonUtils.putInt(jSONObject2, "r_code", this.g.c());
            JsonUtils.putInt(jSONObject2, "n", this.g.b());
        }
        Exception exc = this.f5308h;
        if (exc != null) {
            JsonUtils.putStringIfValid(jSONObject2, "lvfr", exc.toString());
        }
        JsonUtils.putObject(jSONObject, "lvd", jSONObject2);
        return jSONObject;
    }

    private String g() {
        return r0.a((String) this.f4287a.a(x4.f6147u0), (String) this.f4287a.a(x4.f6162w0), this.f4287a);
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f4287a).b(g()).a(e()).a(f()).c("POST").b(((Boolean) this.f4287a.a(x4.Q5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f4287a.a(x4.f6142t3)).intValue()).a(u4.a.a(((Integer) this.f4287a.a(x4.f6183y5)).intValue())).a(), this.f4287a);
        aVar.c(x4.f6147u0);
        aVar.b(x4.f6154v0);
        this.f4287a.q0().a(aVar);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i4) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.a(this.f4288b, "License Validation successful");
            }
            a5.b(z4.f6316i, Boolean.FALSE, com.applovin.impl.sdk.k.o());
            Map map = CollectionUtils.map("code", String.valueOf(i4));
            CollectionUtils.putStringIfValid("url", str, map);
            this.f4287a.v0().d(d2.f3891l, map);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i4, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.b(this.f4288b, "Failed to validate license: ");
            }
            if (!this.f4287a.c(x4.A).contains(String.valueOf(i4))) {
                a5.b(z4.f6316i, Boolean.FALSE, com.applovin.impl.sdk.k.o());
            }
            Map map = CollectionUtils.map("error_code", String.valueOf(i4));
            CollectionUtils.putStringIfValid("error_message", str2, map);
            CollectionUtils.putStringIfValid("url", str, map);
            this.f4287a.v0().d(d2.f3893m, map);
        }
    }
}
