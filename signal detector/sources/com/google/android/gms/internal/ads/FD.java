package com.google.android.gms.internal.ads;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* loaded from: classes.dex */
public final class FD extends AbstractOwnableSynchronizer implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final GD f8070a;

    public final /* synthetic */ void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.f8070a.toString();
    }
}
