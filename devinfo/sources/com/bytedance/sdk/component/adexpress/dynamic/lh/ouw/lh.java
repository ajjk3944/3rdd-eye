package com.bytedance.sdk.component.adexpress.dynamic.lh.ouw;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh implements View.OnTouchListener {
    private boolean bly;
    private boolean fkw;

    /* renamed from: le, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.lh.pno f7254le;

    /* renamed from: lh, reason: collision with root package name */
    private float f7255lh;
    private float ouw;
    private boolean pno;
    private int ra;
    private float vt;
    private float yu;

    public lh(com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar) {
        this(pnoVar, (byte) 0);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar;
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar2;
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar3;
        if (this.bly) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ouw = motionEvent.getX();
            this.vt = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.yu = motionEvent.getX();
                this.f7255lh = motionEvent.getY();
                if (Math.abs(this.yu - this.ouw) > 10.0f) {
                    this.fkw = true;
                }
                if (Math.abs(this.yu - this.ouw) > 8.0f || Math.abs(this.f7255lh - this.vt) > 8.0f) {
                    this.pno = false;
                }
                int iVt = com.bytedance.sdk.component.adexpress.yu.ra.vt(com.bytedance.sdk.component.adexpress.yu.ouw(), Math.abs(this.yu - this.ouw));
                if (this.yu > this.ouw && iVt > this.ra && (pnoVar3 = this.f7254le) != null) {
                    pnoVar3.ouw();
                    this.bly = true;
                }
            }
        } else {
            if (!this.fkw && !this.pno) {
                return false;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int iVt2 = com.bytedance.sdk.component.adexpress.yu.ra.vt(com.bytedance.sdk.component.adexpress.yu.ouw(), Math.abs(this.yu - this.ouw));
            if (this.yu > this.ouw && iVt2 > this.ra && (pnoVar2 = this.f7254le) != null) {
                pnoVar2.ouw();
                this.bly = true;
            }
            float fAbs = Math.abs(x10 - this.ouw);
            float fAbs2 = Math.abs(y10 - this.vt);
            if ((fAbs < 8.0f || fAbs2 < 8.0f) && (pnoVar = this.f7254le) != null) {
                pnoVar.vt();
                this.bly = true;
            }
        }
        return true;
    }

    private lh(com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar, byte b10) {
        this.pno = true;
        this.f7254le = pnoVar;
        this.ra = 5;
    }
}
