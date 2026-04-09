package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1311eh implements View.OnTouchListener {
    public final /* synthetic */ C0473Ek A00;

    public ViewOnTouchListenerC1311eh(C0473Ek c0473Ek) {
        this.A00 = c0473Ek;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A00.A0C.A02(new C0457Du(view, motionEvent));
        return false;
    }
}
