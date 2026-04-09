package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class zin {
    public String ouw = "horizontal";
    public int vt = 1;

    /* renamed from: lh, reason: collision with root package name */
    public int f8325lh = 1;
    public int yu = 0;
    public int fkw = 0;

    /* renamed from: le, reason: collision with root package name */
    public int f8324le = 0;
    public int ra = 0;
    public int pno = PAGErrorCode.LOAD_FACTORY_NULL_CODE;
    public int bly = 500;
    public int tlj = 0;

    public static zin ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new zin();
        }
        zin zinVar = new zin();
        zinVar.ouw = jSONObject.optString("direction", "horizontal");
        zinVar.vt = jSONObject.optInt("auto_loop", 1);
        zinVar.f8325lh = jSONObject.optInt("allow_manual_loop", 1);
        zinVar.yu = jSONObject.optInt("unlimited_loop", 0);
        zinVar.fkw = jSONObject.optInt("left_margin", 0);
        zinVar.f8324le = jSONObject.optInt("right_margin", 0);
        zinVar.ra = jSONObject.optInt("ad_margin", 0);
        zinVar.pno = jSONObject.optInt("loop_interval_time", PAGErrorCode.LOAD_FACTORY_NULL_CODE);
        zinVar.bly = jSONObject.optInt("flip_speed", 500);
        zinVar.tlj = jSONObject.optInt("stop_auto_loop", 0);
        return zinVar;
    }

    public final JSONObject ouw() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("direction", this.ouw);
            jSONObject.put("auto_loop", this.vt);
            jSONObject.put("allow_manual_loop", this.f8325lh);
            jSONObject.put("unlimited_loop", this.yu);
            jSONObject.put("left_margin", this.fkw);
            jSONObject.put("right_margin", this.f8324le);
            jSONObject.put("ad_margin", this.ra);
            jSONObject.put("loop_interval_time", this.pno);
            jSONObject.put("flip_speed", this.bly);
            jSONObject.put("stop_auto_loop", this.tlj);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
