package d;

import b5.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b0 implements androidx.lifecycle.y, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f21577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f21578b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.t f21579c;

    public b0(y yVar, i0 i0Var, c0 c0Var, androidx.lifecycle.t tVar) {
        this.f21577a = yVar;
        this.f21578b = i0Var;
        this.f21579c = tVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f21579c.b(this);
    }

    @Override // androidx.lifecycle.y
    public final void g(androidx.lifecycle.a0 a0Var, androidx.lifecycle.r rVar) {
        boolean z3 = rVar.a().compareTo(androidx.lifecycle.s.f1183d) >= 0 && this.f21578b.f1820a;
        y yVar = this.f21577a;
        yVar.c(z3);
        if (rVar == androidx.lifecycle.r.ON_DESTROY) {
            yVar.b();
            this.f21579c.b(this);
        }
    }
}
