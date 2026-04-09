package com.bytedance.sdk.openadsdk.ryl.ouw;

import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class jg extends com.bytedance.sdk.component.ouw.lh<JSONObject, JSONObject> {
    private WeakReference<bs> fkw;

    /* renamed from: le, reason: collision with root package name */
    private vpp f8646le;

    /* renamed from: lh, reason: collision with root package name */
    long f8647lh;
    HashSet<Integer> yu = new HashSet<>();

    public jg(bs bsVar, vpp vppVar) {
        this.fkw = new WeakReference<>(bsVar);
        this.f8646le = vppVar;
    }

    @Override // com.bytedance.sdk.component.ouw.lh
    public final /* synthetic */ void ouw(JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = jSONObject;
        bs bsVar = this.fkw.get();
        if (bsVar == null || jSONObject2 == null) {
            vt();
            return;
        }
        bsVar.jqy = new com.bytedance.sdk.openadsdk.mwh.vt() { // from class: com.bytedance.sdk.openadsdk.ryl.ouw.jg.2
            @Override // com.bytedance.sdk.openadsdk.mwh.vt
            public final void ouw(int i4) {
                jg.this.yu.add(Integer.valueOf(i4));
                if (jg.this.yu.size() >= jg.this.f8647lh) {
                    try {
                        jg.this.vt(new JSONObject());
                        jg.this.yu.clear();
                    } catch (Exception e2) {
                        com.bytedance.sdk.component.utils.ko.fkw("requestVideoDelay", e2.getMessage());
                    }
                }
            }
        };
        if (jSONObject2.optInt("delay", -1) >= 0) {
            this.f8647lh = r3 / 1000;
        }
    }
}
