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
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class r7 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private int f5258a;

    /* renamed from: b, reason: collision with root package name */
    private int f5259b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f5260c;

    /* renamed from: d, reason: collision with root package name */
    private w7 f5261d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f5262e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Map f5263f = new HashMap();

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
            } catch (Throwable th2) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastCompanionAd", "Error occurred while initializing", th2);
                }
                kVar.D().a("VastCompanionAd", th2);
                return null;
            }
        }
        if (r7Var.f5258a == 0 && r7Var.f5259b == 0) {
            int i4 = StringUtils.parseInt((String) p8Var.a().get("width"));
            int i10 = StringUtils.parseInt((String) p8Var.a().get("height"));
            if (i4 > 0 && i10 > 0) {
                r7Var.f5258a = i4;
                r7Var.f5259b = i10;
            }
        }
        r7Var.f5261d = w7.a(p8Var, r7Var.f5261d, kVar);
        if (r7Var.f5260c == null && (p8VarC = p8Var.c("CompanionClickThrough")) != null) {
            String strD = p8VarC.d();
            if (StringUtils.isValidString(strD)) {
                r7Var.f5260c = Uri.parse(strD);
            }
        }
        a8.a(p8Var.a("CompanionClickTracking"), r7Var.f5262e, s7Var, kVar);
        a8.a(p8Var, r7Var.f5263f, s7Var, kVar);
        return r7Var;
    }

    public Set b() {
        return this.f5262e;
    }

    public Uri c() {
        return this.f5260c;
    }

    public Map d() {
        return this.f5263f;
    }

    public w7 e() {
        return this.f5261d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7)) {
            return false;
        }
        r7 r7Var = (r7) obj;
        if (this.f5258a != r7Var.f5258a || this.f5259b != r7Var.f5259b) {
            return false;
        }
        Uri uri = this.f5260c;
        if (uri == null ? r7Var.f5260c != null : !uri.equals(r7Var.f5260c)) {
            return false;
        }
        w7 w7Var = this.f5261d;
        if (w7Var == null ? r7Var.f5261d != null : !w7Var.equals(r7Var.f5261d)) {
            return false;
        }
        Set set = this.f5262e;
        if (set == null ? r7Var.f5262e != null : !set.equals(r7Var.f5262e)) {
            return false;
        }
        Map map = this.f5263f;
        Map map2 = r7Var.f5263f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        int i4 = ((this.f5258a * 31) + this.f5259b) * 31;
        Uri uri = this.f5260c;
        int iHashCode = (i4 + (uri != null ? uri.hashCode() : 0)) * 31;
        w7 w7Var = this.f5261d;
        int iHashCode2 = (iHashCode + (w7Var != null ? w7Var.hashCode() : 0)) * 31;
        Set set = this.f5262e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f5263f;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f5258a + ", height=" + this.f5259b + ", destinationUri=" + this.f5260c + ", nonVideoResource=" + this.f5261d + ", clickTrackers=" + this.f5262e + ", eventTrackers=" + this.f5263f + '}';
    }

    public static r7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        int i4 = JsonUtils.getInt(jSONObject, "width", 0);
        int i10 = JsonUtils.getInt(jSONObject, "height", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        Uri uri = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        w7 w7VarA = w7.a(JsonUtils.getJSONObject(jSONObject, "non_video_resource", (JSONObject) null), kVar);
        JSONArray jSONArrayS = a0.g.s("click_trackers", jSONObject);
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < jSONArrayS.length(); i11++) {
            y7 y7VarA = y7.a(JsonUtils.getJSONObject(jSONArrayS, i11, (JSONObject) null), kVar);
            if (y7VarA != null) {
                hashSet.add(y7VarA);
            }
        }
        r7 r7Var = new r7();
        r7Var.f5258a = i4;
        r7Var.f5259b = i10;
        r7Var.f5260c = uri;
        r7Var.f5261d = w7VarA;
        r7Var.f5262e.addAll(hashSet);
        return r7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "width", this.f5258a);
        JsonUtils.putInt(jSONObject, "height", this.f5259b);
        Uri uri = this.f5260c;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        w7 w7Var = this.f5261d;
        JsonUtils.putJSONObject(jSONObject, "non_video_resource", w7Var != null ? w7Var.a() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f5262e.iterator();
        while (it.hasNext()) {
            jSONArray.put(((y7) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        return jSONObject;
    }
}
