package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bytedance.sdk.component.utils.qbp;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tlj extends lh {
    public String fkw;

    /* renamed from: le, reason: collision with root package name */
    public String f8771le;

    /* renamed from: lh, reason: collision with root package name */
    public long f8772lh;
    public String ouw;
    public long vt;
    public int yu;

    @Override // com.bytedance.sdk.openadsdk.yu.fkw.vt.lh
    public final void ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.ouw);
            jSONObject.put("preload_size", this.vt);
            jSONObject.put("load_time", this.f8772lh);
            jSONObject.put("error_code", this.yu);
            jSONObject.put("error_message", this.fkw);
            jSONObject.put("error_message_server", this.f8771le);
        } catch (Throwable th2) {
            qbp.lh("LoadVideoErrorModel", th2.getMessage());
        }
    }
}
