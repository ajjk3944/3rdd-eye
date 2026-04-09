package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp0 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final /* synthetic */ Thread newThread(Runnable runnable) {
        String str = bq0.f9768a;
        return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
    }
}
