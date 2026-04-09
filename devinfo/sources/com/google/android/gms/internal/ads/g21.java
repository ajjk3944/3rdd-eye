package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g21 {

    /* renamed from: a, reason: collision with root package name */
    public final oy0 f11358a;

    public g21(nx0 nx0Var, oy0 oy0Var) {
        this.f11358a = oy0Var;
    }

    public final f21 a(int i4) {
        return new f21(i4, this.f11358a);
    }

    public final void b(int i4) {
        ((vy0) this.f11358a).a(i4 - 1, -1L, null, null);
    }

    public final void c(int i4, String str) {
        ((vy0) this.f11358a).a(i4 - 1, -1L, null, str);
    }

    public final void d(int i4, Throwable th2) {
        ((vy0) this.f11358a).a(i4 - 1, -1L, th2, null);
    }

    public final void e(int i4, vd.b bVar) {
        f21 f21VarA = a(i4);
        f21VarA.a();
        bVar.a(new q81(0, bVar, new rg0(this, f21VarA)), k81.f13081a);
    }

    public final void f(int i4, Runnable runnable) {
        try {
            a(i4).a();
            runnable.run();
        } finally {
        }
    }
}
