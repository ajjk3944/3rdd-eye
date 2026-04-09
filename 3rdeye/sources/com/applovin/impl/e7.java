package com.applovin.impl;

import N7.H7;
import android.net.Uri;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e7 implements d4 {

    /* renamed from: a, reason: collision with root package name */
    private int f19324a;

    /* renamed from: b, reason: collision with root package name */
    private int f19325b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f19326c;

    /* renamed from: d, reason: collision with root package name */
    private j7 f19327d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f19328e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Map f19329f = new HashMap();

    private e7() {
    }

    public static e7 a(c8 c8Var, e7 e7Var, f7 f7Var, com.applovin.impl.sdk.k kVar) {
        c8 c8VarC;
        if (c8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (e7Var == null) {
            try {
                e7Var = new e7();
            } catch (Throwable th) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastCompanionAd", "Error occurred while initializing", th);
                }
                kVar.E().a("VastCompanionAd", th);
                return null;
            }
        }
        if (e7Var.f19324a == 0 && e7Var.f19325b == 0) {
            int i = StringUtils.parseInt((String) c8Var.a().get("width"));
            int i10 = StringUtils.parseInt((String) c8Var.a().get("height"));
            if (i > 0 && i10 > 0) {
                e7Var.f19324a = i;
                e7Var.f19325b = i10;
            }
        }
        e7Var.f19327d = j7.a(c8Var, e7Var.f19327d, kVar);
        if (e7Var.f19326c == null && (c8VarC = c8Var.c("CompanionClickThrough")) != null) {
            String strD = c8VarC.d();
            if (StringUtils.isValidString(strD)) {
                e7Var.f19326c = Uri.parse(strD);
            }
        }
        n7.a(c8Var.a("CompanionClickTracking"), e7Var.f19328e, f7Var, kVar);
        n7.a(c8Var, e7Var.f19329f, f7Var, kVar);
        return e7Var;
    }

    public Set b() {
        return this.f19328e;
    }

    public Uri c() {
        return this.f19326c;
    }

    public Map d() {
        return this.f19329f;
    }

    public j7 e() {
        return this.f19327d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        if (this.f19324a != e7Var.f19324a || this.f19325b != e7Var.f19325b) {
            return false;
        }
        Uri uri = this.f19326c;
        if (uri == null ? e7Var.f19326c != null : !uri.equals(e7Var.f19326c)) {
            return false;
        }
        j7 j7Var = this.f19327d;
        if (j7Var == null ? e7Var.f19327d != null : !j7Var.equals(e7Var.f19327d)) {
            return false;
        }
        Set set = this.f19328e;
        if (set == null ? e7Var.f19328e != null : !set.equals(e7Var.f19328e)) {
            return false;
        }
        Map map = this.f19329f;
        Map map2 = e7Var.f19329f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        int i = ((this.f19324a * 31) + this.f19325b) * 31;
        Uri uri = this.f19326c;
        int iHashCode = (i + (uri != null ? uri.hashCode() : 0)) * 31;
        j7 j7Var = this.f19327d;
        int iHashCode2 = (iHashCode + (j7Var != null ? j7Var.hashCode() : 0)) * 31;
        Set set = this.f19328e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f19329f;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f19324a + ", height=" + this.f19325b + ", destinationUri=" + this.f19326c + ", nonVideoResource=" + this.f19327d + ", clickTrackers=" + this.f19328e + ", eventTrackers=" + this.f19329f + '}';
    }

    public static e7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        int i = JsonUtils.getInt(jSONObject, "width", 0);
        int i10 = JsonUtils.getInt(jSONObject, "height", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        Uri uri = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        j7 j7VarA = j7.a(JsonUtils.getJSONObject(jSONObject, "non_video_resource", (JSONObject) null), kVar);
        JSONArray jSONArrayQ = H7.q("click_trackers", jSONObject);
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < jSONArrayQ.length(); i11++) {
            l7 l7VarA = l7.a(JsonUtils.getJSONObject(jSONArrayQ, i11, (JSONObject) null), kVar);
            if (l7VarA != null) {
                hashSet.add(l7VarA);
            }
        }
        e7 e7Var = new e7();
        e7Var.f19324a = i;
        e7Var.f19325b = i10;
        e7Var.f19326c = uri;
        e7Var.f19327d = j7VarA;
        e7Var.f19328e.addAll(hashSet);
        return e7Var;
    }

    @Override // com.applovin.impl.d4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "width", this.f19324a);
        JsonUtils.putInt(jSONObject, "height", this.f19325b);
        Uri uri = this.f19326c;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        j7 j7Var = this.f19327d;
        JsonUtils.putJSONObject(jSONObject, "non_video_resource", j7Var != null ? j7Var.a() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f19328e.iterator();
        while (it.hasNext()) {
            jSONArray.put(((l7) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        return jSONObject;
    }
}
