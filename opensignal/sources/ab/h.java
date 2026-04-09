package ab;

import ya.a0;
import ya.r0;
import ya.s0;

/* loaded from: classes.dex */
public final class h implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final j f310a;

    /* renamed from: d, reason: collision with root package name */
    public final r0 f311d;

    /* renamed from: g, reason: collision with root package name */
    public final int f312g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f313r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f314x;

    public h(j jVar, j jVar2, r0 r0Var, int i10) {
        this.f314x = jVar;
        this.f310a = jVar2;
        this.f311d = r0Var;
        this.f312g = i10;
    }

    @Override // ya.s0
    public final boolean b() {
        j jVar = this.f314x;
        return !jVar.v() && this.f311d.r(jVar.R);
    }

    public final void c() {
        if (this.f313r) {
            return;
        }
        j jVar = this.f314x;
        a0 a0Var = jVar.B;
        int[] iArr = jVar.f316d;
        int i10 = this.f312g;
        a0Var.b(iArr[i10], jVar.f317g[i10], 0, null, jVar.P);
        this.f313r = true;
    }

    @Override // ya.s0
    public final int h(long j) throws Throwable {
        j jVar = this.f314x;
        if (jVar.v()) {
            return 0;
        }
        boolean z10 = jVar.R;
        r0 r0Var = this.f311d;
        int iP = r0Var.p(j, z10);
        r0Var.z(iP);
        if (iP > 0) {
            c();
        }
        return iP;
    }

    @Override // ya.s0
    public final int j(io.sentry.internal.debugmeta.c cVar, z9.d dVar, int i10) {
        j jVar = this.f314x;
        if (jVar.v()) {
            return -3;
        }
        c();
        return this.f311d.w(cVar, dVar, i10, jVar.R);
    }

    @Override // ya.s0
    public final void a() {
    }
}
