package com.applovin.impl;

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
public class r7 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private int f7502a;

    /* renamed from: b, reason: collision with root package name */
    private int f7503b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f7504c;

    /* renamed from: d, reason: collision with root package name */
    private w7 f7505d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f7506e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Map f7507f = new HashMap();

    private r7() {
    }

    public static r7 a(p8 p8Var, r7 r7Var, s7 s7Var, com.applovin.impl.sdk.k kVar) {
        p8 p8VarC;
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (r7Var == null) {
            try {
                r7Var = new r7();
            } catch (Throwable th) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastCompanionAd", "Error occurred while initializing", th);
                }
                kVar.D().a("VastCompanionAd", th);
                return null;
            }
        }
        if (r7Var.f7502a == 0 && r7Var.f7503b == 0) {
            int i10 = StringUtils.parseInt((String) p8Var.a().get("width"));
            int i11 = StringUtils.parseInt((String) p8Var.a().get("height"));
            if (i10 > 0 && i11 > 0) {
                r7Var.f7502a = i10;
                r7Var.f7503b = i11;
            }
        }
        r7Var.f7505d = w7.a(p8Var, r7Var.f7505d, kVar);
        if (r7Var.f7504c == null && (p8VarC = p8Var.c("CompanionClickThrough")) != null) {
            String strD = p8VarC.d();
            if (StringUtils.isValidString(strD)) {
                r7Var.f7504c = Uri.parse(strD);
            }
        }
        a8.a(p8Var.a("CompanionClickTracking"), r7Var.f7506e, s7Var, kVar);
        a8.a(p8Var, r7Var.f7507f, s7Var, kVar);
        return r7Var;
    }

    public Set b() {
        return this.f7506e;
    }

    public Uri c() {
        return this.f7504c;
    }

    public Map d() {
        return this.f7507f;
    }

    public w7 e() {
        return this.f7505d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7)) {
            return false;
        }
        r7 r7Var = (r7) obj;
        if (this.f7502a != r7Var.f7502a || this.f7503b != r7Var.f7503b) {
            return false;
        }
        Uri uri = this.f7504c;
        if (uri == null ? r7Var.f7504c != null : !uri.equals(r7Var.f7504c)) {
            return false;
        }
        w7 w7Var = this.f7505d;
        if (w7Var == null ? r7Var.f7505d != null : !w7Var.equals(r7Var.f7505d)) {
            return false;
        }
        Set set = this.f7506e;
        if (set == null ? r7Var.f7506e != null : !set.equals(r7Var.f7506e)) {
            return false;
        }
        Map map = this.f7507f;
        Map map2 = r7Var.f7507f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        int i10 = ((this.f7502a * 31) + this.f7503b) * 31;
        Uri uri = this.f7504c;
        int iHashCode = (i10 + (uri != null ? uri.hashCode() : 0)) * 31;
        w7 w7Var = this.f7505d;
        int iHashCode2 = (iHashCode + (w7Var != null ? w7Var.hashCode() : 0)) * 31;
        Set set = this.f7506e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f7507f;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f7502a + ", height=" + this.f7503b + ", destinationUri=" + this.f7504c + ", nonVideoResource=" + this.f7505d + ", clickTrackers=" + this.f7506e + ", eventTrackers=" + this.f7507f + '}';
    }

    public static r7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        int i10 = JsonUtils.getInt(jSONObject, "width", 0);
        int i11 = JsonUtils.getInt(jSONObject, "height", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        Uri uri = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        w7 w7VarA = w7.a(JsonUtils.getJSONObject(jSONObject, "non_video_resource", (JSONObject) null), kVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            y7 y7VarA = y7.a(JsonUtils.getJSONObject(jSONArray, i12, (JSONObject) null), kVar);
            if (y7VarA != null) {
                hashSet.add(y7VarA);
            }
        }
        r7 r7Var = new r7();
        r7Var.f7502a = i10;
        r7Var.f7503b = i11;
        r7Var.f7504c = uri;
        r7Var.f7505d = w7VarA;
        r7Var.f7506e.addAll(hashSet);
        return r7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "width", this.f7502a);
        JsonUtils.putInt(jSONObject, "height", this.f7503b);
        Uri uri = this.f7504c;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        w7 w7Var = this.f7505d;
        JsonUtils.putJSONObject(jSONObject, "non_video_resource", w7Var != null ? w7Var.a() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f7506e.iterator();
        while (it.hasNext()) {
            jSONArray.put(((y7) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        return jSONObject;
    }
}
