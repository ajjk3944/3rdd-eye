package o5;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f19000a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f19001d;

    public n0(p0 p0Var, int i10) {
        this.f19001d = p0Var;
        this.f19000a = i10;
    }

    @Override // o5.x0
    public final void a() throws IOException {
        int i10 = this.f19000a;
        p0 p0Var = this.f19001d;
        p0Var.N[i10].s();
        r5.n nVar = p0Var.F;
        int iU = ((df.c) p0Var.f19022r).u(p0Var.W);
        IOException iOException = nVar.f21252g;
        if (iOException != null) {
            throw iOException;
        }
        pb.i0 i0Var = nVar.f21251d;
        if (i0Var != null) {
            if (iU == Integer.MIN_VALUE) {
                iU = i0Var.f20379d;
            }
            IOException iOException2 = i0Var.f20381r;
            if (iOException2 != null && i0Var.f20382x > iU) {
                throw iOException2;
            }
        }
    }

    @Override // o5.x0
    public final boolean b() {
        p0 p0Var = this.f19001d;
        return !p0Var.D() && p0Var.N[this.f19000a].q(p0Var.f19019f0);
    }

    @Override // o5.x0
    public final int h(long j) throws Throwable {
        p0 p0Var = this.f19001d;
        if (p0Var.D()) {
            return 0;
        }
        int i10 = this.f19000a;
        p0Var.y(i10);
        w0 w0Var = p0Var.N[i10];
        int iO = w0Var.o(j, p0Var.f19019f0);
        w0Var.y(iO);
        if (iO == 0) {
            p0Var.z(i10);
        }
        return iO;
    }

    @Override // o5.x0
    public final int j(io.sentry.internal.debugmeta.c cVar, c5.g gVar, int i10) {
        p0 p0Var = this.f19001d;
        if (p0Var.D()) {
            return -3;
        }
        int i11 = this.f19000a;
        p0Var.y(i11);
        int iV = p0Var.N[i11].v(cVar, gVar, i10, p0Var.f19019f0);
        if (iV == -3) {
            p0Var.z(i11);
        }
        return iV;
    }
}
