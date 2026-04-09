package com.bytedance.sdk.component.adexpress.dynamic.xq.emc;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.xq.zz;

/* loaded from: classes.dex */
public class ypw implements View.OnTouchListener {
    private zz bw;
    private boolean dg;
    private float emc;
    private long xq;
    private com.bytedance.sdk.component.adexpress.dynamic.xq.msw ycc;
    private float ypw;

    public ypw(zz zzVar, com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar) {
        this.bw = zzVar;
        this.ycc = mswVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.xq = System.currentTimeMillis();
            this.emc = motionEvent.getX();
            this.ypw = motionEvent.getY();
            this.bw.bw();
        } else if (action != 1) {
            if (action == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x10 - this.emc) >= com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), 10.0f) || Math.abs(y10 - this.ypw) >= com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), 10.0f)) {
                    this.dg = true;
                    this.bw.ycc();
                }
            }
        } else {
            if (this.dg) {
                return false;
            }
            if (System.currentTimeMillis() - this.xq >= 1500) {
                com.bytedance.sdk.component.adexpress.dynamic.xq.msw mswVar = this.ycc;
                if (mswVar != null) {
                    mswVar.emc();
                }
            } else {
                this.bw.ycc();
            }
        }
        return true;
    }
}
