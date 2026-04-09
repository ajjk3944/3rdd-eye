package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vm {
    public static int ouw = 1;
    public static int vt = 2;

    /* renamed from: lh, reason: collision with root package name */
    public int f8287lh = 5;
    public int yu = 30;
    public int fkw = 70;

    /* renamed from: le, reason: collision with root package name */
    public int f8286le = 1;
    public int ra = ouw;
    public int pno = 0;
    public int bly = 0;
    public int tlj = 3;

    public final JSONObject ouw(JSONObject jSONObject) {
        try {
            jSONObject.put("ceiling_time", this.f8287lh);
            jSONObject.put("ceiling_ratio", this.yu);
            jSONObject.put("expand_ratio", this.fkw);
            jSONObject.put("back_type", this.f8286le);
            jSONObject.put("boc_return_type", this.ra);
            jSONObject.put("pre_render_status", this.pno);
            jSONObject.put("pre_render_use_gecko", this.bly);
            jSONObject.put("pre_render_add_type", this.tlj);
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("InteractionParams", th2.getMessage());
            return jSONObject;
        }
    }
}
