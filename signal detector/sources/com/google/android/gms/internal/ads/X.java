package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* loaded from: classes.dex */
public final class X extends V implements Choreographer$VsyncCallback {

    /* renamed from: e, reason: collision with root package name */
    public final Handler f12351e;

    public /* synthetic */ X(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.f12351e = Vt.n();
    }

    @Override // com.google.android.gms.internal.ads.V
    public final void a() {
        this.f11855b.registerDisplayListener(this, Vt.n());
        this.f11854a.postVsyncCallback(this);
    }

    @Override // com.google.android.gms.internal.ads.V
    public final void b() {
        this.f11855b.unregisterDisplayListener(this);
        this.f12351e.removeCallbacksAndMessages(null);
        this.f11854a.removeVsyncCallback(this);
        this.f11856c = -9223372036854775807L;
        this.f11857d = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.f11854a.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.f11856c = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.f11857d = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.f11857d = -9223372036854775807L;
        }
        this.f12351e.postDelayed(new RunnableC1883t(3, this), 500L);
    }
}
