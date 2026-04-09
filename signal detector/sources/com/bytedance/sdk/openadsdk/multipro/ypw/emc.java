package com.bytedance.sdk.openadsdk.multipro.ypw;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    public long bw;
    public boolean dg;
    public boolean emc;
    public long uym;
    public boolean xq;
    public long ycc;
    public boolean ypw;

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.ypw.emc$emc, reason: collision with other inner class name */
    public interface InterfaceC0094emc {
        emc ycc();
    }

    public emc dg(boolean z6) {
        this.xq = z6;
        return this;
    }

    public emc emc(boolean z6) {
        this.dg = z6;
        return this;
    }

    public emc xq(boolean z6) {
        this.ypw = z6;
        return this;
    }

    public emc ypw(boolean z6) {
        this.emc = z6;
        return this;
    }

    public emc emc(long j6) {
        this.bw = j6;
        return this;
    }

    public emc xq(long j6) {
        this.uym = j6;
        return this;
    }

    public emc ypw(long j6) {
        this.ycc = j6;
        return this;
    }

    public JSONObject emc() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.emc);
            jSONObject.put("isFromVideoDetailPage", this.ypw);
            jSONObject.put("isFromDetailPage", this.xq);
            jSONObject.put("duration", this.bw);
            jSONObject.put("totalPlayDuration", this.ycc);
            jSONObject.put("currentPlayPosition", this.uym);
            jSONObject.put("isAutoPlay", this.dg);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static emc emc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        emc emcVar = new emc();
        emcVar.ypw(jSONObject.optBoolean("isCompleted"));
        emcVar.xq(jSONObject.optBoolean("isFromVideoDetailPage"));
        emcVar.dg(jSONObject.optBoolean("isFromDetailPage"));
        emcVar.emc(jSONObject.optLong("duration"));
        emcVar.ypw(jSONObject.optLong("totalPlayDuration"));
        emcVar.xq(jSONObject.optLong("currentPlayPosition"));
        emcVar.emc(jSONObject.optBoolean("isAutoPlay"));
        return emcVar;
    }
}
