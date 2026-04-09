package com.google.android.gms.internal.ads;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class W extends V implements Choreographer.FrameCallback {
    @Override // com.google.android.gms.internal.ads.V
    public final void a() {
        long refreshRate;
        this.f11855b.registerDisplayListener(this, Vt.n());
        this.f11854a.postFrameCallback(this);
        if (this.f11855b.getDisplay(0) != null) {
            refreshRate = (long) (1.0E9d / r0.getRefreshRate());
        } else {
            AbstractC2022vd.v("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            refreshRate = -9223372036854775807L;
        }
        this.f11857d = refreshRate;
    }

    @Override // com.google.android.gms.internal.ads.V
    public final void b() {
        this.f11855b.unregisterDisplayListener(this);
        this.f11854a.removeFrameCallback(this);
        this.f11856c = -9223372036854775807L;
        this.f11857d = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        this.f11856c = j6;
        this.f11854a.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long refreshRate;
        if (i == 0) {
            this.f11854a.postFrameCallback(this);
            if (this.f11855b.getDisplay(0) != null) {
                refreshRate = (long) (1.0E9d / r5.getRefreshRate());
            } else {
                AbstractC2022vd.v("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                refreshRate = -9223372036854775807L;
            }
            this.f11857d = refreshRate;
        }
    }
}
