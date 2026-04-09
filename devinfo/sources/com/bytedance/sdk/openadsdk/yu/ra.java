package com.bytedance.sdk.openadsdk.yu;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ra {
    private long fkw;

    /* renamed from: lh, reason: collision with root package name */
    private long f8840lh;
    long ouw;
    private long vt;
    private long yu;

    private void fkw(long j) {
        if (this.fkw <= 0) {
            this.fkw = j;
        }
    }

    private void lh(long j) {
        if (this.f8840lh <= 0) {
            this.f8840lh = j;
        }
    }

    private void ouw(long j) {
        if (this.ouw <= 0) {
            this.ouw = j;
        }
    }

    private void vt(long j) {
        if (this.vt <= 0) {
            this.vt = j;
        }
    }

    private void yu(long j) {
        if (this.yu <= 0) {
            this.yu = j;
        }
    }

    public final void ouw(long j, float f10) {
        if (f10 > 0.0f) {
            ouw(j);
        }
        double d10 = f10;
        if (d10 >= 0.25d) {
            ouw(j);
            vt(j);
        }
        if (d10 >= 0.5d) {
            ouw(j);
            vt(j);
            lh(j);
        }
        if (d10 >= 0.75d) {
            ouw(j);
            vt(j);
            lh(j);
            yu(j);
        }
        if (f10 >= 1.0f) {
            ouw(j);
            vt(j);
            lh(j);
            yu(j);
            fkw(j);
        }
    }

    public final JSONObject ouw(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        long j = this.ouw;
        if (j > 0) {
            jSONObject.put("show_start", j);
            long j8 = this.vt;
            if (j8 > 0) {
                jSONObject.put("show_firstQuartile", j8);
                long j9 = this.f8840lh;
                if (j9 > 0) {
                    jSONObject.put("show_mid", j9);
                    long j10 = this.yu;
                    if (j10 > 0) {
                        jSONObject.put("show_thirdQuartile", j10);
                        long j11 = this.fkw;
                        if (j11 > 0) {
                            jSONObject.put("show_full", j11);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
