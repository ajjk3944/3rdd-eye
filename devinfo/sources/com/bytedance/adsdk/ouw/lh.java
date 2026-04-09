package com.bytedance.adsdk.ouw;

import com.bytedance.adsdk.ugeno.lh.ouw;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh implements com.bytedance.adsdk.ugeno.lh.ouw {

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw implements ouw.InterfaceC0032ouw {
        private com.bytedance.adsdk.ouw.vt.ouw ouw;
        private String vt;

        public ouw(String str) {
            this.vt = str;
            this.ouw = com.bytedance.adsdk.ouw.vt.ouw.ouw(str);
        }

        @Override // com.bytedance.adsdk.ugeno.lh.ouw.InterfaceC0032ouw
        public final Object ouw(JSONObject jSONObject) {
            com.bytedance.adsdk.ouw.vt.ouw ouwVar = this.ouw;
            if (ouwVar == null) {
                return this.vt;
            }
            Object objOuw = ouwVar.ouw(jSONObject);
            if (objOuw instanceof String) {
                return objOuw;
            }
            if (objOuw instanceof com.bytedance.adsdk.ouw.vt.ouw.ouw) {
                com.bytedance.adsdk.ouw.vt.ouw.ouw ouwVar2 = (com.bytedance.adsdk.ouw.vt.ouw.ouw) objOuw;
                bly blyVarOuw = rn.ouw(ouwVar2.ouw);
                return String.valueOf(blyVarOuw != null ? blyVarOuw.ouw(null, ouwVar2.vt) : null);
            }
            if (objOuw == null || !objOuw.getClass().isArray()) {
                return String.valueOf(objOuw);
            }
            try {
                return new JSONArray(objOuw).toString();
            } catch (JSONException unused) {
                return String.valueOf(objOuw);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lh.ouw
    public final ouw.InterfaceC0032ouw ouw(String str) {
        return new ouw(str);
    }
}
