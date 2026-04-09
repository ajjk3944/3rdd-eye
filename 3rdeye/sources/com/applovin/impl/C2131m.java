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

/* renamed from: com.applovin.impl.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2131m implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final String f20118a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20119b;

    /* renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f20120c;

    /* renamed from: d, reason: collision with root package name */
    private final C2134n f20121d;

    /* renamed from: e, reason: collision with root package name */
    private final List f20122e;

    public C2131m(JSONObject jSONObject, Map map, com.applovin.impl.sdk.k kVar) {
        this.f20118a = JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, "");
        this.f20119b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f20120c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArrayQ = H7.q("waterfalls", jSONObject);
        this.f20122e = new ArrayList(jSONArrayQ.length());
        for (int i = 0; i < jSONArrayQ.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayQ, i, (JSONObject) null);
            if (jSONObject2 != null) {
                this.f20122e.add(new C2134n(jSONObject2, map, this.f20120c, kVar));
            }
        }
        this.f20121d = this.f20122e.isEmpty() ? null : (C2134n) this.f20122e.get(0);
    }

    public MaxAdFormat a() {
        return this.f20120c;
    }

    public String b() {
        MaxAdFormat maxAdFormat = this.f20120c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public String c() {
        return this.f20118a;
    }

    public String d() {
        return this.f20119b;
    }

    public String e() {
        return "\n---------- " + this.f20119b + " ----------\nIdentifier - " + this.f20118a + "\nFormat     - " + b();
    }

    public C2134n f() {
        return this.f20121d;
    }

    public List g() {
        return this.f20122e;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C2131m c2131m) {
        return this.f20119b.compareToIgnoreCase(c2131m.f20119b);
    }
}
