package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC3250cy implements View.OnTouchListener {
    public final /* synthetic */ C3251cz A00;

    public ViewOnTouchListenerC3250cy(C3251cz c3251cz) {
        this.A00 = c3251cz;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C3251cz.A00(this.A00);
            this.A00.A07.ABJ(this.A00.A04.A25(), new C3057Zp().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
