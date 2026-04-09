package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class Z4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f36318a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f36319b;

    Z4(C4945r4 c4945r4, AtomicReference atomicReference) {
        this.f36318a = atomicReference;
        this.f36319b = c4945r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f36318a) {
            try {
                try {
                    this.f36318a.set(Long.valueOf(this.f36319b.a().y(this.f36319b.l().C(), N.f36065b0)));
                } finally {
                    this.f36318a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
