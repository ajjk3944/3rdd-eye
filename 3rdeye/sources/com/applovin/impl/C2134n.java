package com.applovin.impl;

import N7.H7;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2134n {

    /* renamed from: a, reason: collision with root package name */
    private final String f20540a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20541b;

    /* renamed from: c, reason: collision with root package name */
    private final x7 f20542c;

    /* renamed from: d, reason: collision with root package name */
    private final List f20543d;

    /* renamed from: e, reason: collision with root package name */
    private final List f20544e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20545f = false;

    public C2134n(JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        this.f20540a = JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, "");
        this.f20541b = JsonUtils.getString(jSONObject, "experiment", null);
        this.f20542c = a(jSONObject);
        this.f20543d = a("bidders", jSONObject, map, maxAdFormat, kVar);
        this.f20544e = a("waterfall", jSONObject, map, maxAdFormat, kVar);
    }

    public List a() {
        return this.f20543d;
    }

    public String b() {
        return this.f20541b;
    }

    public String c() {
        return this.f20540a;
    }

    public x7 d() {
        return this.f20542c;
    }

    public List e() {
        return this.f20544e;
    }

    public boolean f() {
        return this.f20545f;
    }

    private x7 a(JSONObject jSONObject) {
        return new x7(JsonUtils.getJSONObject(jSONObject, "targeting"));
    }

    private List a(String str, JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        v2 v2Var;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayQ = H7.q(str, jSONObject);
        for (int i = 0; i < jSONArrayQ.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayQ, i, (JSONObject) null);
            if (jSONObject2 != null && (v2Var = (v2) map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (v2Var.D()) {
                    this.f20545f = true;
                }
                arrayList.add(new v7(jSONObject2, maxAdFormat, v2Var, kVar));
            }
        }
        return arrayList;
    }
}
