package com.bytedance.sdk.openadsdk.ee.ypw;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.ee.ypw.bw;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class xq extends ypw {
    private int dg;

    public xq(Integer num, View view, rie rieVar, bw.emc emcVar) {
        super(num, view, rieVar, 1000, emcVar);
        this.dg = -1;
        ypw(view);
    }

    @Override // com.bytedance.sdk.openadsdk.ee.ypw.ypw
    public void dg() {
        super.dg();
    }

    @Override // com.bytedance.sdk.openadsdk.ee.ypw.ypw
    public boolean xq() {
        WeakReference<View> weakReference = this.emc;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        View view = this.emc.get();
        if (this.dg == -1) {
            ypw(view);
        }
        return ycc.emc(view, this.dg == 1, this.ypw.blf());
    }

    @Override // com.bytedance.sdk.openadsdk.ee.ypw.ypw
    public int ycc() {
        rie rieVar = this.ypw;
        return (rieVar != null && rieVar.wpn() && this.ypw.mfx() == 1) ? 1000 : 100;
    }

    @Override // com.bytedance.sdk.openadsdk.ee.ypw.ypw
    public void ypw(int i10) {
    }

    private void ypw(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.dg = width * height >= 242500 ? 1 : 0;
        }
    }
}
