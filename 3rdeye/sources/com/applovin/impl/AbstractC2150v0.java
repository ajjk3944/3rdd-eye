package com.applovin.impl;

import N7.H7;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2150v0 {
    public static List a(com.applovin.impl.sdk.k kVar) {
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().a("ConsentFlowStateProvider", "Generating consent flow states...");
        }
        String strA = a7.a(R.raw.applovin_consent_flow_unified_cmp, com.applovin.impl.sdk.k.o(), kVar);
        if (TextUtils.isEmpty(strA)) {
            throw new IllegalStateException("Unable to retrieve consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(strA, null);
        if (jSONObjectJsonObjectFromJsonString == null) {
            throw new IllegalStateException("Unable to parse consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        JSONArray jSONArrayQ = H7.q("states", jSONObjectJsonObjectFromJsonString);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayQ.length(); i++) {
            arrayList.add(C2141q0.a(JsonUtils.getJSONObject(jSONArrayQ, i, new JSONObject()), kVar));
        }
        return arrayList;
    }
}
