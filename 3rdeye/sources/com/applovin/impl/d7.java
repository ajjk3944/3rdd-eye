package com.applovin.impl;

import N7.C1094a9;
import N7.H7;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d7 implements d4 {

    /* renamed from: a, reason: collision with root package name */
    private final List f19229a;

    private d7(List list) {
        this.f19229a = list;
    }

    public static d7 a(c8 c8Var, d7 d7Var, f7 f7Var, com.applovin.impl.sdk.k kVar) {
        try {
            List listB = d7Var != null ? d7Var.b() : new ArrayList();
            Iterator it = c8Var.a("Verification").iterator();
            while (it.hasNext()) {
                c7 c7VarA = c7.a((c8) it.next(), f7Var, kVar);
                if (c7VarA != null) {
                    listB.add(c7VarA);
                }
            }
            return new d7(listB);
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastAdVerifications", "Error occurred while initializing", th);
            }
            kVar.E().a("VastAdVerifications", th);
            return null;
        }
    }

    public List b() {
        return this.f19229a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d7) {
            return this.f19229a.equals(((d7) obj).f19229a);
        }
        return false;
    }

    public int hashCode() {
        return this.f19229a.hashCode();
    }

    public String toString() {
        return C1094a9.h(new StringBuilder("VastAdVerification{verifications='"), this.f19229a, "'}");
    }

    public static d7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArrayQ = H7.q("verifications", jSONObject);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayQ.length(); i++) {
            c7 c7VarA = c7.a(JsonUtils.getJSONObject(jSONArrayQ, i, (JSONObject) null), kVar);
            if (c7VarA != null) {
                arrayList.add(c7VarA);
            }
        }
        return new d7(arrayList);
    }

    @Override // com.applovin.impl.d4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (this.f19229a != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f19229a.iterator();
            while (it.hasNext()) {
                jSONArray.put(((c7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "verifications", jSONArray);
        }
        return jSONObject;
    }
}
