package ht;

import com.google.android.gms.internal.measurement.y3;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: b, reason: collision with root package name */
    public static final x0 f10954b = new x0(s0.f10942a);

    /* renamed from: a, reason: collision with root package name */
    public final s0 f10955a;

    public x0(s0 s0Var) {
        this.f10955a = s0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ht.x0.a(int):void");
    }

    public static d1 b(d1 d1Var, d1 d1Var2) {
        if (d1Var == null) {
            a(38);
            throw null;
        }
        if (d1Var2 == null) {
            a(39);
            throw null;
        }
        d1 d1Var3 = d1.INVARIANT;
        if (d1Var == d1Var3) {
            if (d1Var2 != null) {
                return d1Var2;
            }
            a(40);
            throw null;
        }
        if (d1Var2 == d1Var3) {
            if (d1Var != null) {
                return d1Var;
            }
            a(41);
            throw null;
        }
        if (d1Var == d1Var2) {
            if (d1Var2 != null) {
                return d1Var2;
            }
            a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + d1Var + "' and projection kind '" + d1Var2 + "' cannot be combined");
    }

    public static w0 c(d1 d1Var, d1 d1Var2) {
        d1 d1Var3 = d1.IN_VARIANCE;
        return (d1Var == d1Var3 && d1Var2 == d1.OUT_VARIANCE) ? w0.OUT_IN_IN_POSITION : (d1Var == d1.OUT_VARIANCE && d1Var2 == d1Var3) ? w0.IN_IN_OUT_POSITION : w0.NO_CONFLICT;
    }

    public static x0 d(x xVar) {
        if (xVar == null) {
            a(6);
            throw null;
        }
        return new x0(n0.f10932b.f(xVar.Z(), xVar.L()));
    }

    public static x0 e(s0 s0Var, s0 s0Var2) {
        if (s0Var == null) {
            a(3);
            throw null;
        }
        if (s0Var2 == null) {
            a(4);
            throw null;
        }
        if (s0Var.e()) {
            s0Var = s0Var2;
        } else if (!s0Var2.e()) {
            s0Var = new q(s0Var, s0Var2);
        }
        return new x0(s0Var);
    }

    public static String h(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (rt.k.h(th2)) {
                throw th2;
            }
            return "[Exception while computing toString(): " + th2 + "]";
        }
    }

    public final s0 f() {
        s0 s0Var = this.f10955a;
        if (s0Var != null) {
            return s0Var;
        }
        a(8);
        throw null;
    }

    public final x g(x xVar, d1 d1Var) {
        if (xVar == null) {
            a(9);
            throw null;
        }
        if (d1Var == null) {
            a(10);
            throw null;
        }
        if (this.f10955a.e()) {
            return xVar;
        }
        try {
            x xVarB = j(new g0(xVar, d1Var), null, 0).b();
            if (xVarB != null) {
                return xVarB;
            }
            a(12);
            throw null;
        } catch (v0 e4) {
            return kt.k.c(kt.j.UNABLE_TO_SUBSTITUTE_TYPE, e4.getMessage());
        }
    }

    public final x i(x xVar, d1 d1Var) {
        if (xVar == null) {
            a(14);
            throw null;
        }
        if (d1Var == null) {
            a(15);
            throw null;
        }
        p0 g0Var = new g0(f().f(xVar, d1Var), d1Var);
        s0 s0Var = this.f10955a;
        if (!s0Var.e()) {
            try {
                g0Var = j(g0Var, null, 0);
            } catch (v0 unused) {
                g0Var = null;
            }
        }
        if (s0Var.a() || s0Var.b()) {
            boolean zB = s0Var.b();
            if (g0Var == null) {
                g0Var = null;
            } else if (!g0Var.c()) {
                x xVarB = g0Var.b();
                br.l.d(xVarB, "typeProjection.type");
                if (a1.c(xVarB, nt.c.f18557d, null)) {
                    d1 d1VarA = g0Var.a();
                    br.l.d(d1VarA, "typeProjection.projectionKind");
                    if (d1VarA == d1.OUT_VARIANCE) {
                        g0Var = new g0((x) y3.c(xVarB).f18555b, d1VarA);
                    } else if (zB) {
                        g0Var = new g0((x) y3.c(xVarB).f18554a, d1VarA);
                    } else {
                        nt.d dVar = new nt.d();
                        x0 x0Var = new x0(dVar);
                        if (!dVar.e()) {
                            try {
                                g0Var = x0Var.j(g0Var, null, 0);
                            } catch (v0 unused2) {
                            }
                        }
                    }
                }
            }
        }
        if (g0Var == null) {
            return null;
        }
        return g0Var.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ht.p0 j(ht.p0 r18, rr.r0 r19, int r20) throws ht.v0 {
        /*
            Method dump skipped, instructions count: 799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ht.x0.j(ht.p0, rr.r0, int):ht.p0");
    }
}
