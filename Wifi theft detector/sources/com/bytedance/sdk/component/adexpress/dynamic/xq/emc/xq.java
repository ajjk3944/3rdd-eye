package com.bytedance.sdk.component.adexpress.dynamic.xq.emc;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class xq implements View.OnTouchListener {
    private boolean bw;
    private float dg;
    private float emc;
    private boolean msw;
    private int uym;
    private float xq;
    private com.bytedance.sdk.component.adexpress.dynamic.xq.msw ycc;
    private float ypw;
    private boolean zz;

    public xq(com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar) {
        this(mswVar, 5);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar;
        com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar2;
        com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar3;
        if (this.zz) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.emc = motionEvent.getX();
            this.ypw = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.dg = motionEvent.getX();
                this.xq = motionEvent.getY();
                if (Math.abs(this.dg - this.emc) > 10.0f) {
                    this.bw = true;
                }
                if (Math.abs(this.dg - this.emc) > 8.0f || Math.abs(this.xq - this.ypw) > 8.0f) {
                    this.msw = false;
                }
                int iYpw = com.bytedance.sdk.component.adexpress.dg.uym.ypw(com.bytedance.sdk.component.adexpress.dg.emc(), Math.abs(this.dg - this.emc));
                if (this.dg > this.emc && iYpw > this.uym && (mswVar3 = this.ycc) != null) {
                    mswVar3.emc();
                    this.zz = true;
                }
            }
        } else {
            if (!this.bw && !this.msw) {
                return false;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int iYpw2 = com.bytedance.sdk.component.adexpress.dg.uym.ypw(com.bytedance.sdk.component.adexpress.dg.emc(), Math.abs(this.dg - this.emc));
            if (this.dg > this.emc && iYpw2 > this.uym && (mswVar2 = this.ycc) != null) {
                mswVar2.emc();
                this.zz = true;
            }
            float fAbs = Math.abs(x10 - this.emc);
            float fAbs2 = Math.abs(y10 - this.ypw);
            if ((fAbs < 8.0f || fAbs2 < 8.0f) && (mswVar = this.ycc) != null) {
                mswVar.ypw();
                this.zz = true;
            }
        }
        return true;
    }

    public xq(com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar, int i10) {
        this.uym = 5;
        this.msw = true;
        this.ycc = mswVar;
        if (i10 > 0) {
            this.uym = i10;
        }
    }
}
