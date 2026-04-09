package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bytedance.sdk.component.utils.qbp;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le extends lh {

    /* renamed from: lh, reason: collision with root package name */
    public int f8765lh = 0;
    public long ouw;
    public long vt;

    @Override // com.bytedance.sdk.openadsdk.yu.fkw.vt.lh
    public final void ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.ouw);
            jSONObject.put("buffers_time", this.vt);
            jSONObject.put("video_backup", this.f8765lh);
        } catch (Throwable th2) {
            qbp.lh("FeedOverModel", th2.getMessage());
        }
    }
}
