package vs;

import ht.b0;

/* loaded from: classes.dex */
public final class i extends g {

    /* renamed from: b, reason: collision with root package name */
    public final qs.b f23958b;

    /* renamed from: c, reason: collision with root package name */
    public final qs.g f23959c;

    public i(qs.b bVar, qs.g gVar) {
        super(new lq.l(bVar, gVar));
        this.f23958b = bVar;
        this.f23959c = gVar;
    }

    @Override // vs.g
    public final ht.x a(rr.a0 a0Var) {
        br.l.e(a0Var, "module");
        qs.b bVar = this.f23958b;
        rr.f fVarD = rr.w.d(a0Var, bVar);
        b0 b0VarQ = null;
        if (fVarD != null) {
            int i10 = ts.d.f22961a;
            if (!ts.d.n(fVarD, rr.g.ENUM_CLASS)) {
                fVarD = null;
            }
            if (fVarD != null) {
                b0VarQ = fVarD.q();
            }
        }
        if (b0VarQ != null) {
            return b0VarQ;
        }
        kt.j jVar = kt.j.ERROR_ENUM_TYPE;
        String string = bVar.toString();
        br.l.d(string, "enumClassId.toString()");
        String str = this.f23959c.f21035a;
        br.l.d(str, "enumEntryName.toString()");
        return kt.k.c(jVar, string, str);
    }

    @Override // vs.g
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f23958b.i());
        sb2.append('.');
        sb2.append(this.f23959c);
        return sb2.toString();
    }
}
