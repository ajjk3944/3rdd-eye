package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw {

    /* renamed from: lh, reason: collision with root package name */
    public static boolean f8696lh;
    public static WeakReference<com.bytedance.sdk.openadsdk.core.model.vpp> ouw;
    static long vt;

    public static void ouw(final long j) {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.model.vpp> weakReference = ouw;
        if (weakReference == null || j <= 0 || (vppVar = weakReference.get()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, vppVar.vt(), "store_duration", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.utils.fkw.1
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
        ouw = null;
        f8696lh = false;
    }

    public static void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        com.bytedance.sdk.openadsdk.core.model.le leVar = vppVar.wp;
        if (leVar == null || TextUtils.isEmpty(leVar.ouw)) {
            return;
        }
        ouw = new WeakReference<>(vppVar);
    }
}
