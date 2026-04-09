package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class q7 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private final List f7388a;

    private q7(List list) {
        this.f7388a = list;
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
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastAdVerifications", "Error occurred while initializing", th);
            }
            kVar.D().a("VastAdVerifications", th);
            return null;
        }
    }

    public List b() {
        return this.f7388a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q7) {
            return this.f7388a.equals(((q7) obj).f7388a);
        }
        return false;
    }

    public int hashCode() {
        return this.f7388a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.f7388a + "'}";
    }

    public static q7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "verifications", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            p7 p7VarA = p7.a(JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), kVar);
            if (p7VarA != null) {
                arrayList.add(p7VarA);
            }
        }
        return new q7(arrayList);
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (this.f7388a != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f7388a.iterator();
            while (it.hasNext()) {
                jSONArray.put(((p7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "verifications", jSONArray);
        }
        return jSONObject;
    }
}
