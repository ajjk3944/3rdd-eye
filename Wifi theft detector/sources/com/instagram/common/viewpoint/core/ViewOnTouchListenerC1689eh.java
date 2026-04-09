package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1689eh implements View.OnTouchListener {
    public final /* synthetic */ C0851Ek A00;

    public ViewOnTouchListenerC1689eh(C0851Ek c0851Ek) {
        this.A00 = c0851Ek;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A00.A0C.A02(new C0835Du(view, motionEvent));
        return false;
    }
}
