package y1;

/* loaded from: classes.dex */
public final class c extends i.x {

    /* renamed from: d, reason: collision with root package name */
    public static c f25634d;

    /* renamed from: e, reason: collision with root package name */
    public static final r2.j f25635e = r2.j.Rtl;

    /* renamed from: f, reason: collision with root package name */
    public static final r2.j f25636f = r2.j.Ltr;

    /* renamed from: c, reason: collision with root package name */
    public h2.g0 f25637c;

    @Override // i.x
    public final int[] e(int i10) {
        int iB;
        if (i().length() <= 0 || i10 >= i().length()) {
            return null;
        }
        r2.j jVar = f25635e;
        if (i10 < 0) {
            h2.g0 g0Var = this.f25637c;
            if (g0Var == null) {
                br.l.l("layoutResult");
                throw null;
            }
            iB = g0Var.b(0);
        } else {
            h2.g0 g0Var2 = this.f25637c;
            if (g0Var2 == null) {
                br.l.l("layoutResult");
                throw null;
            }
            int iB2 = g0Var2.b(i10);
            iB = m(iB2, jVar) == i10 ? iB2 : iB2 + 1;
        }
        h2.g0 g0Var3 = this.f25637c;
        if (g0Var3 == null) {
            br.l.l("layoutResult");
            throw null;
        }
        if (iB >= g0Var3.f9825b.f9852f) {
            return null;
        }
        return h(m(iB, jVar), m(iB, f25636f) + 1);
    }

    @Override // i.x
    public final int[] k(int i10) {
        int iB;
        if (i().length() <= 0 || i10 <= 0) {
            return null;
        }
        int length = i().length();
        r2.j jVar = f25636f;
        if (i10 > length) {
            h2.g0 g0Var = this.f25637c;
            if (g0Var == null) {
                br.l.l("layoutResult");
                throw null;
            }
            iB = g0Var.b(i().length());
        } else {
            h2.g0 g0Var2 = this.f25637c;
            if (g0Var2 == null) {
                br.l.l("layoutResult");
                throw null;
            }
            int iB2 = g0Var2.b(i10);
            iB = m(iB2, jVar) + 1 == i10 ? iB2 : iB2 - 1;
        }
        if (iB < 0) {
            return null;
        }
        return h(m(iB, f25635e), m(iB, jVar) + 1);
    }

    public final int m(int i10, r2.j jVar) {
        h2.g0 g0Var = this.f25637c;
        if (g0Var == null) {
            br.l.l("layoutResult");
            throw null;
        }
        int iD = g0Var.d(i10);
        h2.g0 g0Var2 = this.f25637c;
        if (g0Var2 == null) {
            br.l.l("layoutResult");
            throw null;
        }
        if (jVar != g0Var2.f(iD)) {
            h2.g0 g0Var3 = this.f25637c;
            if (g0Var3 != null) {
                return g0Var3.d(i10);
            }
            br.l.l("layoutResult");
            throw null;
        }
        if (this.f25637c != null) {
            return r6.a(i10, false) - 1;
        }
        br.l.l("layoutResult");
        throw null;
    }
}
