package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC3058Zq implements View.OnTouchListener {
    public final /* synthetic */ ViewOnClickListenerC3059Zr A00;

    public ViewOnTouchListenerC3058Zq(ViewOnClickListenerC3059Zr viewOnClickListenerC3059Zr) {
        this.A00 = viewOnClickListenerC3059Zr;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A00.A00(motionEvent.getX(), motionEvent.getY());
            return false;
        }
        return false;
    }
}
