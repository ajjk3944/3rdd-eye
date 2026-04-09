package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ycc {
    public static final ycc emc = new ycc(null);
    public static String ypw = "";
    public boolean bw;
    public boolean dg;
    public String xq;
    public boolean ycc;

    public ycc(String str) {
        this.xq = "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js";
        this.dg = true;
        this.bw = true;
        this.ycc = true;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("performance_js");
            String strOptString = jSONObjectOptJSONObject.optString("url", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js");
            if (!TextUtils.isEmpty(strOptString)) {
                this.xq = strOptString;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i));
            }
            this.dg = arrayList.contains("load_finish");
            this.ycc = arrayList.contains("load_fail");
            this.bw = arrayList.contains("load");
        } catch (Exception unused) {
        }
    }
}
