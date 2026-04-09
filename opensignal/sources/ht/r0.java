package ht;

/* loaded from: classes.dex */
public final class r0 extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10940b;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f10941c;

    public /* synthetic */ r0(s0 s0Var, int i10) {
        this.f10940b = i10;
        this.f10941c = s0Var;
    }

    @Override // ht.s0
    public boolean a() {
        switch (this.f10940b) {
            case 1:
                return this.f10941c.a();
            default:
                return super.a();
        }
    }

    @Override // ht.s0
    public boolean b() {
        switch (this.f10940b) {
            case 1:
                return true;
            default:
                return super.b();
        }
    }

    @Override // ht.s0
    public final sr.h c(sr.h hVar) {
        switch (this.f10940b) {
            case 0:
                br.l.e(hVar, "annotations");
                break;
            default:
                br.l.e(hVar, "annotations");
                break;
        }
        return this.f10941c.c(hVar);
    }

    @Override // ht.s0
    public final p0 d(x xVar) {
        switch (this.f10940b) {
            case 0:
                return this.f10941c.d(xVar);
            default:
                p0 p0VarD = this.f10941c.d(xVar);
                if (p0VarD == null) {
                    return null;
                }
                rr.i iVarP = xVar.Z().p();
                return ba.m.q(p0VarD, iVarP instanceof rr.r0 ? (rr.r0) iVarP : null);
        }
    }

    @Override // ht.s0
    public final boolean e() {
        switch (this.f10940b) {
        }
        return this.f10941c.e();
    }

    @Override // ht.s0
    public final x f(x xVar, d1 d1Var) {
        switch (this.f10940b) {
            case 0:
                br.l.e(xVar, "topLevelType");
                br.l.e(d1Var, "position");
                break;
            default:
                br.l.e(xVar, "topLevelType");
                br.l.e(d1Var, "position");
                break;
        }
        return this.f10941c.f(xVar, d1Var);
    }
}
