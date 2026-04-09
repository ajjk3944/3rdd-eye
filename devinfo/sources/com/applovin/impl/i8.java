package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class i8 {

    /* renamed from: a, reason: collision with root package name */
    private final u2 f4309a;

    /* renamed from: b, reason: collision with root package name */
    private final a4 f4310b;

    /* renamed from: c, reason: collision with root package name */
    private final List f4311c;

    public i8(JSONObject jSONObject, MaxAdFormat maxAdFormat, e3 e3Var, com.applovin.impl.sdk.k kVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f4310b = new a4(jSONObject2, kVar);
        } else {
            this.f4310b = null;
        }
        this.f4309a = new u2(JsonUtils.getString(jSONObject, "name", ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, e3Var);
        JSONArray jSONArrayS = a0.g.s("placements", jSONObject);
        this.f4311c = new ArrayList(jSONArrayS.length());
        for (int i4 = 0; i4 < jSONArrayS.length(); i4++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayS, i4, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f4311c.add(new a4(jSONObject3, kVar));
            }
        }
    }

    public a4 a() {
        return this.f4310b;
    }

    public u2 b() {
        return this.f4309a;
    }

    public List c() {
        return this.f4311c;
    }

    public boolean d() {
        return this.f4310b != null;
    }
}
