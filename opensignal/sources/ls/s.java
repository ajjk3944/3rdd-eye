package ls;

/* loaded from: classes.dex */
public final class s extends rs.l {

    /* renamed from: r, reason: collision with root package name */
    public int f15872r;

    /* renamed from: x, reason: collision with root package name */
    public int f15873x;

    @Override // rs.k
    public final rs.b c() {
        t tVar = new t(this);
        int i10 = (this.f15872r & 1) != 1 ? 0 : 1;
        tVar.f15881r = this.f15873x;
        tVar.f15880g = i10;
        if (tVar.b()) {
            return tVar;
        }
        throw new bf.n();
    }

    public final Object clone() {
        s sVar = new s();
        t tVar = new t(this);
        int i10 = (this.f15872r & 1) != 1 ? 0 : 1;
        tVar.f15881r = this.f15873x;
        tVar.f15880g = i10;
        sVar.g(tVar);
        return sVar;
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
            ls.a r1 = ls.t.D     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            ls.t r1 = new ls.t     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf rs.t -> L11
            r2.g(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            rs.b r4 = r3.f21776a     // Catch: java.lang.Throwable -> Lf
            ls.t r4 = (ls.t) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.g(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.s.d(f5.u, rs.g):rs.k");
    }

    @Override // rs.k
    public final /* bridge */ /* synthetic */ rs.k e(rs.p pVar) {
        g((t) pVar);
        return this;
    }

    public final void g(t tVar) {
        if (tVar == t.B) {
            return;
        }
        if ((tVar.f15880g & 1) == 1) {
            int i10 = tVar.f15881r;
            this.f15872r = 1 | this.f15872r;
            this.f15873x = i10;
        }
        f(tVar);
        this.f21763a = this.f21763a.b(tVar.f15879d);
    }
}
