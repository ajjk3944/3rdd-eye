package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class D4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f35840a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f35841b;

    D4(C4945r4 c4945r4, AtomicReference atomicReference) {
        this.f35840a = atomicReference;
        this.f35841b = c4945r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f35840a) {
            try {
                try {
                    this.f35840a.set(Boolean.valueOf(this.f35841b.a().K(this.f35841b.l().C())));
                } finally {
                    this.f35840a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
