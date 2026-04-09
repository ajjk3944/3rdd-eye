package com.bytedance.sdk.openadsdk.ryl.ouw;

import com.bytedance.sdk.openadsdk.core.bs;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends com.bytedance.sdk.component.ouw.lh<JSONObject, JSONObject> {

    /* renamed from: lh, reason: collision with root package name */
    private final WeakReference<bs> f8652lh;

    public ouw(bs bsVar) {
        this.f8652lh = new WeakReference<>(bsVar);
    }

    @Override // com.bytedance.sdk.component.ouw.lh
    public final /* synthetic */ void ouw(JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = jSONObject;
        bs bsVar = this.f8652lh.get();
        if (bsVar == null) {
            vt();
        } else {
            bsVar.ouw(jSONObject2, new com.bytedance.sdk.openadsdk.mwh.yu() { // from class: com.bytedance.sdk.openadsdk.ryl.ouw.ouw.2
                @Override // com.bytedance.sdk.openadsdk.mwh.yu
                public final void ouw(boolean z3, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        if (!z3) {
                            ouw.this.vt(jSONObject3);
                        } else {
                            jSONObject3.put("creatives", bs.ouw(ouwVar));
                            ouw.this.vt(jSONObject3);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
