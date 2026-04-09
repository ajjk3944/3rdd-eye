package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes.dex */
public class sba extends ycc {
    public ypw emc;

    public sba(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw
    public ypw emc(Bitmap bitmap) {
        emc emcVar = new emc(bitmap, this.emc);
        this.emc = emcVar;
        return emcVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw
    public GradientDrawable getDrawable() {
        ypw ypwVar = new ypw();
        this.emc = ypwVar;
        return ypwVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rtt
    public boolean zz() {
        return super.zz();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw
    public GradientDrawable emc(GradientDrawable.Orientation orientation, int[] iArr) {
        ypw ypwVar = new ypw(orientation, iArr);
        this.emc = ypwVar;
        return ypwVar;
    }
}
