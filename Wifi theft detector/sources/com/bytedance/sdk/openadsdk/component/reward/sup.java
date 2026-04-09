package com.bytedance.sdk.openadsdk.component.reward;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.tp;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sup {
    private boolean bw;
    private long dg;
    private final emc emc;
    private long xq;
    private boolean ycc;
    private long ypw;

    public interface emc {
        void emc();
    }

    public sup(emc emcVar) {
        this.bw = true;
        this.emc = emcVar;
        int iEmc = com.bytedance.sdk.openadsdk.sra.emc.emc("reward_callback_fallback", 0);
        if (iEmc != 0) {
            this.bw = false;
            if (iEmc == 2) {
                this.ycc = true;
            }
        }
    }

    public static void emc(rie rieVar, boolean z10, final int i10) {
        com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), rieVar, tp.emc(rieVar), z10 ? "reward_callback" : "reward_fail_callback", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.sup.1
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject emc() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("reason", i10);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public void dg() {
        if (this.emc != null) {
            long jElapsedRealtime = (this.dg + (this.xq > 0 ? SystemClock.elapsedRealtime() - this.xq : 0L)) / 1000;
            if (this.bw) {
                return;
            }
            if (this.ycc || jElapsedRealtime >= this.ypw) {
                this.emc.emc();
            }
        }
    }

    public void xq() {
        this.bw = true;
    }

    public void ypw() {
        if (this.bw) {
            return;
        }
        this.xq = SystemClock.elapsedRealtime();
    }

    public void emc(long j10) {
        if (j10 <= this.ypw) {
            return;
        }
        this.ypw = j10;
    }

    public void emc() {
        if (!this.bw && this.xq > 0) {
            this.dg += SystemClock.elapsedRealtime() - this.xq;
            this.xq = 0L;
        }
    }
}
