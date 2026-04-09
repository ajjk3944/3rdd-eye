package com.bytedance.sdk.openadsdk.core.lh;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class fkw extends ouw {
    public fkw(Context context, vpp vppVar, String str, int i4) {
        super(context, vppVar, str, i4);
    }

    public abstract void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, int i4, int i10, int i11);

    @Override // com.bytedance.sdk.openadsdk.core.lh.ouw, com.bytedance.sdk.openadsdk.core.lh.vt, com.bytedance.sdk.openadsdk.core.lh.lh
    public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z3) {
        if (ouw(view, z3)) {
            ouw(view, f10, f11, f12, f13, sparseArray, this.fak, this.fvf, this.bs);
        }
        super.ouw(view, f10, f11, f12, f13, sparseArray, z3);
    }
}
