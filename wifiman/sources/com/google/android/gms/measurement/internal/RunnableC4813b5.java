package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.b5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4813b5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f36351a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f36352b;

    RunnableC4813b5(C4945r4 c4945r4, AtomicReference atomicReference) {
        this.f36351a = atomicReference;
        this.f36352b = c4945r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f36351a) {
            try {
                try {
                    this.f36351a.set(Double.valueOf(this.f36352b.a().k(this.f36352b.l().C(), N.f36071d0)));
                } finally {
                    this.f36351a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
