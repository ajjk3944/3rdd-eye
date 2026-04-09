package com.applovin.impl;

import N7.H7;
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
public class c7 implements d4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f19173a;

    /* renamed from: b, reason: collision with root package name */
    private final List f19174b;

    /* renamed from: c, reason: collision with root package name */
    private final String f19175c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f19176d;

    private c7(String str, List list, String str2, Set set) {
        this.f19173a = str;
        this.f19174b = list;
        this.f19175c = str2;
        this.f19176d = set;
    }

    public static c7 a(c8 c8Var, f7 f7Var, com.applovin.impl.sdk.k kVar) {
        try {
            String str = (String) c8Var.a().get("vendor");
            c8 c8VarB = c8Var.b("VerificationParameters");
            String strD = c8VarB != null ? c8VarB.d() : null;
            List listA = c8Var.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(listA.size());
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                i7 i7VarA = i7.a((c8) it.next(), kVar);
                if (i7VarA != null) {
                    arrayList.add(i7VarA);
                }
            }
            HashMap map = new HashMap();
            n7.a(c8Var, map, f7Var, kVar);
            return new c7(str, arrayList, strD, (Set) map.get("verificationNotExecuted"));
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastAdVerification", "Error occurred while initializing", th);
            }
            kVar.E().a("VastAdVerification", th);
            return null;
        }
    }

    public Set b() {
        return this.f19176d;
    }

    public List c() {
        return this.f19174b;
    }

    public String d() {
        return this.f19173a;
    }

    public String e() {
        return this.f19175c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c7 c7Var = (c7) obj;
            String str = this.f19173a;
            if (str == null ? c7Var.f19173a != null : !str.equals(c7Var.f19173a)) {
                return false;
            }
            List list = this.f19174b;
            if (list == null ? c7Var.f19174b != null : !list.equals(c7Var.f19174b)) {
                return false;
            }
            String str2 = this.f19175c;
            if (str2 == null ? c7Var.f19175c != null : !str2.equals(c7Var.f19175c)) {
                return false;
            }
            Set set = this.f19176d;
            Set set2 = c7Var.f19176d;
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
        String str = this.f19173a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f19174b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f19175c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set set = this.f19176d;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f19173a + "'javascriptResources='" + this.f19174b + "'verificationParameters='" + this.f19175c + "'errorEventTrackers='" + this.f19176d + "'}";
    }

    public static c7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "vendor_id", null);
        JSONArray jSONArrayQ = H7.q("javascript_resources", jSONObject);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayQ.length(); i++) {
            i7 i7VarA = i7.a(JsonUtils.getJSONObject(jSONArrayQ, i, (JSONObject) null), kVar);
            if (i7VarA != null) {
                arrayList.add(i7VarA);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "verification_parameters", null);
        JSONArray jSONArrayQ2 = H7.q("error_event_trackers", jSONObject);
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArrayQ2.length(); i10++) {
            l7 l7VarA = l7.a(JsonUtils.getJSONObject(jSONArrayQ2, i10, (JSONObject) null), kVar);
            if (l7VarA != null) {
                hashSet.add(l7VarA);
            }
        }
        return new c7(string, arrayList, string2, hashSet);
    }

    @Override // com.applovin.impl.d4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "vendor_id", this.f19173a);
        if (this.f19174b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f19174b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((i7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "javascript_resources", jSONArray);
        }
        JsonUtils.putString(jSONObject, "verification_parameters", this.f19175c);
        if (this.f19176d != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f19176d.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((l7) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_event_trackers", jSONArray2);
        }
        return jSONObject;
    }
}
