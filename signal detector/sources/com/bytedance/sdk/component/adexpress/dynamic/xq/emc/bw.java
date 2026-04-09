package com.bytedance.sdk.component.adexpress.dynamic.xq.emc;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class bw implements View.OnTouchListener {
    private int bw;
    private com.bytedance.sdk.component.adexpress.dynamic.xq.msw dg;
    private float emc;
    private boolean xq;
    private float ypw;

    public bw(com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar, int i) {
        this.dg = mswVar;
        this.bw = i;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.emc = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y3 = motionEvent.getY();
                this.ypw = y3;
                if (Math.abs(y3 - this.emc) > 10.0f) {
                    this.xq = true;
                }
            }
        } else {
            if (!this.xq) {
                return false;
            }
            int iYpw = com.bytedance.sdk.component.adexpress.dg.uym.ypw(com.bytedance.sdk.component.adexpress.dg.emc(), Math.abs(this.ypw - this.emc));
            if (this.ypw - this.emc < 0.0f && iYpw > this.bw && (mswVar = this.dg) != null) {
                mswVar.emc();
                this.emc = 0.0f;
                this.ypw = 0.0f;
                this.xq = false;
            }
        }
        return true;
    }
}
