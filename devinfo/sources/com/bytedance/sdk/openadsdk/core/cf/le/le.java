package com.bytedance.sdk.openadsdk.core.cf.le;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le {
    private final String ouw = "UGenV3OpenLinks";
    private final String vt = "landingStyle";

    /* renamed from: lh, reason: collision with root package name */
    private final String f8124lh = "url";
    private final String yu = "fallbackUrl";

    public static JSONObject ouw(Map<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }
}
