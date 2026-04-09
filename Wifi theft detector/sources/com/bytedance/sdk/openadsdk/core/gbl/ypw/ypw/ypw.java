package com.bytedance.sdk.openadsdk.core.gbl.ypw.ypw;

import android.content.Context;
import com.bytedance.adsdk.ugeno.dg;
import com.bytedance.adsdk.ypw.ycc;

/* loaded from: classes.dex */
public class ypw extends ycc {
    private dg emc;

    public ypw(Context context) {
        super(context);
    }

    public void emc(dg dgVar) {
        this.emc = dgVar;
    }

    @Override // com.bytedance.adsdk.ypw.ycc, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        dg dgVar = this.emc;
        if (dgVar != null) {
            dgVar.uym();
        }
    }

    @Override // com.bytedance.adsdk.ypw.ycc, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dg dgVar = this.emc;
        if (dgVar != null) {
            dgVar.msw();
        }
    }
}
