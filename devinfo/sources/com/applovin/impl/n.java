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
public class n implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final String f4852a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4853b;

    /* renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f4854c;

    /* renamed from: d, reason: collision with root package name */
    private final o f4855d;

    /* renamed from: e, reason: collision with root package name */
    private final List f4856e;

    public n(JSONObject jSONObject, Map map, com.applovin.impl.sdk.k kVar) {
        this.f4852a = JsonUtils.getString(jSONObject, "name", "");
        this.f4853b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f4854c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArrayS = a0.g.s("waterfalls", jSONObject);
        this.f4856e = new ArrayList(jSONArrayS.length());
        for (int i4 = 0; i4 < jSONArrayS.length(); i4++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayS, i4, (JSONObject) null);
            if (jSONObject2 != null) {
                this.f4856e.add(new o(jSONObject2, map, this.f4854c, kVar));
            }
        }
        this.f4855d = this.f4856e.isEmpty() ? null : (o) this.f4856e.get(0);
    }

    public MaxAdFormat a() {
        return this.f4854c;
    }

    public String b() {
        MaxAdFormat maxAdFormat = this.f4854c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public String c() {
        return this.f4852a;
    }

    public String d() {
        return this.f4853b;
    }

    public String e() {
        return "\n---------- " + this.f4853b + " ----------\nIdentifier - " + this.f4852a + "\nFormat     - " + b();
    }

    public o f() {
        return this.f4855d;
    }

    public List g() {
        return this.f4856e;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        return this.f4853b.compareToIgnoreCase(nVar.f4853b);
    }
}
