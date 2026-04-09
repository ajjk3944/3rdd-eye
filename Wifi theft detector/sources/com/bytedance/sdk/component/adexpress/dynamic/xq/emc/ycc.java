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
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x10 - this.emc) >= xq || Math.abs(y10 - this.ypw) >= xq) {
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
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (Math.abs(x11 - this.emc) >= xq || Math.abs(y11 - this.ypw) >= xq) {
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
