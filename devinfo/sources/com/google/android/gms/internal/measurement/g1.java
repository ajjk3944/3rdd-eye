package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class g1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f19750a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19751b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19752c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k1 f19753d;

    public g1(k1 k1Var, boolean z3) {
        Objects.requireNonNull(k1Var);
        this.f19753d = k1Var;
        this.f19750a = System.currentTimeMillis();
        this.f19751b = SystemClock.elapsedRealtime();
        this.f19752c = z3;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        k1 k1Var = this.f19753d;
        if (k1Var.f19798e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e2) {
            k1Var.d(e2, false, this.f19752c);
            b();
        }
    }

    public void b() {
    }
}
