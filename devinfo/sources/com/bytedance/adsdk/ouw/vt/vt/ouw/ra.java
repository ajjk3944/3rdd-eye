package com.bytedance.adsdk.ouw.vt.vt.ouw;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra implements com.bytedance.adsdk.ouw.vt.vt.ouw {
    private final Object ouw;

    public ra(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.ouw = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.ouw = Boolean.FALSE;
        } else {
            if (!str.equalsIgnoreCase("null")) {
                throw new IllegalArgumentException();
            }
            this.ouw = null;
        }
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        return this.ouw;
    }

    public final String toString() {
        return "KeywordNode [keywordValue=" + this.ouw + "]";
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final String vt() {
        Object obj = this.ouw;
        return obj != null ? obj.toString() : "NULL";
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final com.bytedance.adsdk.ouw.vt.yu.fkw ouw() {
        return com.bytedance.adsdk.ouw.vt.yu.le.CONSTANT;
    }
}
