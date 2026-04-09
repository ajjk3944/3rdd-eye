package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bytedance.sdk.component.utils.qbp;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class mwh extends lh {

    /* renamed from: lh, reason: collision with root package name */
    public long f8766lh;
    public long ouw;
    public int vt;

    @Override // com.bytedance.sdk.openadsdk.yu.fkw.vt.lh
    public final void ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.ouw);
            jSONObject.put("buffers_count", this.vt);
            jSONObject.put("total_duration", this.f8766lh);
        } catch (Throwable th2) {
            qbp.lh("PlayBufferModel", th2.getMessage());
        }
    }
}
