package com.bytedance.sdk.openadsdk.ryl.ouw;

import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le extends com.bytedance.sdk.component.ouw.yu<JSONObject, JSONObject> {

    /* renamed from: lh, reason: collision with root package name */
    private final WeakReference<bs> f8649lh;

    public le(bs bsVar) {
        this.f8649lh = new WeakReference<>(bsVar);
    }

    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* bridge */ /* synthetic */ JSONObject ouw(String str, JSONObject jSONObject) throws Exception {
        return ouw(jSONObject);
    }

    private JSONObject ouw(JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        WeakReference<bs> weakReference = this.f8649lh;
        if (weakReference != null && weakReference.get() != null) {
            bs bsVar = this.f8649lh.get();
            vpp vppVar = bsVar.bly;
            try {
                boolean z3 = true;
                int i4 = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z3 = false;
                }
                int iOptInt = jSONObject.optInt("reduce_duration", -1);
                int iOptInt2 = (vppVar == null || (jSONObject2 = vppVar.hsa) == null) ? 0 : jSONObject2.optInt("easy_playable_skip_duration", 0);
                if (iOptInt >= 0 && iOptInt2 >= 0) {
                    iOptInt = Math.min(iOptInt, iOptInt2);
                } else if (iOptInt < 0) {
                    iOptInt = iOptInt2 >= 0 ? iOptInt2 : 0;
                }
                if (z3) {
                    com.bytedance.sdk.openadsdk.core.bly.ko koVar = bsVar.f8104cf;
                    if (koVar != null) {
                        koVar.vt(iOptInt);
                    }
                } else {
                    i4 = -1;
                }
                jSONObject3.put("code", i4);
                jSONObject3.put("reduce_duration", iOptInt);
                return jSONObject3;
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.qbp.lh("InteractiveFinishMethod", e2.getMessage());
            }
        }
        return jSONObject3;
    }
}
