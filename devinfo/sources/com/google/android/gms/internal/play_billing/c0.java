package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f20093a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f20094b;

    public c0(t0 t0Var, r0 r0Var) {
        this.f20093a = t0Var;
        this.f20094b = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20093a.f20169a != this) {
            return;
        }
        r0 r0Var = this.f20094b;
        if (k0.g.M(this.f20093a, this, t0.h(r0Var))) {
            t0.j(this.f20093a);
        }
    }
}
