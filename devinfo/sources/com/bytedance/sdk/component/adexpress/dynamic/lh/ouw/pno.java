package com.bytedance.sdk.component.adexpress.dynamic.lh.ouw;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.ko;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno implements View.OnTouchListener {
    private float fkw;

    /* renamed from: le, reason: collision with root package name */
    private float f7258le;

    /* renamed from: lh, reason: collision with root package name */
    private final int f7259lh = 10;
    private final com.bytedance.sdk.component.adexpress.dynamic.lh.pno ouw;
    private float ra;
    private final boolean vt;
    private float yu;

    public pno(com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar, boolean z3) {
        this.ouw = pnoVar;
        this.vt = z3;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar;
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.yu = motionEvent.getX();
            this.fkw = motionEvent.getY();
            ko.ouw("ValidateSlideUpTouch", "mStartX: ", Float.valueOf(this.yu), ", mStartY: " + this.fkw);
        } else if (action == 1) {
            this.f7258le = motionEvent.getX();
            this.ra = motionEvent.getY();
            ko.ouw("ValidateSlideUpTouch", "mEndX: ", Float.valueOf(this.f7258le), ", mEndY: " + this.ra);
            if (this.vt || (pnoVar2 = this.ouw) == null) {
                float f10 = this.f7258le - this.yu;
                float f11 = this.ra - this.fkw;
                float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
                ko.ouw("ValidateSlideUpTouch", "slideDistancePx: ", Float.valueOf(fSqrt));
                float fVt = com.bytedance.sdk.component.adexpress.yu.ra.vt(com.bytedance.sdk.component.adexpress.yu.ouw(), Math.abs(fSqrt));
                ko.ouw("ValidateSlideUpTouch", "slideDistanceDp:", Float.valueOf(fVt), " and ", "mSlideThreshold:", 10);
                if (fVt > 10.0f && (pnoVar = this.ouw) != null) {
                    pnoVar.ouw();
                    ko.vt("ValidateSlideUpTouch", "trigger mInteractListener.onInteractTouch()");
                }
            } else {
                pnoVar2.ouw();
                ko.vt("ValidateSlideUpTouch", "mInteractValidate is false, trigger mInteractListener.onInteractTouch()");
            }
        }
        return true;
    }
}
