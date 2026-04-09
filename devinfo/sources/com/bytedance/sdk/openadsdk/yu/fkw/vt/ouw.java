package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bytedance.sdk.openadsdk.core.model.vpp;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    private JSONObject fkw;

    /* renamed from: le, reason: collision with root package name */
    private JSONObject f8767le;

    /* renamed from: lh, reason: collision with root package name */
    public lh f8768lh;
    public vpp ouw;
    public String vt;
    public boolean yu = false;

    public ouw(vpp vppVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.ouw = vppVar;
        this.vt = str;
        this.fkw = jSONObject;
        this.f8767le = jSONObject2;
    }

    public final JSONObject ouw() {
        if (this.fkw == null) {
            this.fkw = new JSONObject();
        }
        return this.fkw;
    }

    public final JSONObject vt() {
        if (this.f8767le == null) {
            this.f8767le = new JSONObject();
        }
        return this.f8767le;
    }
}
