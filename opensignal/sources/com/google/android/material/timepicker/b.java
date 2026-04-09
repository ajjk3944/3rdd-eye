package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f5790a;

    public b(ClockFaceView clockFaceView) {
        this.f5790a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f5790a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.P.f5786r) - clockFaceView.f5776a0;
        if (height != clockFaceView.N) {
            clockFaceView.N = height;
            clockFaceView.m();
            ClockHandView clockHandView = clockFaceView.P;
            clockHandView.H = clockFaceView.N;
            clockHandView.invalidate();
        }
        return true;
    }
}
