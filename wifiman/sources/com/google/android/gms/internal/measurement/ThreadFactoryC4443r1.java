package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.measurement.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class ThreadFactoryC4443r1 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private ThreadFactory f35444a = Executors.defaultThreadFactory();

    ThreadFactoryC4443r1(C4371i1 c4371i1) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f35444a.newThread(runnable);
        threadNewThread.setName("ScionFrontendApi");
        return threadNewThread;
    }
}
