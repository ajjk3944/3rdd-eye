package com.bytedance.sdk.component.adexpress.dynamic.lh.ouw;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu implements View.OnTouchListener {
    private com.bytedance.sdk.component.adexpress.dynamic.lh.pno bly;

    /* renamed from: cf, reason: collision with root package name */
    private boolean f7264cf;
    private boolean fkw = true;

    /* renamed from: le, reason: collision with root package name */
    private float f7265le;

    /* renamed from: lh, reason: collision with root package name */
    private float f7266lh;
    private float ouw;
    private boolean pno;
    private float ra;
    private int tlj;
    private float vt;
    private float yu;

    public yu(com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar, int i4, boolean z3) {
        this.bly = pnoVar;
        this.tlj = i4;
        this.f7264cf = z3;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar;
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar2;
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar3;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ouw = motionEvent.getX();
            this.vt = motionEvent.getY();
            this.f7265le = motionEvent.getY();
            this.fkw = true;
        } else if (action != 1) {
            if (action == 2) {
                float y10 = motionEvent.getY();
                this.ra = y10;
                if (Math.abs(y10 - this.f7265le) > 10.0f) {
                    this.pno = true;
                }
                this.yu = motionEvent.getX();
                this.f7266lh = motionEvent.getY();
                if (Math.abs(this.yu - this.ouw) > 8.0f || Math.abs(this.f7266lh - this.vt) > 8.0f) {
                    this.fkw = false;
                }
            }
        } else {
            if (!this.pno && !this.fkw) {
                return false;
            }
            if (this.f7264cf || (pnoVar3 = this.bly) == null) {
                int iVt = com.bytedance.sdk.component.adexpress.yu.ra.vt(com.bytedance.sdk.component.adexpress.yu.ouw(), Math.abs(this.ra - this.f7265le));
                if (this.ra - this.f7265le < 0.0f && iVt > this.tlj && (pnoVar2 = this.bly) != null) {
                    pnoVar2.ouw();
                } else if (this.fkw && (pnoVar = this.bly) != null) {
                    pnoVar.ouw();
                }
            } else {
                pnoVar3.ouw();
            }
        }
        return true;
    }
}
