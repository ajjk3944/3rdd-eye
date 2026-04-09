package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f21 {

    /* renamed from: a, reason: collision with root package name */
    public final oy0 f10967a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f10968b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public long f10969c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f10970d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f10971e = null;

    /* renamed from: f, reason: collision with root package name */
    public final int f10972f;

    public f21(int i4, oy0 oy0Var) {
        this.f10972f = i4;
        this.f10967a = oy0Var;
    }

    public final void a() {
        if (this.f10968b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f10969c = SystemClock.uptimeMillis();
    }

    public final void b(Throwable th2) {
        if (this.f10968b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f10971e = th2;
    }

    public final void c() {
        AtomicBoolean atomicBoolean = this.f10968b;
        if (atomicBoolean.getAndSet(true)) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f10970d = SystemClock.uptimeMillis();
        ((vy0) this.f10967a).a(this.f10972f - 1, atomicBoolean.get() ? this.f10970d - this.f10969c : -1L, this.f10971e, null);
    }
}
