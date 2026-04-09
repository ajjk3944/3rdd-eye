package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f18598a;

    public b(ClockFaceView clockFaceView) {
        this.f18598a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f18598a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f18568J.f18586d) - clockFaceView.f18575R;
        if (height != clockFaceView.f18603H) {
            clockFaceView.f18603H = height;
            clockFaceView.m();
            ClockHandView clockHandView = clockFaceView.f18568J;
            clockHandView.f18593l = clockFaceView.f18603H;
            clockHandView.invalidate();
        }
        return true;
    }
}
