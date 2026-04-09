package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f20669a;

    public b(ClockFaceView clockFaceView) {
        this.f20669a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f20669a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f20647t.f20658d) - clockFaceView.B;
        if (height != clockFaceView.f20674r) {
            clockFaceView.f20674r = height;
            clockFaceView.m();
            ClockHandView clockHandView = clockFaceView.f20647t;
            clockHandView.f20664l = clockFaceView.f20674r;
            clockHandView.invalidate();
        }
        return true;
    }
}
