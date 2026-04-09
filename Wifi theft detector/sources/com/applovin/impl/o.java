package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final String f7069a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7070b;

    /* renamed from: c, reason: collision with root package name */
    private final k8 f7071c;

    /* renamed from: d, reason: collision with root package name */
    private final List f7072d;

    /* renamed from: e, reason: collision with root package name */
    private final List f7073e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7074f = false;

    public o(JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        this.f7069a = JsonUtils.getString(jSONObject, "name", "");
        this.f7070b = JsonUtils.getString(jSONObject, "experiment", null);
        this.f7071c = a(jSONObject);
        this.f7072d = a("bidders", jSONObject, map, maxAdFormat, kVar);
        this.f7073e = a("waterfall", jSONObject, map, maxAdFormat, kVar);
    }

    public List a() {
        return this.f7072d;
    }

    public String b() {
        return this.f7070b;
    }

    public String c() {
        return this.f7069a;
    }

    public k8 d() {
        return this.f7071c;
    }

    public List e() {
        return this.f7073e;
    }

    public boolean f() {
        return this.f7074f;
    }

    private k8 a(JSONObject jSONObject) {
        return new k8(JsonUtils.getJSONObject(jSONObject, "targeting"));
    }

    private List a(String str, JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        e3 e3Var;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null && (e3Var = (e3) map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (e3Var.C()) {
                    this.f7074f = true;
                }
                arrayList.add(new i8(jSONObject2, maxAdFormat, e3Var, kVar));
            }
        }
        return arrayList;
    }
}
