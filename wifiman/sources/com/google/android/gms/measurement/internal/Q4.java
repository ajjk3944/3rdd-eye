package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class Q4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f36184a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f36185b;

    Q4(C4945r4 c4945r4, AtomicReference atomicReference) {
        this.f36184a = atomicReference;
        this.f36185b = c4945r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f36184a) {
            try {
                try {
                    this.f36184a.set(this.f36185b.a().E(this.f36185b.l().C()));
                } finally {
                    this.f36184a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
