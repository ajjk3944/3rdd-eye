package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z0 extends w0 implements Choreographer$VsyncCallback {

    /* renamed from: e, reason: collision with root package name */
    public final Handler f18949e;

    public /* synthetic */ z0(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.f18949e = bq0.n();
    }

    @Override // com.google.android.gms.internal.ads.w0
    public final void a() {
        this.f17805b.registerDisplayListener(this, bq0.n());
        this.f17804a.postVsyncCallback(this);
    }

    @Override // com.google.android.gms.internal.ads.w0
    public final void b() {
        this.f17805b.unregisterDisplayListener(this);
        this.f18949e.removeCallbacksAndMessages(null);
        this.f17804a.removeVsyncCallback(this);
        this.f17806c = -9223372036854775807L;
        this.f17807d = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i4) {
        if (i4 == 0) {
            this.f17804a.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.f17806c = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.f17807d = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.f17807d = -9223372036854775807L;
        }
        this.f18949e.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.y0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                z0 z0Var = this.f18597a;
                z0Var.f17804a.postVsyncCallback(z0Var);
            }
        }, 500L);
    }
}
