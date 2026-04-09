package com.bytedance.sdk.component.adexpress.dynamic.xq.emc;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class msw implements View.OnTouchListener {
    private float bw;
    private float dg;
    private final com.bytedance.sdk.component.adexpress.dynamic.xq.msw emc;
    private float uym;
    private final int xq = 10;
    private float ycc;
    private final boolean ypw;

    public msw(com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar, boolean z10) {
        this.emc = mswVar;
        this.ypw = z10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar;
        com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.dg = motionEvent.getX();
            this.bw = motionEvent.getY();
            new StringBuilder(", mStartY: ").append(this.bw);
        } else if (action == 1) {
            this.ycc = motionEvent.getX();
            this.uym = motionEvent.getY();
            new StringBuilder(", mEndY: ").append(this.uym);
            if (this.ypw || (mswVar2 = this.emc) == null) {
                float f10 = this.ycc - this.dg;
                float f11 = this.uym - this.bw;
                if (com.bytedance.sdk.component.adexpress.dg.uym.ypw(com.bytedance.sdk.component.adexpress.dg.emc(), Math.abs((float) Math.sqrt((f10 * f10) + (f11 * f11)))) > 10.0f && (mswVar = this.emc) != null) {
                    mswVar.emc();
                }
            } else {
                mswVar2.emc();
            }
        }
        return true;
    }
}
