package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i8 {

    /* renamed from: a, reason: collision with root package name */
    private final u2 f6241a;

    /* renamed from: b, reason: collision with root package name */
    private final a4 f6242b;

    /* renamed from: c, reason: collision with root package name */
    private final List f6243c;

    public i8(JSONObject jSONObject, MaxAdFormat maxAdFormat, e3 e3Var, com.applovin.impl.sdk.k kVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f6242b = new a4(jSONObject2, kVar);
        } else {
            this.f6242b = null;
        }
        this.f6241a = new u2(JsonUtils.getString(jSONObject, "name", ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, e3Var);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "placements", new JSONArray());
        this.f6243c = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f6243c.add(new a4(jSONObject3, kVar));
            }
        }
    }

    public a4 a() {
        return this.f6242b;
    }

    public u2 b() {
        return this.f6241a;
    }

    public List c() {
        return this.f6243c;
    }

    public boolean d() {
        return this.f6242b != null;
    }
}
