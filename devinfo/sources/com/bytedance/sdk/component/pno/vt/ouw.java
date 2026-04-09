package com.bytedance.sdk.component.pno.vt;

import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {

    /* renamed from: lh, reason: collision with root package name */
    public int f7619lh;
    public int ouw;
    public int vt;
    public int yu;

    public ouw(int i4, int i10, int i11, int i12) {
        this.ouw = i4;
        this.vt = i10;
        this.f7619lh = i11;
        this.yu = i12;
    }

    public final JSONObject ouw() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.ouw);
            jSONObject.put("sdk_max_thread_num", this.vt);
            jSONObject.put("app_thread_num", this.f7619lh);
            jSONObject.put("app_max_thread_num", this.yu);
            return jSONObject;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return jSONObject;
        }
    }
}
