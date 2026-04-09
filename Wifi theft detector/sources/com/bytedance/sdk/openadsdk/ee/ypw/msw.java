package com.bytedance.sdk.openadsdk.ee.ypw;

import android.view.View;
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
        int i10 = this.dg;
        boolean z10 = i10 == 2 || i10 == 0;
        if (z10) {
            this.xq.set(false);
        }
        return !z10 || super.sup();
    }

    @Override // com.bytedance.sdk.openadsdk.ee.ypw.ypw
    public boolean xq() {
        return ycc.emc(this.emc.get(), this.ypw.blf()) && this.dg == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.ee.ypw.ypw
    public int ycc() {
        return 200;
    }

    @Override // com.bytedance.sdk.openadsdk.ee.ypw.ypw
    public void ypw(int i10) {
        if (zz()) {
            return;
        }
        if (i10 == 6 || i10 == 5) {
            this.dg = 0;
            msw();
        }
        if (i10 == 3 || i10 == 2) {
            this.dg = 2;
            msw();
        }
        if (this.dg == 1 || i10 != 0) {
            return;
        }
        this.dg = 1;
        emc();
    }
}
