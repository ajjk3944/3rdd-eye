package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bytedance.sdk.component.utils.qbp;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends lh {

    /* renamed from: lh, reason: collision with root package name */
    public int f8774lh;
    public long ouw;
    public long vt;
    public int yu = 0;

    @Override // com.bytedance.sdk.openadsdk.yu.fkw.vt.lh
    public final void ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.ouw);
            jSONObject.put("buffers_time", this.vt);
            jSONObject.put("break_reason", this.f8774lh);
            jSONObject.put("video_backup", this.yu);
        } catch (Throwable th2) {
            qbp.lh("FeedBreakModel", th2.getMessage());
        }
    }
}
