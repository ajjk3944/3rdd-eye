package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final String f6996a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6997b;

    /* renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f6998c;

    /* renamed from: d, reason: collision with root package name */
    private final o f6999d;

    /* renamed from: e, reason: collision with root package name */
    private final List f7000e;

    public n(JSONObject jSONObject, Map map, com.applovin.impl.sdk.k kVar) {
        this.f6996a = JsonUtils.getString(jSONObject, "name", "");
        this.f6997b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f6998c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.f7000e = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                this.f7000e.add(new o(jSONObject2, map, this.f6998c, kVar));
            }
        }
        this.f6999d = this.f7000e.isEmpty() ? null : (o) this.f7000e.get(0);
    }

    public MaxAdFormat a() {
        return this.f6998c;
    }

    public String b() {
        MaxAdFormat maxAdFormat = this.f6998c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public String c() {
        return this.f6996a;
    }

    public String d() {
        return this.f6997b;
    }

    public String e() {
        return "\n---------- " + this.f6997b + " ----------\nIdentifier - " + this.f6996a + "\nFormat     - " + b();
    }

    public o f() {
        return this.f6999d;
    }

    public List g() {
        return this.f7000e;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        return this.f6997b.compareToIgnoreCase(nVar.f6997b);
    }
}
