package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.z1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5112z1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I1 f42154a;

    public C5112z1(I1 i12) {
        this.f42154a = i12;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        synchronized (this.f42154a) {
            try {
                I1 i12 = this.f42154a;
                if (i12.f39602c) {
                    i12.f39601b.onCreate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
