package com.bytedance.sdk.component.adexpress.dynamic.xq.emc;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class ycc implements View.OnTouchListener {
    private static int xq = 10;
    private com.bytedance.sdk.component.adexpress.dynamic.xq.msw bw;
    private boolean dg;
    private float emc;
    private float ypw;

    public ycc(com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar) {
        this.bw = mswVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.emc = motionEvent.getX();
            this.ypw = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x6 = motionEvent.getX();
                float y3 = motionEvent.getY();
                if (Math.abs(x6 - this.emc) >= xq || Math.abs(y3 - this.ypw) >= xq) {
                    this.dg = true;
                }
            } else if (action == 3) {
                this.dg = false;
            }
        } else {
            if (this.dg) {
                this.dg = false;
                return false;
            }
            float x7 = motionEvent.getX();
            float y4 = motionEvent.getY();
            if (Math.abs(x7 - this.emc) >= xq || Math.abs(y4 - this.ypw) >= xq) {
                this.dg = false;
            } else {
                com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar = this.bw;
                if (mswVar != null) {
                    mswVar.emc();
                }
            }
        }
        return true;
    }
}
