package com.applovin.impl;

import N7.H7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class s6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f20944a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f20945b;

    /* renamed from: c, reason: collision with root package name */
    private List f20946c;

    public s6(com.applovin.impl.sdk.k kVar) {
        this.f20944a = kVar;
        n4 n4Var = n4.f20562G;
        this.f20945b = ((Boolean) kVar.a(n4Var, Boolean.FALSE)).booleanValue() || C2153x.a(com.applovin.impl.sdk.k.o()).a("applovin.sdk.is_test_environment") || AppLovinSdkUtils.isEmulator() || kVar.B().R();
        kVar.c(n4Var);
    }

    private void e() {
        com.applovin.impl.sdk.j jVarU = this.f20944a.u();
        if (this.f20945b) {
            jVarU.b(this.f20946c);
        } else {
            jVarU.a(this.f20946c);
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
        return this.f20946c;
    }

    public boolean c() {
        return this.f20945b;
    }

    public boolean d() {
        List list = this.f20946c;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void a(List list) {
        if (list == null && this.f20946c == null) {
            return;
        }
        if (list == null || !list.equals(this.f20946c)) {
            this.f20946c = list;
            e();
        }
    }

    public void a() {
        this.f20944a.b(n4.f20562G, Boolean.TRUE);
    }

    public void a(JSONObject jSONObject) {
        if (this.f20945b) {
            return;
        }
        JSONArray jSONArrayQ = H7.q("test_mode_idfas", jSONObject);
        com.applovin.impl.sdk.l lVarB = this.f20944a.B();
        boolean zR = lVarB.R();
        String strA = lVarB.f().a();
        l.b bVarE = lVarB.E();
        this.f20945b = zR || JsonUtils.containsCaseInsensitiveString(strA, jSONArrayQ) || JsonUtils.containsCaseInsensitiveString(bVarE != null ? bVarE.f21264a : null, jSONArrayQ);
    }
}
