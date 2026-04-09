package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wy1 implements u2 {

    /* renamed from: a, reason: collision with root package name */
    public final hz1 f18236a;

    /* renamed from: b, reason: collision with root package name */
    public final hz1 f18237b;

    /* renamed from: c, reason: collision with root package name */
    public final w1 f18238c = new w1();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f18239d = new AtomicReference(vy1.f17778a);

    public wy1(hz1 hz1Var) {
        this.f18236a = hz1Var;
        this.f18237b = hz1Var;
    }

    public final u2 a() {
        return this.f18239d.get() == vy1.f17780c ? this.f18238c : this.f18237b;
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final void b(int i4, sk0 sk0Var) {
        a().b(i4, sk0Var);
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final void c(sk0 sk0Var, int i4, int i10) {
        a().c(sk0Var, i4, i10);
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final void d(long j, int i4, int i10, int i11, t2 t2Var) {
        a().d(j, i4, i10, i11, t2Var);
        AtomicReference atomicReference = this.f18239d;
        if (atomicReference.get() == vy1.f17779b) {
            this.f18237b.l(false);
            atomicReference.set(vy1.f17780c);
        }
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final int e(vs1 vs1Var, int i4, boolean z3) {
        return a().e(vs1Var, i4, z3);
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final void f(mx1 mx1Var) {
        this.f18236a.f(mx1Var);
    }

    @Override // com.google.android.gms.internal.ads.u2
    public final int g(vs1 vs1Var, int i4, boolean z3) {
        return a().g(vs1Var, i4, z3);
    }
}
