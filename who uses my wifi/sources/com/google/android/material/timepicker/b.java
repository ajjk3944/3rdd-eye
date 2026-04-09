package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView f;

    public b(ClockFaceView clockFaceView) {
        this.f = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.y.i) - clockFaceView.G;
        if (height != clockFaceView.w) {
            clockFaceView.w = height;
            clockFaceView.m();
            ClockHandView clockHandView = clockFaceView.y;
            clockHandView.q = clockFaceView.w;
            clockHandView.invalidate();
        }
        return true;
    }
}
