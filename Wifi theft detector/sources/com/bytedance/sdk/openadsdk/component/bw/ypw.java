package com.bytedance.sdk.openadsdk.component.bw;

import java.util.Comparator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw {
    public static final Comparator<ypw> emc = new Comparator<ypw>() { // from class: com.bytedance.sdk.openadsdk.component.bw.ypw.1
        @Override // java.util.Comparator
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public int compare(ypw ypwVar, ypw ypwVar2) {
            return ypwVar.bw() != ypwVar2.bw() ? Long.compare(ypwVar2.bw(), ypwVar.bw()) : Long.compare(ypwVar2.xq(), ypwVar.xq());
        }
    };
    private final long bw;
    private final long dg;
    private final String uym;
    private final String xq;
    private final long ycc;
    private final String ypw;

    public ypw(String str, String str2, long j10, long j11, long j12, String str3) {
        this.ypw = str;
        this.xq = str2;
        this.dg = j10;
        this.bw = j11;
        this.ycc = j12;
        this.uym = str3;
    }

    public static ypw emc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new ypw(jSONObject.optString("rit"), jSONObject.optString("material"), jSONObject.optLong("expire_time"), jSONObject.optLong("create_time"), jSONObject.optLong("price"), jSONObject.optString("req_id"));
        } catch (Exception unused) {
            return null;
        }
    }

    public long bw() {
        return this.ycc;
    }

    public long dg() {
        return this.bw;
    }

    public String toString() {
        return "AdCache{mRit=" + this.ypw + ", mExpireTime=" + this.dg + ", mCreateTime=" + this.bw + ", mPrice=" + this.ycc + ", mReqId='" + this.uym + '}';
    }

    public long xq() {
        return this.dg;
    }

    public String ycc() {
        return this.uym;
    }

    public String ypw() {
        return this.xq;
    }

    public JSONObject emc() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("rit", this.ypw);
            jSONObject.putOpt("material", this.xq);
            jSONObject.putOpt("expire_time", Long.valueOf(this.dg));
            jSONObject.putOpt("create_time", Long.valueOf(this.bw));
            jSONObject.putOpt("price", Long.valueOf(this.ycc));
            jSONObject.putOpt("req_id", this.uym);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
