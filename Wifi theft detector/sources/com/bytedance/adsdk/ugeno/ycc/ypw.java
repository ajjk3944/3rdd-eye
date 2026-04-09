package com.bytedance.adsdk.ugeno.ycc;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public class ypw extends emc<com.bytedance.adsdk.ugeno.ypw.xq> {
    private com.bytedance.adsdk.ugeno.dg dg;

    public ypw(Context context) {
        super(context);
    }

    public void emc(com.bytedance.adsdk.ugeno.dg dgVar) {
        this.dg = dgVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.dg dgVar = this.dg;
        if (dgVar != null) {
            dgVar.uym();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.dg dgVar = this.dg;
        if (dgVar != null) {
            dgVar.msw();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.dg dgVar = this.dg;
        if (dgVar != null) {
            dgVar.ycc();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.dg dgVar2 = this.dg;
        if (dgVar2 != null) {
            dgVar2.emc(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        com.bytedance.adsdk.ugeno.dg dgVar = this.dg;
        if (dgVar != null) {
            int[] iArrEmc = dgVar.emc(i10, i11);
            super.onMeasure(iArrEmc[0], iArrEmc[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        com.bytedance.adsdk.ugeno.dg dgVar2 = this.dg;
        if (dgVar2 != null) {
            dgVar2.bw();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.dg dgVar = this.dg;
        if (dgVar != null) {
            dgVar.ypw(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // com.bytedance.adsdk.ugeno.ycc.emc
    public View ru(int i10) {
        return ((com.bytedance.adsdk.ugeno.ypw.xq) this.emc.get(i10)).gbl();
    }
}
