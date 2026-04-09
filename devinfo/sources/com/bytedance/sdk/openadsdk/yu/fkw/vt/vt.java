package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bytedance.sdk.component.utils.qbp;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends lh {

    /* renamed from: lh, reason: collision with root package name */
    public int f8773lh;
    public long ouw;
    public long vt;
    public int yu;

    @Override // com.bytedance.sdk.openadsdk.yu.fkw.vt.lh
    public final void ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.ouw);
            jSONObject.put("total_duration", this.vt);
            jSONObject.put("vbtt_skip_type", this.f8773lh);
            jSONObject.put("skip_reason", this.yu);
        } catch (Throwable th2) {
            qbp.lh("EndcardSkipModel", th2.getMessage());
        }
    }
}
