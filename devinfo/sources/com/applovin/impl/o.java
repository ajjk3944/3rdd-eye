package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final String f4908a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4909b;

    /* renamed from: c, reason: collision with root package name */
    private final k8 f4910c;

    /* renamed from: d, reason: collision with root package name */
    private final List f4911d;

    /* renamed from: e, reason: collision with root package name */
    private final List f4912e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4913f = false;

    public o(JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        this.f4908a = JsonUtils.getString(jSONObject, "name", "");
        this.f4909b = JsonUtils.getString(jSONObject, "experiment", null);
        this.f4910c = a(jSONObject);
        this.f4911d = a("bidders", jSONObject, map, maxAdFormat, kVar);
        this.f4912e = a("waterfall", jSONObject, map, maxAdFormat, kVar);
    }

    public List a() {
        return this.f4911d;
    }

    public String b() {
        return this.f4909b;
    }

    public String c() {
        return this.f4908a;
    }

    public k8 d() {
        return this.f4910c;
    }

    public List e() {
        return this.f4912e;
    }

    public boolean f() {
        return this.f4913f;
    }

    private k8 a(JSONObject jSONObject) {
        return new k8(JsonUtils.getJSONObject(jSONObject, "targeting"));
    }

    private List a(String str, JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        e3 e3Var;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayS = a0.g.s(str, jSONObject);
        for (int i4 = 0; i4 < jSONArrayS.length(); i4++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayS, i4, (JSONObject) null);
            if (jSONObject2 != null && (e3Var = (e3) map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (e3Var.C()) {
                    this.f4913f = true;
                }
                arrayList.add(new i8(jSONObject2, maxAdFormat, e3Var, kVar));
            }
        }
        return arrayList;
    }
}
