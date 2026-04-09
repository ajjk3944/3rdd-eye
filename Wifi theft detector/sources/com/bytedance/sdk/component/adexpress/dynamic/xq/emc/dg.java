package com.bytedance.sdk.component.adexpress.dynamic.xq.emc;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class dg implements View.OnTouchListener {
    private boolean bw = true;
    private float dg;
    private float emc;
    private boolean gbl;
    private boolean msw;
    private int ru;
    private float uym;
    private float xq;
    private float ycc;
    private float ypw;
    private com.bytedance.sdk.component.adexpress.dynamic.xq.msw zz;

    public dg(com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar, int i10, boolean z10) {
        this.zz = mswVar;
        this.ru = i10;
        this.gbl = z10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar;
        com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar2;
        com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar3;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.emc = motionEvent.getX();
            this.ypw = motionEvent.getY();
            this.ycc = motionEvent.getY();
            this.bw = true;
        } else if (action != 1) {
            if (action == 2) {
                float y10 = motionEvent.getY();
                this.uym = y10;
                if (Math.abs(y10 - this.ycc) > 10.0f) {
                    this.msw = true;
                }
                this.dg = motionEvent.getX();
                this.xq = motionEvent.getY();
                if (Math.abs(this.dg - this.emc) > 8.0f || Math.abs(this.xq - this.ypw) > 8.0f) {
                    this.bw = false;
                }
            }
        } else {
            if (!this.msw && !this.bw) {
                return false;
            }
            if (this.gbl || (mswVar3 = this.zz) == null) {
                int iYpw = com.bytedance.sdk.component.adexpress.dg.uym.ypw(com.bytedance.sdk.component.adexpress.dg.emc(), Math.abs(this.uym - this.ycc));
                if (this.uym - this.ycc < 0.0f && iYpw > this.ru && (mswVar2 = this.zz) != null) {
                    mswVar2.emc();
                } else if (this.bw && (mswVar = this.zz) != null) {
                    mswVar.emc();
                }
            } else {
                mswVar3.emc();
            }
        }
        return true;
    }
}
