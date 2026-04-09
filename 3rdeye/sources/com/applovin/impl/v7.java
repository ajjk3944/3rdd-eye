package com.applovin.impl;

import N7.H7;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class v7 {

    /* renamed from: a, reason: collision with root package name */
    private final m2 f21668a;

    /* renamed from: b, reason: collision with root package name */
    private final p3 f21669b;

    /* renamed from: c, reason: collision with root package name */
    private final List f21670c;

    public v7(JSONObject jSONObject, MaxAdFormat maxAdFormat, v2 v2Var, com.applovin.impl.sdk.k kVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f21669b = new p3(jSONObject2, kVar);
        } else {
            this.f21669b = null;
        }
        this.f21668a = new m2(JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, v2Var);
        JSONArray jSONArrayQ = H7.q("placements", jSONObject);
        this.f21670c = new ArrayList(jSONArrayQ.length());
        for (int i = 0; i < jSONArrayQ.length(); i++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayQ, i, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f21670c.add(new p3(jSONObject3, kVar));
            }
        }
    }

    public p3 a() {
        return this.f21669b;
    }

    public m2 b() {
        return this.f21668a;
    }

    public List c() {
        return this.f21670c;
    }

    public boolean d() {
        return this.f21669b != null;
    }
}
