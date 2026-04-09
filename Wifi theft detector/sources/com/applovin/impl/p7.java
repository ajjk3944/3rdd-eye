package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p7 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f7260a;

    /* renamed from: b, reason: collision with root package name */
    private final List f7261b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7262c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f7263d;

    private p7(String str, List list, String str2, Set set) {
        this.f7260a = str;
        this.f7261b = list;
        this.f7262c = str2;
        this.f7263d = set;
    }

    public static p7 a(p8 p8Var, s7 s7Var, com.applovin.impl.sdk.k kVar) {
        try {
            String str = (String) p8Var.a().get("vendor");
            p8 p8VarB = p8Var.b("VerificationParameters");
            String strD = p8VarB != null ? p8VarB.d() : null;
            List listA = p8Var.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(listA.size());
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                v7 v7VarA = v7.a((p8) it.next(), kVar);
                if (v7VarA != null) {
                    arrayList.add(v7VarA);
                }
            }
            HashMap map = new HashMap();
            a8.a(p8Var, map, s7Var, kVar);
            return new p7(str, arrayList, strD, (Set) map.get("verificationNotExecuted"));
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastAdVerification", "Error occurred while initializing", th);
            }
            kVar.D().a("VastAdVerification", th);
            return null;
        }
    }

    public Set b() {
        return this.f7263d;
    }

    public List c() {
        return this.f7261b;
    }

    public String d() {
        return this.f7260a;
    }

    public String e() {
        return this.f7262c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            p7 p7Var = (p7) obj;
            String str = this.f7260a;
            if (str == null ? p7Var.f7260a != null : !str.equals(p7Var.f7260a)) {
                return false;
            }
            List list = this.f7261b;
            if (list == null ? p7Var.f7261b != null : !list.equals(p7Var.f7261b)) {
                return false;
            }
            String str2 = this.f7262c;
            if (str2 == null ? p7Var.f7262c != null : !str2.equals(p7Var.f7262c)) {
                return false;
            }
            Set set = this.f7263d;
            Set set2 = p7Var.f7263d;
            if (set != null) {
                return set.equals(set2);
            }
            if (set2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f7260a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f7261b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f7262c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set set = this.f7263d;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f7260a + "'javascriptResources='" + this.f7261b + "'verificationParameters='" + this.f7262c + "'errorEventTrackers='" + this.f7263d + "'}";
    }

    public static p7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "vendor_id", null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "javascript_resources", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            v7 v7VarA = v7.a(JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), kVar);
            if (v7VarA != null) {
                arrayList.add(v7VarA);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "verification_parameters", null);
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_event_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            y7 y7VarA = y7.a(JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null), kVar);
            if (y7VarA != null) {
                hashSet.add(y7VarA);
            }
        }
        return new p7(string, arrayList, string2, hashSet);
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "vendor_id", this.f7260a);
        if (this.f7261b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f7261b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((v7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "javascript_resources", jSONArray);
        }
        JsonUtils.putString(jSONObject, "verification_parameters", this.f7262c);
        if (this.f7263d != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f7263d.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((y7) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_event_trackers", jSONArray2);
        }
        return jSONObject;
    }
}
