package androidx.lifecycle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w0 implements y, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final String f1195a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f1196b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1197c;

    public w0(String str, v0 v0Var) {
        this.f1195a = str;
        this.f1196b = v0Var;
    }

    @Override // androidx.lifecycle.y
    public final void g(a0 a0Var, r rVar) {
        if (rVar == r.ON_DESTROY) {
            this.f1197c = false;
            a0Var.j().b(this);
        }
    }

    public final void p(t tVar, yb.i iVar) {
        nk.k.e(iVar, "registry");
        nk.k.e(tVar, "lifecycle");
        if (this.f1197c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f1197c = true;
        tVar.a(this);
        iVar.P(this.f1195a, (b5.a0) this.f1196b.f1194a.f1138f);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
