package com.bytedance.sdk.component.ouw;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class mwh {
    private final Map<String, Object> ouw = new ConcurrentHashMap();

    public final mwh ouw(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.ouw.put(str, obj);
        }
        return this;
    }

    public final String ouw() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.ouw.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
