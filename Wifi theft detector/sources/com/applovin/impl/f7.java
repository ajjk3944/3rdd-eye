package com.applovin.impl;

import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6014a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6015b;

    /* renamed from: c, reason: collision with root package name */
    private List f6016c;

    public f7(com.applovin.impl.sdk.k kVar) {
        this.f6014a = kVar;
        z4 z4Var = z4.I;
        this.f6015b = ((Boolean) kVar.a(z4Var, Boolean.FALSE)).booleanValue() || y.a(com.applovin.impl.sdk.k.o()).a("applovin.sdk.is_test_environment") || AppLovinSdkUtils.isEmulator() || kVar.A().U();
        kVar.c(z4Var);
    }

    private void e() {
        com.applovin.impl.sdk.j jVarT = this.f6014a.t();
        if (this.f6015b) {
            jVarT.b(this.f6016c);
        } else {
            jVarT.a(this.f6016c);
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
        return this.f6016c;
    }

    public boolean c() {
        return this.f6015b;
    }

    public boolean d() {
        List list = this.f6016c;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void a(List list) {
        if (list == null && this.f6016c == null) {
            return;
        }
        if (list == null || !list.equals(this.f6016c)) {
            this.f6016c = list;
            e();
        }
    }

    public void a() {
        this.f6014a.b(z4.I, Boolean.TRUE);
    }

    public void a(JSONObject jSONObject) {
        if (this.f6015b) {
            return;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray());
        com.applovin.impl.sdk.l lVarA = this.f6014a.A();
        boolean zU = lVarA.U();
        String strA = lVarA.f().a();
        l.b bVarH = lVarA.H();
        this.f6015b = zU || JsonUtils.containsCaseInsensitiveString(strA, jSONArray) || JsonUtils.containsCaseInsensitiveString(bVarH != null ? bVarH.f7888a : null, jSONArray);
    }
}
