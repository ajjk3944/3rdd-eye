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
    public void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        com.bytedance.adsdk.ugeno.dg dgVar = this.dg;
        if (dgVar != null) {
            dgVar.ycc();
        }
        super.onLayout(z6, i, i3, i6, i7);
        com.bytedance.adsdk.ugeno.dg dgVar2 = this.dg;
        if (dgVar2 != null) {
            dgVar2.emc(i, i3, i6, i7);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i3) {
        com.bytedance.adsdk.ugeno.dg dgVar = this.dg;
        if (dgVar != null) {
            int[] iArrEmc = dgVar.emc(i, i3);
            super.onMeasure(iArrEmc[0], iArrEmc[1]);
        } else {
            super.onMeasure(i, i3);
        }
        com.bytedance.adsdk.ugeno.dg dgVar2 = this.dg;
        if (dgVar2 != null) {
            dgVar2.bw();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        com.bytedance.adsdk.ugeno.dg dgVar = this.dg;
        if (dgVar != null) {
            dgVar.ypw(i, i3, i6, i7);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
    }

    @Override // com.bytedance.adsdk.ugeno.ycc.emc
    public View ru(int i) {
        return ((com.bytedance.adsdk.ugeno.ypw.xq) this.emc.get(i)).gbl();
    }
}
