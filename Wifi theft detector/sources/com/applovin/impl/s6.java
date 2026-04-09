package com.applovin.impl;

import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.impl.v;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class s6 extends i5 {

    /* renamed from: g, reason: collision with root package name */
    private final p2 f7560g;

    /* renamed from: h, reason: collision with root package name */
    private final Exception f7561h;

    public s6(com.applovin.impl.sdk.k kVar, p2 p2Var, Exception exc) {
        super("TaskValidateLicense", kVar);
        this.f7560g = p2Var;
        this.f7561h = exc;
    }

    private String e() {
        return r0.a((String) this.f6218a.a(x4.f8595v0), (String) this.f6218a.a(x4.f8603w0), this.f6218a);
    }

    private JSONObject f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        v.a aVarF = this.f6218a.A().f();
        JsonUtils.putBoolean(jSONObject, "dnt", aVarF.c());
        JsonUtils.putString(jSONObject, "dnt_code", aVarF.b().b());
        if (((Boolean) this.f6218a.a(x4.f8622y3)).booleanValue() && StringUtils.isValidString(aVarF.a())) {
            JsonUtils.putString(jSONObject, "idfa", aVarF.a());
        }
        l.b bVarH = this.f6218a.A().H();
        if (((Boolean) this.f6218a.a(x4.f8630z3)).booleanValue() && bVarH != null) {
            JsonUtils.putString(jSONObject, "idfv", bVarH.f7888a);
            JsonUtils.putInt(jSONObject, "idfv_scope", bVarH.f7889b);
        }
        String strE = this.f6218a.w0().e();
        if (((Boolean) this.f6218a.a(x4.A3)).booleanValue() && StringUtils.isValidString(strE)) {
            JsonUtils.putString(jSONObject, "cuid", strE);
        }
        if (((Boolean) this.f6218a.a(x4.D3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f6218a.u());
        }
        if (((Boolean) this.f6218a.a(x4.F3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f6218a.h0());
        }
        JsonUtils.putAll(jSONObject, (Map<String, ?>) this.f6218a.A().e());
        JSONObject jSONObject2 = new JSONObject();
        p2 p2Var = this.f7560g;
        if (p2Var != null) {
            JsonUtils.putString(jSONObject2, "lsig", p2Var.d());
            JsonUtils.putString(jSONObject2, "lsigd", this.f7560g.e());
            JsonUtils.putInt(jSONObject2, "r_code", this.f7560g.c());
            JsonUtils.putInt(jSONObject2, "n", this.f7560g.b());
        }
        Exception exc = this.f7561h;
        if (exc != null) {
            JsonUtils.putStringIfValid(jSONObject2, "lvfr", exc.toString());
        }
        JsonUtils.putObject(jSONObject, "lvd", jSONObject2);
        return jSONObject;
    }

    private String g() {
        return r0.a((String) this.f6218a.a(x4.f8587u0), (String) this.f6218a.a(x4.f8603w0), this.f6218a);
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f6218a).b(g()).a(e()).a(f()).c("POST").b(((Boolean) this.f6218a.a(x4.Q5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f6218a.a(x4.f8582t3)).intValue()).a(u4.a.a(((Integer) this.f6218a.a(x4.f8624y5)).intValue())).a(), this.f6218a);
        aVar.c(x4.f8587u0);
        aVar.b(x4.f8595v0);
        this.f6218a.q0().a(aVar);
    }

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "License Validation successful");
            }
            a5.b(z4.f8782i, Boolean.FALSE, com.applovin.impl.sdk.k.o());
            Map map = CollectionUtils.map("code", String.valueOf(i10));
            CollectionUtils.putStringIfValid("url", str, map);
            this.f6218a.v0().d(d2.f5737l, map);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.b(this.f6219b, "Failed to validate license: ");
            }
            if (!this.f6218a.c(x4.A).contains(String.valueOf(i10))) {
                a5.b(z4.f8782i, Boolean.FALSE, com.applovin.impl.sdk.k.o());
            }
            Map map = CollectionUtils.map("error_code", String.valueOf(i10));
            CollectionUtils.putStringIfValid("error_message", str2, map);
            CollectionUtils.putStringIfValid("url", str, map);
            this.f6218a.v0().d(d2.f5739m, map);
        }
    }
}
