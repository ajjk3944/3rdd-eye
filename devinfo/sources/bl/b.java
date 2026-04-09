package bl;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public d[] f2278a;

    /* renamed from: b, reason: collision with root package name */
    public int f2279b;

    /* renamed from: c, reason: collision with root package name */
    public int f2280c;

    /* renamed from: d, reason: collision with root package name */
    public c0 f2281d;

    public final d d() {
        d dVarE;
        c0 c0Var;
        synchronized (this) {
            try {
                d[] dVarArrF = this.f2278a;
                if (dVarArrF == null) {
                    dVarArrF = f();
                    this.f2278a = dVarArrF;
                } else if (this.f2279b >= dVarArrF.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrF, dVarArrF.length * 2);
                    nk.k.d(objArrCopyOf, "copyOf(...)");
                    this.f2278a = (d[]) objArrCopyOf;
                    dVarArrF = (d[]) objArrCopyOf;
                }
                int i4 = this.f2280c;
                do {
                    dVarE = dVarArrF[i4];
                    if (dVarE == null) {
                        dVarE = e();
                        dVarArrF[i4] = dVarE;
                    }
                    i4++;
                    if (i4 >= dVarArrF.length) {
                        i4 = 0;
                    }
                } while (!dVarE.a(this));
                this.f2280c = i4;
                this.f2279b++;
                c0Var = this.f2281d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c0Var != null) {
            c0Var.w(1);
        }
        return dVarE;
    }

    public abstract d e();

    public abstract d[] f();

    public final void g(d dVar) {
        c0 c0Var;
        int i4;
        ck.c[] cVarArrB;
        synchronized (this) {
            try {
                int i10 = this.f2279b - 1;
                this.f2279b = i10;
                c0Var = this.f2281d;
                if (i10 == 0) {
                    this.f2280c = 0;
                }
                nk.k.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                cVarArrB = dVar.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (ck.c cVar : cVarArrB) {
            if (cVar != null) {
                cVar.resumeWith(yj.u.f37649a);
            }
        }
        if (c0Var != null) {
            c0Var.w(-1);
        }
    }

    public final c0 h() {
        c0 c0Var;
        synchronized (this) {
            c0Var = this.f2281d;
            if (c0Var == null) {
                int i4 = this.f2279b;
                c0Var = new c0(1, Integer.MAX_VALUE, zk.a.f38323b);
                c0Var.q(Integer.valueOf(i4));
                this.f2281d = c0Var;
            }
        }
        return c0Var;
    }
}
