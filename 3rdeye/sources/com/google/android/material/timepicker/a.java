package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* compiled from: ClockFaceView.java */
/* loaded from: classes2.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f23191b;

    public a(ClockFaceView clockFaceView) {
        this.f23191b = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f23191b;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f23172w.f23179e) - clockFaceView.f23165E;
        if (height != clockFaceView.f23194u) {
            clockFaceView.f23194u = height;
            clockFaceView.h();
            int i = clockFaceView.f23194u;
            ClockHandView clockHandView = clockFaceView.f23172w;
            clockHandView.f23186m = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
