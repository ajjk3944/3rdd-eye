package ls;

/* loaded from: classes.dex */
public final class x0 extends rs.l {
    public q0 B;
    public int D;
    public q0 E;
    public int F;

    /* renamed from: r, reason: collision with root package name */
    public int f15912r;

    /* renamed from: x, reason: collision with root package name */
    public int f15913x;

    /* renamed from: y, reason: collision with root package name */
    public int f15914y;

    @Override // rs.k
    public final rs.b c() {
        y0 y0VarG = g();
        if (y0VarG.b()) {
            return y0VarG;
        }
        throw new bf.n();
    }

    public final Object clone() {
        x0 x0Var = new x0();
        q0 q0Var = q0.P;
        x0Var.B = q0Var;
        x0Var.E = q0Var;
        x0Var.h(g());
        return x0Var;
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
            ls.a r1 = ls.y0.I     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            ls.y0 r1 = new ls.y0     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> Lf
            ls.y0 r4 = (ls.y0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: ls.x0.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(rs.p pVar) {
        h((y0) pVar);
        return this;
    }

    public final y0 g() {
        y0 y0Var = new y0(this);
        int i10 = this.f15912r;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        y0Var.f15922r = this.f15913x;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        y0Var.f15923x = this.f15914y;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        y0Var.f15924y = this.B;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        y0Var.B = this.D;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        y0Var.D = this.E;
        if ((i10 & 32) == 32) {
            i11 |= 32;
        }
        y0Var.E = this.F;
        y0Var.f15921g = i11;
        return y0Var;
    }

    public final void h(y0 y0Var) {
        q0 q0Var;
        q0 q0Var2;
        if (y0Var == y0.H) {
            return;
        }
        int i10 = y0Var.f15921g;
        if ((i10 & 1) == 1) {
            int i11 = y0Var.f15922r;
            this.f15912r = 1 | this.f15912r;
            this.f15913x = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = y0Var.f15923x;
            this.f15912r = 2 | this.f15912r;
            this.f15914y = i12;
        }
        if ((i10 & 4) == 4) {
            q0 q0Var3 = y0Var.f15924y;
            if ((this.f15912r & 4) != 4 || (q0Var2 = this.B) == q0.P) {
                this.B = q0Var3;
            } else {
                p0 p0VarR = q0.r(q0Var2);
                p0VarR.i(q0Var3);
                this.B = p0VarR.g();
            }
            this.f15912r |= 4;
        }
        int i13 = y0Var.f15921g;
        if ((i13 & 8) == 8) {
            int i14 = y0Var.B;
            this.f15912r = 8 | this.f15912r;
            this.D = i14;
        }
        if ((i13 & 16) == 16) {
            q0 q0Var4 = y0Var.D;
            if ((this.f15912r & 16) != 16 || (q0Var = this.E) == q0.P) {
                this.E = q0Var4;
            } else {
                p0 p0VarR2 = q0.r(q0Var);
                p0VarR2.i(q0Var4);
                this.E = p0VarR2.g();
            }
            this.f15912r |= 16;
        }
        if ((y0Var.f15921g & 32) == 32) {
            int i15 = y0Var.E;
            this.f15912r = 32 | this.f15912r;
            this.F = i15;
        }
        f(y0Var);
        this.f21763a = this.f21763a.b(y0Var.f15920d);
    }
}
