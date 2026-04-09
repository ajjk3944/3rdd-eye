package com.bytedance.sdk.openadsdk.core.uym.emc;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.ypw.gbl;
import com.bytedance.sdk.openadsdk.core.model.vk;
import com.bytedance.sdk.openadsdk.core.xq.xq;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class emc extends xq implements com.bytedance.sdk.component.adexpress.dynamic.ycc.emc {
    protected WeakReference<View> emc;
    private gbl ypw;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ycc.emc
    public void emc(gbl gblVar) {
        this.ypw = gblVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ycc.emc
    public void emc(View view) {
        this.emc = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.xq.xq
    public void emc(View view, float f10, float f11, float f12, float f13, SparseArray<xq.emc> sparseArray, boolean z10) {
        emc(view, ((Integer) view.getTag()).intValue(), f10, f11, f12, f13, sparseArray);
    }

    private void emc(View view, int i10, float f10, float f11, float f12, float f13, SparseArray<xq.emc> sparseArray) {
        if (this.ypw != null) {
            String strValueOf = "";
            try {
                int i11 = com.bytedance.sdk.component.adexpress.dynamic.emc.ylm;
                if (view.getTag(i11) != null) {
                    strValueOf = String.valueOf(view.getTag(i11));
                }
            } catch (Exception unused) {
            }
            this.ypw.emc(view, i10, new vk.emc().dg(f10).xq(f11).ypw(f12).emc(f13).ypw(this.hxp).emc(this.ee).emc(sparseArray).emc(this.xmt).emc(strValueOf).emc());
        }
    }
}
