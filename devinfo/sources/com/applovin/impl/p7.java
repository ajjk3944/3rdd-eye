package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class p7 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f5076a;

    /* renamed from: b, reason: collision with root package name */
    private final List f5077b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5078c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f5079d;

    private p7(String str, List list, String str2, Set set) {
        this.f5076a = str;
        this.f5077b = list;
        this.f5078c = str2;
        this.f5079d = set;
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
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastAdVerification", "Error occurred while initializing", th2);
            }
            kVar.D().a("VastAdVerification", th2);
            return null;
        }
    }

    public Set b() {
        return this.f5079d;
    }

    public List c() {
        return this.f5077b;
    }

    public String d() {
        return this.f5076a;
    }

    public String e() {
        return this.f5078c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            p7 p7Var = (p7) obj;
            String str = this.f5076a;
            if (str == null ? p7Var.f5076a != null : !str.equals(p7Var.f5076a)) {
                return false;
            }
            List list = this.f5077b;
            if (list == null ? p7Var.f5077b != null : !list.equals(p7Var.f5077b)) {
                return false;
            }
            String str2 = this.f5078c;
            if (str2 == null ? p7Var.f5078c != null : !str2.equals(p7Var.f5078c)) {
                return false;
            }
            Set set = this.f5079d;
            Set set2 = p7Var.f5079d;
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
        String str = this.f5076a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f5077b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f5078c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set set = this.f5079d;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f5076a + "'javascriptResources='" + this.f5077b + "'verificationParameters='" + this.f5078c + "'errorEventTrackers='" + this.f5079d + "'}";
    }

    public static p7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "vendor_id", null);
        JSONArray jSONArrayS = a0.g.s("javascript_resources", jSONObject);
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArrayS.length(); i4++) {
            v7 v7VarA = v7.a(JsonUtils.getJSONObject(jSONArrayS, i4, (JSONObject) null), kVar);
            if (v7VarA != null) {
                arrayList.add(v7VarA);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "verification_parameters", null);
        JSONArray jSONArrayS2 = a0.g.s("error_event_trackers", jSONObject);
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArrayS2.length(); i10++) {
            y7 y7VarA = y7.a(JsonUtils.getJSONObject(jSONArrayS2, i10, (JSONObject) null), kVar);
            if (y7VarA != null) {
                hashSet.add(y7VarA);
            }
        }
        return new p7(string, arrayList, string2, hashSet);
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "vendor_id", this.f5076a);
        if (this.f5077b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f5077b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((v7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "javascript_resources", jSONArray);
        }
        JsonUtils.putString(jSONObject, "verification_parameters", this.f5078c);
        if (this.f5079d != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f5079d.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((y7) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_event_trackers", jSONArray2);
        }
        return jSONObject;
    }
}
