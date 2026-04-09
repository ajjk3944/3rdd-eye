package com.bytedance.sdk.openadsdk.yu.fkw.vt;

import com.bytedance.sdk.component.utils.qbp;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ryl extends lh {

    /* renamed from: lh, reason: collision with root package name */
    public long f8770lh;
    public String ouw;
    public long vt;
    public long yu;

    @Override // com.bytedance.sdk.openadsdk.yu.fkw.vt.lh
    public final void ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.ouw);
            jSONObject.put("preload_size", this.vt);
            jSONObject.put("load_time", this.f8770lh);
            jSONObject.put("local_cache", this.yu);
        } catch (Throwable th2) {
            qbp.lh("LoadVideoSuccessModel", th2.getMessage());
        }
    }
}
