package com.google.android.gms.internal.ads;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t81 extends AbstractOwnableSynchronizer implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final u81 f16751a;

    public final /* synthetic */ void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f16751a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
