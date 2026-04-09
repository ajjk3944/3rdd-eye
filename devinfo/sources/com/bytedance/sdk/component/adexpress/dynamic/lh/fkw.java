package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.le.vpp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw extends zih<com.bytedance.sdk.component.adexpress.le.ra> {
    public fkw(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar) {
        super(context, fkwVar, raVar);
        this.ouw = new com.bytedance.sdk.component.adexpress.le.pno(this.vt);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        this.ouw.setLayoutParams(layoutParams);
        vpp vppVar = this.ouw;
        if (vppVar instanceof com.bytedance.sdk.component.adexpress.le.pno) {
            ((com.bytedance.sdk.component.adexpress.le.pno) vppVar).setButtonText(this.yu.yu.vm);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.zih, com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void ouw() {
        this.ouw.ouw();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.zih, com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void vt() {
        this.ouw.vt();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.zih
    public final void yu() {
    }
}
