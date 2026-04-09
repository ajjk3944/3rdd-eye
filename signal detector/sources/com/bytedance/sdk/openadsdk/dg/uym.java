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

    public void bw(long j6) {
        if (this.bw <= 0) {
            this.bw = j6;
        }
    }

    public void dg(long j6) {
        if (this.dg <= 0) {
            this.dg = j6;
        }
    }

    public void emc(long j6) {
        if (this.emc <= 0) {
            this.emc = j6;
        }
    }

    public void xq(long j6) {
        if (this.xq <= 0) {
            this.xq = j6;
        }
    }

    public void ypw(long j6) {
        if (this.ypw <= 0) {
            this.ypw = j6;
        }
    }

    public boolean emc() {
        return this.emc > 0;
    }

    public JSONObject ypw() {
        return emc((JSONObject) null);
    }

    public void emc(long j6, float f2) {
        if (f2 > 0.0f) {
            emc(j6);
        }
        double d6 = f2;
        if (d6 >= 0.25d) {
            emc(j6);
            ypw(j6);
        }
        if (d6 >= 0.5d) {
            emc(j6);
            ypw(j6);
            xq(j6);
        }
        if (d6 >= 0.75d) {
            emc(j6);
            ypw(j6);
            xq(j6);
            dg(j6);
        }
        if (f2 >= 1.0f) {
            emc(j6);
            ypw(j6);
            xq(j6);
            dg(j6);
            bw(j6);
        }
    }

    public JSONObject emc(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        long j6 = this.emc;
        if (j6 > 0) {
            jSONObject.put("show_start", j6);
            long j7 = this.ypw;
            if (j7 > 0) {
                jSONObject.put("show_firstQuartile", j7);
                long j8 = this.xq;
                if (j8 > 0) {
                    jSONObject.put("show_mid", j8);
                    long j9 = this.dg;
                    if (j9 > 0) {
                        jSONObject.put("show_thirdQuartile", j9);
                        long j10 = this.bw;
                        if (j10 > 0) {
                            jSONObject.put("show_full", j10);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
