package org.webrtc;

import android.view.Choreographer;

/* loaded from: classes2.dex */
public final /* synthetic */ class c0 implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RenderSynchronizer f57221a;

    public /* synthetic */ c0(RenderSynchronizer renderSynchronizer) {
        this.f57221a = renderSynchronizer;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f57221a.onDisplayRefreshCycleBegin(j10);
    }
}
