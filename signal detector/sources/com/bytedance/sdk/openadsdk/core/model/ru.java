package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ru {
    private String emc;
    private List<String> ypw;

    public ru(String str) {
        this.emc = "";
        this.ypw = new ArrayList();
        HashMap<String, Object> map = TextUtils.isEmpty(str) ? new HashMap<>() : emc(str);
        try {
            this.emc = (String) map.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) map.get("auto_test_hosts"));
            this.ypw = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.ypw.add(jSONArray.optString(i));
            }
        } catch (Exception e6) {
            com.bytedance.sdk.component.utils.ul.xq("AutoTestModel", e6.getMessage());
        }
    }

    public String emc() {
        return this.emc;
    }

    public List<String> ypw() {
        return this.ypw;
    }

    private static final HashMap<String, Object> emc(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> map = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                map.put(jSONObjectOptJSONObject.optString("name"), jSONObjectOptJSONObject.optString("value"));
            }
            return map;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }
}
