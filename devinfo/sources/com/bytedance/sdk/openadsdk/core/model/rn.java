package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class rn {
    public ouw ouw;
    public ouw vt;

    public rn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("easy_playable");
        if (jSONObjectOptJSONObject != null) {
            this.ouw = new ouw(jSONObjectOptJSONObject.optJSONObject("components"));
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("popup");
        if (jSONObjectOptJSONObject2 != null) {
            this.vt = new ouw(jSONObjectOptJSONObject2.optJSONObject("components"));
        }
    }

    public static boolean ouw(vpp vppVar, boolean z3) {
        rn rnVar;
        if (vppVar == null || (rnVar = vppVar.f8289ak) == null) {
            return false;
        }
        if (z3) {
            ouw ouwVar = rnVar.vt;
            return ouwVar != null && ouwVar.ouw();
        }
        ouw ouwVar2 = rnVar.ouw;
        return ouwVar2 != null && ouwVar2.ouw();
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        C0088ouw ouw;
        C0088ouw vt;

        /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
        /* renamed from: com.bytedance.sdk.openadsdk.core.model.rn$ouw$ouw, reason: collision with other inner class name */
        public static class C0088ouw {
            String ouw;

            public C0088ouw(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return;
                }
                this.ouw = jSONObject.optString("entry");
            }

            public final boolean ouw() {
                return !TextUtils.isEmpty(this.ouw);
            }
        }

        public ouw(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            if (jSONObject.has("vertical")) {
                this.ouw = new C0088ouw(jSONObject.optJSONObject("vertical"));
            }
            if (jSONObject.has("horizontal")) {
                this.vt = new C0088ouw(jSONObject.optJSONObject("horizontal"));
            }
        }

        public final boolean ouw() {
            C0088ouw c0088ouw = this.vt;
            if (c0088ouw != null && c0088ouw.ouw()) {
                return true;
            }
            C0088ouw c0088ouw2 = this.ouw;
            return c0088ouw2 != null && c0088ouw2.ouw();
        }

        public final String ouw(boolean z3) {
            if (z3) {
                C0088ouw c0088ouw = this.ouw;
                if (c0088ouw != null) {
                    return c0088ouw.ouw;
                }
                return "";
            }
            C0088ouw c0088ouw2 = this.vt;
            if (c0088ouw2 != null) {
                return c0088ouw2.ouw;
            }
            return "";
        }
    }
}
