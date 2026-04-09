package y1;

/* loaded from: classes.dex */
public final class d extends i.x {

    /* renamed from: e, reason: collision with root package name */
    public static d f25660e;

    /* renamed from: f, reason: collision with root package name */
    public static final r2.j f25661f = r2.j.Rtl;

    /* renamed from: g, reason: collision with root package name */
    public static final r2.j f25662g = r2.j.Ltr;

    /* renamed from: c, reason: collision with root package name */
    public h2.g0 f25663c;

    /* renamed from: d, reason: collision with root package name */
    public e2.k f25664d;

    @Override // i.x
    public final int[] e(int i10) {
        int iC;
        if (i().length() <= 0 || i10 >= i().length()) {
            return null;
        }
        try {
            e2.k kVar = this.f25664d;
            if (kVar == null) {
                br.l.l("node");
                throw null;
            }
            f1.c cVarG = kVar.g();
            int iRound = Math.round(cVarG.f8407d - cVarG.f8405b);
            if (i10 <= 0) {
                i10 = 0;
            }
            h2.g0 g0Var = this.f25663c;
            if (g0Var == null) {
                br.l.l("layoutResult");
                throw null;
            }
            int iB = g0Var.b(i10);
            h2.g0 g0Var2 = this.f25663c;
            if (g0Var2 == null) {
                br.l.l("layoutResult");
                throw null;
            }
            float fE = g0Var2.e(iB) + iRound;
            h2.g0 g0Var3 = this.f25663c;
            if (g0Var3 == null) {
                br.l.l("layoutResult");
                throw null;
            }
            if (g0Var3 == null) {
                br.l.l("layoutResult");
                throw null;
            }
            if (fE < g0Var3.e(g0Var3.f9825b.f9852f - 1)) {
                h2.g0 g0Var4 = this.f25663c;
                if (g0Var4 == null) {
                    br.l.l("layoutResult");
                    throw null;
                }
                iC = g0Var4.c(fE);
            } else {
                h2.g0 g0Var5 = this.f25663c;
                if (g0Var5 == null) {
                    br.l.l("layoutResult");
                    throw null;
                }
                iC = g0Var5.f9825b.f9852f;
            }
            return h(i10, m(iC - 1, f25662g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // i.x
    public final int[] k(int i10) {
        int iC;
        if (i().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            e2.k kVar = this.f25664d;
            if (kVar == null) {
                br.l.l("node");
                throw null;
            }
            f1.c cVarG = kVar.g();
            int iRound = Math.round(cVarG.f8407d - cVarG.f8405b);
            int length = i().length();
            if (length <= i10) {
                i10 = length;
            }
            h2.g0 g0Var = this.f25663c;
            if (g0Var == null) {
                br.l.l("layoutResult");
                throw null;
            }
            int iB = g0Var.b(i10);
            h2.g0 g0Var2 = this.f25663c;
            if (g0Var2 == null) {
                br.l.l("layoutResult");
                throw null;
            }
            float fE = g0Var2.e(iB) - iRound;
            if (fE > 0.0f) {
                h2.g0 g0Var3 = this.f25663c;
                if (g0Var3 == null) {
                    br.l.l("layoutResult");
                    throw null;
                }
                iC = g0Var3.c(fE);
            } else {
                iC = 0;
            }
            if (i10 == i().length() && iC < iB) {
                iC++;
            }
            return h(m(iC, f25661f), i10);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int m(int i10, r2.j jVar) {
        h2.g0 g0Var = this.f25663c;
        if (g0Var == null) {
            br.l.l("layoutResult");
            throw null;
        }
        int iD = g0Var.d(i10);
        h2.g0 g0Var2 = this.f25663c;
        if (g0Var2 == null) {
            br.l.l("layoutResult");
            throw null;
        }
        if (jVar != g0Var2.f(iD)) {
            h2.g0 g0Var3 = this.f25663c;
            if (g0Var3 != null) {
                return g0Var3.d(i10);
            }
            br.l.l("layoutResult");
            throw null;
        }
        if (this.f25663c != null) {
            return r6.a(i10, false) - 1;
        }
        br.l.l("layoutResult");
        throw null;
    }
}
