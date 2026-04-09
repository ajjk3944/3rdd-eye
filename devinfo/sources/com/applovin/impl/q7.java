package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class q7 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private final List f5169a;

    private q7(List list) {
        this.f5169a = list;
    }

    public static q7 a(p8 p8Var, q7 q7Var, s7 s7Var, com.applovin.impl.sdk.k kVar) {
        try {
            List listB = q7Var != null ? q7Var.b() : new ArrayList();
            Iterator it = p8Var.a("Verification").iterator();
            while (it.hasNext()) {
                p7 p7VarA = p7.a((p8) it.next(), s7Var, kVar);
                if (p7VarA != null) {
                    listB.add(p7VarA);
                }
            }
            return new q7(listB);
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastAdVerifications", "Error occurred while initializing", th2);
            }
            kVar.D().a("VastAdVerifications", th2);
            return null;
        }
    }

    public List b() {
        return this.f5169a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q7) {
            return this.f5169a.equals(((q7) obj).f5169a);
        }
        return false;
    }

    public int hashCode() {
        return this.f5169a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.f5169a + "'}";
    }

    public static q7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArrayS = a0.g.s("verifications", jSONObject);
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArrayS.length(); i4++) {
            p7 p7VarA = p7.a(JsonUtils.getJSONObject(jSONArrayS, i4, (JSONObject) null), kVar);
            if (p7VarA != null) {
                arrayList.add(p7VarA);
            }
        }
        return new q7(arrayList);
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        if (this.f5169a != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f5169a.iterator();
            while (it.hasNext()) {
                jSONArray.put(((p7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "verifications", jSONArray);
        }
        return jSONObject;
    }
}
