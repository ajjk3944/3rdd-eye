package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.tA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1894tA {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2259zy f16867a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f16868b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public long f16869c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f16870d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f16871e = null;

    /* renamed from: f, reason: collision with root package name */
    public final int f16872f;

    public C1894tA(int i, InterfaceC2259zy interfaceC2259zy) {
        this.f16872f = i;
        this.f16867a = interfaceC2259zy;
    }

    public final void a() {
        if (this.f16868b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f16869c = SystemClock.uptimeMillis();
    }

    public final void b(Throwable th) {
        if (this.f16868b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f16871e = th;
    }

    public final void c() {
        AtomicBoolean atomicBoolean = this.f16868b;
        if (atomicBoolean.getAndSet(true)) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f16870d = SystemClock.uptimeMillis();
        ((Hy) this.f16867a).b(this.f16872f - 1, atomicBoolean.get() ? this.f16870d - this.f16869c : -1L, this.f16871e, null);
    }
}
