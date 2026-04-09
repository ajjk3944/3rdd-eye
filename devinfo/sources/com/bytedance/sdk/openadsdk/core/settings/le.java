package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le {
    public static final le ouw = new le(null);
    public static String vt = "";
    public boolean fkw;

    /* renamed from: le, reason: collision with root package name */
    public boolean f8444le;

    /* renamed from: lh, reason: collision with root package name */
    public String f8445lh;
    public boolean yu;

    public le(String str) {
        this.f8445lh = "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js";
        this.yu = true;
        this.fkw = true;
        this.f8444le = true;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("performance_js");
            String strOptString = jSONObjectOptJSONObject.optString("url", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js");
            if (!TextUtils.isEmpty(strOptString)) {
                this.f8445lh = strOptString;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i4));
            }
            this.yu = arrayList.contains("load_finish");
            this.f8444le = arrayList.contains("load_fail");
            this.fkw = arrayList.contains("load");
        } catch (Exception unused) {
        }
    }
}
