package com.bytedance.sdk.component.emc;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sz {
    private final Map<String, Object> emc = new ConcurrentHashMap();

    private sz() {
    }

    public static sz emc() {
        return new sz();
    }

    public String ypw() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.emc.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public sz emc(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.emc.put(str, obj);
        }
        return this;
    }
}
