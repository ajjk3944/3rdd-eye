package com.bytedance.sdk.openadsdk.core.xq;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.xq.xq;

/* loaded from: classes.dex */
public abstract class bw extends emc {
    public bw(@NonNull Context context, @NonNull rie rieVar, @NonNull String str, int i10) {
        super(context, rieVar, str, i10);
    }

    public abstract void emc(View view, float f10, float f11, float f12, float f13, SparseArray<xq.emc> sparseArray, int i10, int i11, int i12, boolean z10);

    @Override // com.bytedance.sdk.openadsdk.core.xq.emc, com.bytedance.sdk.openadsdk.core.xq.ypw, com.bytedance.sdk.openadsdk.core.xq.xq
    public void emc(View view, float f10, float f11, float f12, float f13, SparseArray<xq.emc> sparseArray, boolean z10) {
        if (emc(view, z10)) {
            emc(view, f10, f11, f12, f13, sparseArray, this.sf, this.db, this.sb, z10);
        }
        super.emc(view, f10, f11, f12, f13, sparseArray, z10);
    }
}
