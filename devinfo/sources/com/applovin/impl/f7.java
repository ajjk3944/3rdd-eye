package com.applovin.impl;

import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class f7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4127a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4128b;

    /* renamed from: c, reason: collision with root package name */
    private List f4129c;

    public f7(com.applovin.impl.sdk.k kVar) {
        this.f4127a = kVar;
        z4 z4Var = z4.I;
        this.f4128b = ((Boolean) kVar.a(z4Var, Boolean.FALSE)).booleanValue() || y.a(com.applovin.impl.sdk.k.o()).a("applovin.sdk.is_test_environment") || AppLovinSdkUtils.isEmulator() || kVar.A().U();
        kVar.c(z4Var);
    }

    private void e() {
        com.applovin.impl.sdk.j jVarT = this.f4127a.t();
        if (this.f4128b) {
            jVarT.b(this.f4129c);
        } else {
            jVarT.a(this.f4129c);
        }
    }

    public void a(String str) {
        if (StringUtils.isValidString(str)) {
            a(Collections.singletonList(str));
        } else {
            a((List) null);
        }
    }

    public List b() {
        return this.f4129c;
    }

    public boolean c() {
        return this.f4128b;
    }

    public boolean d() {
        List list = this.f4129c;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void a(List list) {
        if (list == null && this.f4129c == null) {
            return;
        }
        if (list == null || !list.equals(this.f4129c)) {
            this.f4129c = list;
            e();
        }
    }

    public void a() {
        this.f4127a.b(z4.I, Boolean.TRUE);
    }

    public void a(JSONObject jSONObject) {
        if (this.f4128b) {
            return;
        }
        JSONArray jSONArrayS = a0.g.s("test_mode_idfas", jSONObject);
        com.applovin.impl.sdk.l lVarA = this.f4127a.A();
        boolean zU = lVarA.U();
        String strA = lVarA.f().a();
        l.b bVarH = lVarA.H();
        this.f4128b = zU || JsonUtils.containsCaseInsensitiveString(strA, jSONArrayS) || JsonUtils.containsCaseInsensitiveString(bVarH != null ? bVarH.f5587a : null, jSONArrayS);
    }
}
