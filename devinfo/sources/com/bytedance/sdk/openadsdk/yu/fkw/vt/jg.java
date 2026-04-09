package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bykv.vk.openvk.ouw.ouw.ouw.lh.b;
import com.bytedance.sdk.component.utils.qbp;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class jg extends lh {
    private final String fkw;

    /* renamed from: lh, reason: collision with root package name */
    private final int f8759lh;
    public long ouw;
    public long vt;
    private final int yu;

    public jg(b bVar) {
        this.f8759lh = bVar.f6570a;
        this.yu = bVar.f6571b;
        this.fkw = bVar.f6572c;
    }

    @Override // com.bytedance.sdk.openadsdk.yu.fkw.vt.lh
    public final void ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.ouw);
            jSONObject.put("total_duration", this.vt);
            jSONObject.put("error_code", this.f8759lh);
            jSONObject.put("extra_error_code", this.yu);
            jSONObject.put("error_message", this.fkw);
        } catch (Throwable th2) {
            qbp.lh("PlayErrorModel", th2.getMessage());
        }
    }
}
