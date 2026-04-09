package com.bytedance.sdk.openadsdk.core.zz;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class sra implements com.bytedance.sdk.openadsdk.core.gbl.uym.xq {
    private String ycc;
    private long emc = 0;
    private long ypw = 0;
    private int xq = 0;
    private String dg = null;
    private String bw = null;
    private final AtomicBoolean uym = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.xq
    public void emc(String str) {
        this.ycc = str;
        this.emc = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.xq
    public void ypw(String str) {
        this.bw = str;
        this.ypw = SystemClock.elapsedRealtime();
        this.uym.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.xq
    public void emc(int i, String str, String str2) {
        this.xq = i;
        this.dg = str;
        this.bw = str2;
        this.ypw = SystemClock.elapsedRealtime();
        this.uym.set(false);
    }

    public void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str) {
        if (this.uym.get()) {
            com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, false, str, "success", this.ypw - this.emc, this.bw, this.ycc, 0, null);
        } else {
            com.bytedance.sdk.openadsdk.dg.xq.emc(rieVar, false, str, "fail", this.ypw - this.emc, this.bw, this.ycc, this.xq, this.dg);
        }
    }
}
