package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1286eH implements View.OnTouchListener {
    public final /* synthetic */ C1287eI A00;

    public ViewOnTouchListenerC1286eH(C1287eI c1287eI) {
        this.A00 = c1287eI;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C1287eI.A00(this.A00);
            this.A00.A06.ABp(this.A00.A03.A2E(), new C1093b9().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
