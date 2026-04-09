package com.bytedance.sdk.openadsdk.ee.ypw;

import android.view.View;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.ee.ypw.bw;

/* loaded from: classes.dex */
public class msw extends ypw {
    private int dg;

    public msw(Integer num, View view, rie rieVar, bw.emc emcVar) {
        super(num, view, rieVar, 2000, emcVar);
        this.dg = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.ee.ypw.ypw
    public void dg() {
        super.dg();
    }

    @Override // com.bytedance.sdk.openadsdk.ee.ypw.ypw
    public void emc() {
        if (this.dg != 1) {
            return;
        }
        super.emc();
    }

    @Override // com.bytedance.sdk.openadsdk.ee.ypw.ypw
    public boolean sup() {
        int i = this.dg;
        boolean z6 = i == 2 || i == 0;
        if (z6) {
            this.xq.set(false);
        }
        return !z6 || super.sup();
    }

    @Override // com.bytedance.sdk.openadsdk.ee.ypw.ypw
    public boolean xq() {
        return ycc.emc(this.emc.get(), this.ypw.blf()) && this.dg == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.ee.ypw.ypw
    public int ycc() {
        return TTAdConstant.MATE_VALID;
    }

    @Override // com.bytedance.sdk.openadsdk.ee.ypw.ypw
    public void ypw(int i) {
        if (zz()) {
            return;
        }
        if (i == 6 || i == 5) {
            this.dg = 0;
            msw();
        }
        if (i == 3 || i == 2) {
            this.dg = 2;
            msw();
        }
        if (this.dg == 1 || i != 0) {
            return;
        }
        this.dg = 1;
        emc();
    }
}
