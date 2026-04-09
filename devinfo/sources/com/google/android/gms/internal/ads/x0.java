package com.google.android.gms.internal.ads;

import android.view.Choreographer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x0 extends w0 implements Choreographer.FrameCallback {
    @Override // com.google.android.gms.internal.ads.w0
    public final void a() {
        long refreshRate;
        this.f17805b.registerDisplayListener(this, bq0.n());
        this.f17804a.postFrameCallback(this);
        if (this.f17805b.getDisplay(0) != null) {
            refreshRate = (long) (1.0E9d / r0.getRefreshRate());
        } else {
            ls.t("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            refreshRate = -9223372036854775807L;
        }
        this.f17807d = refreshRate;
    }

    @Override // com.google.android.gms.internal.ads.w0
    public final void b() {
        this.f17805b.unregisterDisplayListener(this);
        this.f17804a.removeFrameCallback(this);
        this.f17806c = -9223372036854775807L;
        this.f17807d = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f17806c = j;
        this.f17804a.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i4) {
        long refreshRate;
        if (i4 == 0) {
            this.f17804a.postFrameCallback(this);
            if (this.f17805b.getDisplay(0) != null) {
                refreshRate = (long) (1.0E9d / r5.getRefreshRate());
            } else {
                ls.t("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                refreshRate = -9223372036854775807L;
            }
            this.f17807d = refreshRate;
        }
    }
}
