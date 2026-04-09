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
    public void emc(View view, float f2, float f5, float f6, float f7, SparseArray<xq.emc> sparseArray, boolean z6) {
        emc(view, ((Integer) view.getTag()).intValue(), f2, f5, f6, f7, sparseArray);
    }

    private void emc(View view, int i, float f2, float f5, float f6, float f7, SparseArray<xq.emc> sparseArray) {
        if (this.ypw != null) {
            String strValueOf = "";
            try {
                int i3 = com.bytedance.sdk.component.adexpress.dynamic.emc.ylm;
                if (view.getTag(i3) != null) {
                    strValueOf = String.valueOf(view.getTag(i3));
                }
            } catch (Exception unused) {
            }
            this.ypw.emc(view, i, new vk.emc().dg(f2).xq(f5).ypw(f6).emc(f7).ypw(this.hxp).emc(this.ee).emc(sparseArray).emc(this.xmt).emc(strValueOf).emc());
        }
    }
}
