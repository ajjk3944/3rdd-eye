package ls;

/* loaded from: classes.dex */
public final class z0 extends rs.k implements rs.x {
    public int B;
    public b1 D;

    /* renamed from: d, reason: collision with root package name */
    public int f15925d;

    /* renamed from: g, reason: collision with root package name */
    public int f15926g;

    /* renamed from: r, reason: collision with root package name */
    public int f15927r;

    /* renamed from: x, reason: collision with root package name */
    public a1 f15928x;

    /* renamed from: y, reason: collision with root package name */
    public int f15929y;

    public static z0 g() {
        z0 z0Var = new z0();
        z0Var.f15928x = a1.ERROR;
        z0Var.D = b1.LANGUAGE_VERSION;
        return z0Var;
    }

    @Override // rs.k
    public final rs.b c() {
        c1 c1VarF = f();
        c1VarF.b();
        return c1VarF;
    }

    public final Object clone() {
        z0 z0VarG = g();
        z0VarG.h(f());
        return z0VarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // rs.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final rs.k d(f5.u r2, rs.g r3) throws java.lang.Throwable {
        /*
            r1 = this;
            r3 = 0
            ls.a r0 = ls.c1.H     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            ls.c1 r0 = new ls.c1     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.h(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            rs.b r0 = r2.f21776a     // Catch: java.lang.Throwable -> Lf
            ls.c1 r0 = (ls.c1) r0     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            r3 = r0
        L19:
            if (r3 == 0) goto L1e
            r1.h(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.z0.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(rs.p pVar) {
        h((c1) pVar);
        return this;
    }

    public final c1 f() {
        c1 c1Var = new c1(this);
        int i10 = this.f15925d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        c1Var.f15738g = this.f15926g;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        c1Var.f15739r = this.f15927r;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        c1Var.f15740x = this.f15928x;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        c1Var.f15741y = this.f15929y;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        c1Var.B = this.B;
        if ((i10 & 32) == 32) {
            i11 |= 32;
        }
        c1Var.D = this.D;
        c1Var.f15737d = i11;
        return c1Var;
    }

    public final void h(c1 c1Var) {
        if (c1Var == c1.G) {
            return;
        }
        int i10 = c1Var.f15737d;
        if ((i10 & 1) == 1) {
            int i11 = c1Var.f15738g;
            this.f15925d = 1 | this.f15925d;
            this.f15926g = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = c1Var.f15739r;
            this.f15925d = 2 | this.f15925d;
            this.f15927r = i12;
        }
        if ((i10 & 4) == 4) {
            a1 a1Var = c1Var.f15740x;
            a1Var.getClass();
            this.f15925d = 4 | this.f15925d;
            this.f15928x = a1Var;
        }
        int i13 = c1Var.f15737d;
        if ((i13 & 8) == 8) {
            int i14 = c1Var.f15741y;
            this.f15925d = 8 | this.f15925d;
            this.f15929y = i14;
        }
        if ((i13 & 16) == 16) {
            int i15 = c1Var.B;
            this.f15925d = 16 | this.f15925d;
            this.B = i15;
        }
        if ((i13 & 32) == 32) {
            b1 b1Var = c1Var.D;
            b1Var.getClass();
            this.f15925d = 32 | this.f15925d;
            this.D = b1Var;
        }
        this.f21763a = this.f21763a.b(c1Var.f15736a);
    }
}
