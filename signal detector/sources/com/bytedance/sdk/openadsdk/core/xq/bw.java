package com.bytedance.sdk.openadsdk.core.xq;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.xq.xq;

/* loaded from: classes.dex */
public abstract class bw extends emc {
    public bw(Context context, rie rieVar, String str, int i) {
        super(context, rieVar, str, i);
    }

    public abstract void emc(View view, float f2, float f5, float f6, float f7, SparseArray<xq.emc> sparseArray, int i, int i3, int i6, boolean z6);

    @Override // com.bytedance.sdk.openadsdk.core.xq.emc, com.bytedance.sdk.openadsdk.core.xq.ypw, com.bytedance.sdk.openadsdk.core.xq.xq
    public void emc(View view, float f2, float f5, float f6, float f7, SparseArray<xq.emc> sparseArray, boolean z6) {
        if (emc(view, z6)) {
            emc(view, f2, f5, f6, f7, sparseArray, this.sf, this.db, this.sb, z6);
        }
        super.emc(view, f2, f5, f6, f7, sparseArray, z6);
    }
}
