package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tc {

    /* renamed from: lh, reason: collision with root package name */
    int f8262lh;
    public int ouw;
    int vt;
    public String yu = "Next Ad";

    public static tc ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        tc tcVar = new tc();
        try {
            int iMax = Math.max(jSONObject.optInt("endcard_show_time", 0), 0);
            int iOptInt = jSONObject.optInt("is_allow_pause", 0);
            int iOptInt2 = jSONObject.optInt("landing_type", 0);
            String strOptString = jSONObject.optString("endcard_next_ad_text", "Next Ad");
            tcVar.ouw = iMax;
            tcVar.vt = iOptInt;
            tcVar.yu = strOptString;
            tcVar.f8262lh = iOptInt2;
        } catch (Throwable unused) {
        }
        return tcVar;
    }

    public final JSONObject ouw() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i4 = this.ouw;
            if (i4 != -1) {
                jSONObject.put("endcard_show_time", i4);
            }
            jSONObject.put("is_allow_pause", this.vt);
            jSONObject.put("landing_type", this.f8262lh);
            if (!TextUtils.isEmpty(this.yu)) {
                jSONObject.put("endcard_next_ad_text", this.yu);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }
}
