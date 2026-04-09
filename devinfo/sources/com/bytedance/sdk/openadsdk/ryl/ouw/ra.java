package com.bytedance.sdk.openadsdk.ryl.ouw;

import com.bytedance.sdk.openadsdk.core.bs;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra extends com.bytedance.sdk.component.ouw.yu<JSONObject, JSONObject> {

    /* renamed from: lh, reason: collision with root package name */
    private final bs f8654lh;
    private final String yu;

    public ra(String str, bs bsVar) {
        this.f8654lh = bsVar;
        this.yu = str;
    }

    @Override // com.bytedance.sdk.component.ouw.yu
    public final /* synthetic */ JSONObject ouw(String str, JSONObject jSONObject) throws Exception {
        bs.vt vtVar = new bs.vt();
        vtVar.ouw = "call";
        vtVar.f8115lh = this.yu;
        vtVar.yu = jSONObject;
        return this.f8654lh.ouw(vtVar, 3);
    }
}
