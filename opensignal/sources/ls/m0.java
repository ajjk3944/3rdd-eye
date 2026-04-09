package ls;

/* loaded from: classes.dex */
public final class m0 extends rs.k implements rs.x {

    /* renamed from: d, reason: collision with root package name */
    public int f15834d;

    /* renamed from: g, reason: collision with root package name */
    public n0 f15835g;

    /* renamed from: r, reason: collision with root package name */
    public q0 f15836r;

    /* renamed from: x, reason: collision with root package name */
    public int f15837x;

    public static m0 g() {
        m0 m0Var = new m0();
        m0Var.f15835g = n0.INV;
        m0Var.f15836r = q0.P;
        return m0Var;
    }

    @Override // rs.k
    public final rs.b c() {
        o0 o0VarF = f();
        if (o0VarF.b()) {
            return o0VarF;
        }
        throw new bf.n();
    }

    public final Object clone() {
        m0 m0VarG = g();
        m0VarG.h(f());
        return m0VarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // rs.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final rs.k d(f5.u r3, rs.g r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            ls.a r1 = ls.o0.E     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            ls.o0 r1 = new ls.o0     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> Lf
            ls.o0 r4 = (ls.o0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.h(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.m0.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(rs.p pVar) {
        h((o0) pVar);
        return this;
    }

    public final o0 f() {
        o0 o0Var = new o0(this);
        int i10 = this.f15834d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        o0Var.f15851g = this.f15835g;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        o0Var.f15852r = this.f15836r;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        o0Var.f15853x = this.f15837x;
        o0Var.f15850d = i11;
        return o0Var;
    }

    public final void h(o0 o0Var) {
        q0 q0Var;
        if (o0Var == o0.D) {
            return;
        }
        if ((o0Var.f15850d & 1) == 1) {
            n0 n0Var = o0Var.f15851g;
            n0Var.getClass();
            this.f15834d = 1 | this.f15834d;
            this.f15835g = n0Var;
        }
        if ((o0Var.f15850d & 2) == 2) {
            q0 q0Var2 = o0Var.f15852r;
            if ((this.f15834d & 2) != 2 || (q0Var = this.f15836r) == q0.P) {
                this.f15836r = q0Var2;
            } else {
                p0 p0VarR = q0.r(q0Var);
                p0VarR.i(q0Var2);
                this.f15836r = p0VarR.g();
            }
            this.f15834d |= 2;
        }
        if ((o0Var.f15850d & 4) == 4) {
            int i10 = o0Var.f15853x;
            this.f15834d = 4 | this.f15834d;
            this.f15837x = i10;
        }
        this.f21763a = this.f21763a.b(o0Var.f15849a);
    }
}
