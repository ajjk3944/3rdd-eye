package ya;

import java.io.IOException;

/* loaded from: classes.dex */
public final class j0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f26082a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0 f26083d;

    public j0(l0 l0Var, int i10) {
        this.f26083d = l0Var;
        this.f26082a = i10;
    }

    @Override // ya.s0
    public final void a() throws IOException {
        int i10 = this.f26082a;
        l0 l0Var = this.f26083d;
        l0Var.N[i10].t();
        pb.n0 n0Var = l0Var.F;
        int iQ = ((sm.m) l0Var.f26104r).q(l0Var.W);
        IOException iOException = n0Var.f20395g;
        if (iOException != null) {
            throw iOException;
        }
        pb.i0 i0Var = n0Var.f20394d;
        if (i0Var != null) {
            if (iQ == Integer.MIN_VALUE) {
                iQ = i0Var.f20379d;
            }
            IOException iOException2 = i0Var.f20381r;
            if (iOException2 != null && i0Var.f20382x > iQ) {
                throw iOException2;
            }
        }
    }

    @Override // ya.s0
    public final boolean b() {
        l0 l0Var = this.f26083d;
        return !l0Var.C() && l0Var.N[this.f26082a].r(l0Var.f26101f0);
    }

    @Override // ya.s0
    public final int h(long j) throws Throwable {
        l0 l0Var = this.f26083d;
        if (l0Var.C()) {
            return 0;
        }
        int i10 = this.f26082a;
        l0Var.y(i10);
        r0 r0Var = l0Var.N[i10];
        int iP = r0Var.p(j, l0Var.f26101f0);
        r0Var.z(iP);
        if (iP == 0) {
            l0Var.z(i10);
        }
        return iP;
    }

    @Override // ya.s0
    public final int j(io.sentry.internal.debugmeta.c cVar, z9.d dVar, int i10) {
        l0 l0Var = this.f26083d;
        if (l0Var.C()) {
            return -3;
        }
        int i11 = this.f26082a;
        l0Var.y(i11);
        int iW = l0Var.N[i11].w(cVar, dVar, i10, l0Var.f26101f0);
        if (iW == -3) {
            l0Var.z(i11);
        }
        return iW;
    }
}
