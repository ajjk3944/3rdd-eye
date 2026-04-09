package com.bytedance.sdk.openadsdk.ryl.ouw;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class mwh extends com.bytedance.sdk.component.ouw.yu<JSONObject, JSONObject> {

    /* renamed from: lh, reason: collision with root package name */
    private WeakReference<com.bytedance.sdk.component.bly.le> f8651lh;

    public mwh(com.bytedance.sdk.component.bly.le leVar) {
        this.f8651lh = new WeakReference<>(leVar);
    }

    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* bridge */ /* synthetic */ JSONObject ouw(String str, JSONObject jSONObject) throws Exception {
        return ouw(jSONObject);
    }

    private JSONObject ouw(JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isPrevent", false);
            com.bytedance.sdk.component.bly.le leVar = this.f8651lh.get();
            if (leVar == null) {
                jSONObject2.put("success", false);
                return jSONObject2;
            }
            leVar.setIsPreventTouchEvent(zOptBoolean);
            jSONObject2.put("success", true);
            return jSONObject2;
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
            return jSONObject2;
        }
    }
}
