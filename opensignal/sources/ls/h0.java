package ls;

/* loaded from: classes.dex */
public final class h0 extends rs.k implements rs.x {

    /* renamed from: d, reason: collision with root package name */
    public int f15789d;

    /* renamed from: g, reason: collision with root package name */
    public int f15790g;

    /* renamed from: r, reason: collision with root package name */
    public int f15791r;

    /* renamed from: x, reason: collision with root package name */
    public i0 f15792x;

    public static h0 g() {
        h0 h0Var = new h0();
        h0Var.f15790g = -1;
        h0Var.f15792x = i0.PACKAGE;
        return h0Var;
    }

    @Override // rs.k
    public final rs.b c() {
        j0 j0VarF = f();
        if (j0VarF.b()) {
            return j0VarF;
        }
        throw new bf.n();
    }

    public final Object clone() {
        h0 h0VarG = g();
        h0VarG.h(f());
        return h0VarG;
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
            ls.a r0 = ls.j0.E     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            ls.j0 r0 = new ls.j0     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.h(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            rs.b r0 = r2.f21776a     // Catch: java.lang.Throwable -> Lf
            ls.j0 r0 = (ls.j0) r0     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: ls.h0.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(rs.p pVar) {
        h((j0) pVar);
        return this;
    }

    public final j0 f() {
        j0 j0Var = new j0(this);
        int i10 = this.f15789d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        j0Var.f15807g = this.f15790g;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        j0Var.f15808r = this.f15791r;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        j0Var.f15809x = this.f15792x;
        j0Var.f15806d = i11;
        return j0Var;
    }

    public final void h(j0 j0Var) {
        if (j0Var == j0.D) {
            return;
        }
        int i10 = j0Var.f15806d;
        if ((i10 & 1) == 1) {
            int i11 = j0Var.f15807g;
            this.f15789d = 1 | this.f15789d;
            this.f15790g = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = j0Var.f15808r;
            this.f15789d = 2 | this.f15789d;
            this.f15791r = i12;
        }
        if ((i10 & 4) == 4) {
            i0 i0Var = j0Var.f15809x;
            i0Var.getClass();
            this.f15789d = 4 | this.f15789d;
            this.f15792x = i0Var;
        }
        this.f21763a = this.f21763a.b(j0Var.f15805a);
    }
}
