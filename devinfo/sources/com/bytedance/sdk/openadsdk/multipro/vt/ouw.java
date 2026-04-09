package com.bytedance.sdk.openadsdk.multipro.vt;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw {
    public long fkw;

    /* renamed from: le, reason: collision with root package name */
    public long f8595le;

    /* renamed from: lh, reason: collision with root package name */
    public boolean f8596lh;
    public boolean ouw;
    public long ra;
    public boolean vt;
    public boolean yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.multipro.vt.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0106ouw {
        ouw ra();
    }

    public final JSONObject ouw() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.ouw);
            jSONObject.put("isFromVideoDetailPage", this.vt);
            jSONObject.put("isFromDetailPage", this.f8596lh);
            jSONObject.put("duration", this.fkw);
            jSONObject.put("totalPlayDuration", this.f8595le);
            jSONObject.put("currentPlayPosition", this.ra);
            jSONObject.put("isAutoPlay", this.yu);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static ouw ouw(JSONObject jSONObject) {
        ouw ouwVar = new ouw();
        ouwVar.ouw = jSONObject.optBoolean("isCompleted");
        ouwVar.vt = jSONObject.optBoolean("isFromVideoDetailPage");
        ouwVar.f8596lh = jSONObject.optBoolean("isFromDetailPage");
        ouwVar.fkw = jSONObject.optLong("duration");
        ouwVar.f8595le = jSONObject.optLong("totalPlayDuration");
        ouwVar.ra = jSONObject.optLong("currentPlayPosition");
        ouwVar.yu = jSONObject.optBoolean("isAutoPlay");
        return ouwVar;
    }
}
