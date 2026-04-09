package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.c5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4822c5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f36358a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f36359b;

    RunnableC4822c5(C4945r4 c4945r4, AtomicReference atomicReference) {
        this.f36358a = atomicReference;
        this.f36359b = c4945r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f36358a) {
            try {
                try {
                    this.f36358a.set(Integer.valueOf(this.f36359b.a().u(this.f36359b.l().C(), N.f36068c0)));
                } finally {
                    this.f36358a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
