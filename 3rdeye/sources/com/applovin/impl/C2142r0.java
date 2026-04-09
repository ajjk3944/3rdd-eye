package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.github.appintro.AppIntroBaseFragmentKt;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2142r0 extends C2141q0 {
    public C2142r0(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        super(jSONObject, kVar);
    }

    public List d() {
        C2144s0 c2144s0A;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f20733b, "transitions", null);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject != null && (c2144s0A = C2144s0.a(jSONObject, this.f20732a)) != null) {
                arrayList.add(c2144s0A);
            }
        }
        return arrayList;
    }

    public String e() {
        return b("message");
    }

    public String f() {
        return b(AppIntroBaseFragmentKt.ARG_TITLE);
    }

    @Override // com.applovin.impl.C2141q0
    public String toString() {
        return "ConsentFlowState{id=" + b() + ", type=" + c() + ", title=" + f() + ", message=" + e() + ", actions=" + d() + "}";
    }
}
