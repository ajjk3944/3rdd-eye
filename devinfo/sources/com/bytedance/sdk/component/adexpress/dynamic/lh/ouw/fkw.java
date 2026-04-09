package com.bytedance.sdk.component.adexpress.dynamic.lh.ouw;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw implements View.OnTouchListener {
    private int fkw;

    /* renamed from: lh, reason: collision with root package name */
    private boolean f7252lh;
    private float ouw;
    private float vt;
    private com.bytedance.sdk.component.adexpress.dynamic.lh.pno yu;

    public fkw(com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar, int i4) {
        this.yu = pnoVar;
        this.fkw = i4;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ouw = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y10 = motionEvent.getY();
                this.vt = y10;
                if (Math.abs(y10 - this.ouw) > 10.0f) {
                    this.f7252lh = true;
                }
            }
        } else {
            if (!this.f7252lh) {
                return false;
            }
            int iVt = com.bytedance.sdk.component.adexpress.yu.ra.vt(com.bytedance.sdk.component.adexpress.yu.ouw(), Math.abs(this.vt - this.ouw));
            if (this.vt - this.ouw < 0.0f && iVt > this.fkw && (pnoVar = this.yu) != null) {
                pnoVar.ouw();
                this.ouw = 0.0f;
                this.vt = 0.0f;
                this.f7252lh = false;
            }
        }
        return true;
    }
}
