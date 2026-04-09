package com.bytedance.adsdk.ouw.vt.vt.ouw;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class th implements com.bytedance.adsdk.ouw.vt.vt.vt {

    /* renamed from: lh, reason: collision with root package name */
    private com.bytedance.adsdk.ouw.vt.vt.ouw f6813lh;
    private com.bytedance.adsdk.ouw.vt.vt.ouw ouw;
    private com.bytedance.adsdk.ouw.vt.vt.ouw vt;

    @Override // com.bytedance.adsdk.ouw.vt.vt.vt
    public final void lh(com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar) {
        this.f6813lh = ouwVar;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        Object objOuw = this.ouw.ouw(map);
        if (objOuw == null) {
            return null;
        }
        return ((Boolean) objOuw).booleanValue() ? this.vt.ouw(map) : this.f6813lh.ouw(map);
    }

    public final String toString() {
        return vt();
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.vt
    public final void vt(com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar) {
        this.vt = ouwVar;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final String vt() {
        return this.ouw.vt() + "?" + this.vt.vt() + ":" + this.f6813lh.vt();
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final com.bytedance.adsdk.ouw.vt.yu.fkw ouw() {
        return com.bytedance.adsdk.ouw.vt.yu.le.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.vt
    public final void ouw(com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar) {
        this.ouw = ouwVar;
    }
}
