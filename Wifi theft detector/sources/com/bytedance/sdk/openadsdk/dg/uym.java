package com.bytedance.sdk.openadsdk.dg;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uym {
    private long bw;
    private long dg;
    private long emc;
    private long xq;
    private long ypw;

    public void bw(long j10) {
        if (this.bw <= 0) {
            this.bw = j10;
        }
    }

    public void dg(long j10) {
        if (this.dg <= 0) {
            this.dg = j10;
        }
    }

    public void emc(long j10) {
        if (this.emc <= 0) {
            this.emc = j10;
        }
    }

    public void xq(long j10) {
        if (this.xq <= 0) {
            this.xq = j10;
        }
    }

    public void ypw(long j10) {
        if (this.ypw <= 0) {
            this.ypw = j10;
        }
    }

    public boolean emc() {
        return this.emc > 0;
    }

    public JSONObject ypw() {
        return emc((JSONObject) null);
    }

    public void emc(long j10, float f10) {
        if (f10 > 0.0f) {
            emc(j10);
        }
        double d10 = f10;
        if (d10 >= 0.25d) {
            emc(j10);
            ypw(j10);
        }
        if (d10 >= 0.5d) {
            emc(j10);
            ypw(j10);
            xq(j10);
        }
        if (d10 >= 0.75d) {
            emc(j10);
            ypw(j10);
            xq(j10);
            dg(j10);
        }
        if (f10 >= 1.0f) {
            emc(j10);
            ypw(j10);
            xq(j10);
            dg(j10);
            bw(j10);
        }
    }

    public JSONObject emc(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        long j10 = this.emc;
        if (j10 > 0) {
            jSONObject.put("show_start", j10);
            long j11 = this.ypw;
            if (j11 > 0) {
                jSONObject.put("show_firstQuartile", j11);
                long j12 = this.xq;
                if (j12 > 0) {
                    jSONObject.put("show_mid", j12);
                    long j13 = this.dg;
                    if (j13 > 0) {
                        jSONObject.put("show_thirdQuartile", j13);
                        long j14 = this.bw;
                        if (j14 > 0) {
                            jSONObject.put("show_full", j14);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
