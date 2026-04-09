package com.bytedance.sdk.openadsdk.ryl.ouw;

import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.uoy;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ko extends com.bytedance.sdk.component.ouw.yu<JSONObject, JSONObject> {

    /* renamed from: lh, reason: collision with root package name */
    private final bs f8648lh;

    public ko(bs bsVar) {
        this.f8648lh = bsVar;
    }

    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* synthetic */ JSONObject ouw(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = jSONObject;
        bs bsVar = this.f8648lh;
        com.bytedance.sdk.component.utils.ko.ouw("Android_jsb", "trigger common convert", jSONObject2);
        vpp vppVarOuw = com.bytedance.sdk.openadsdk.core.vt.ouw(jSONObject2);
        if (vppVarOuw == null) {
            return null;
        }
        boolean zRa = com.bytedance.sdk.openadsdk.core.model.th.ra(bsVar.bly);
        bsVar.ouw(vppVarOuw, zRa ? uoy.vt(bsVar.f8107le) : bsVar.ex, !zRa);
        return null;
    }
}
