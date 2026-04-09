package io.sentry;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Set;

/* loaded from: classes.dex */
public final class i extends io.sentry.protocol.c {

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.protocol.c f12319g;

    /* renamed from: r, reason: collision with root package name */
    public final io.sentry.protocol.c f12320r;

    /* renamed from: x, reason: collision with root package name */
    public final io.sentry.protocol.c f12321x;

    /* renamed from: y, reason: collision with root package name */
    public final t3 f12322y;

    public i(io.sentry.protocol.c cVar, io.sentry.protocol.c cVar2, io.sentry.protocol.c cVar3, t3 t3Var) {
        this.f12319g = cVar;
        this.f12320r = cVar2;
        this.f12321x = cVar3;
        this.f12322y = t3Var;
    }

    @Override // io.sentry.protocol.c
    public final boolean a(Object obj) {
        throw null;
    }

    @Override // io.sentry.protocol.c
    public final Set b() {
        return w().f12528a.entrySet();
    }

    @Override // io.sentry.protocol.c
    public final Object c(Object obj) {
        Object objC = this.f12321x.c(obj);
        if (objC != null) {
            return objC;
        }
        Object objC2 = this.f12320r.c(obj);
        return objC2 != null ? objC2 : this.f12319g.c(obj);
    }

    @Override // io.sentry.protocol.c
    public final io.sentry.protocol.a d() {
        io.sentry.protocol.a aVarD = this.f12321x.d();
        if (aVarD != null) {
            return aVarD;
        }
        io.sentry.protocol.a aVarD2 = this.f12320r.d();
        return aVarD2 != null ? aVarD2 : this.f12319g.d();
    }

    @Override // io.sentry.protocol.c
    public final io.sentry.protocol.f e() {
        io.sentry.protocol.f fVarE = this.f12321x.e();
        if (fVarE != null) {
            return fVarE;
        }
        io.sentry.protocol.f fVarE2 = this.f12320r.e();
        return fVarE2 != null ? fVarE2 : this.f12319g.e();
    }

    @Override // io.sentry.protocol.c
    public final io.sentry.protocol.m f() {
        io.sentry.protocol.m mVarF = this.f12321x.f();
        if (mVarF != null) {
            return mVarF;
        }
        io.sentry.protocol.m mVarF2 = this.f12320r.f();
        return mVarF2 != null ? mVarF2 : this.f12319g.f();
    }

    @Override // io.sentry.protocol.c
    public final io.sentry.protocol.v g() {
        io.sentry.protocol.v vVarG = this.f12321x.g();
        if (vVarG != null) {
            return vVarG;
        }
        io.sentry.protocol.v vVarG2 = this.f12320r.g();
        return vVarG2 != null ? vVarG2 : this.f12319g.g();
    }

    @Override // io.sentry.protocol.c
    public final k6 h() {
        k6 k6VarH = this.f12321x.h();
        if (k6VarH != null) {
            return k6VarH;
        }
        k6 k6VarH2 = this.f12320r.h();
        return k6VarH2 != null ? k6VarH2 : this.f12319g.h();
    }

    @Override // io.sentry.protocol.c
    public final Enumeration i() {
        return w().f12528a.keys();
    }

    @Override // io.sentry.protocol.c
    public final Object j(Object obj, String str) {
        return v().j(obj, str);
    }

    @Override // io.sentry.protocol.c
    public final void k(io.sentry.protocol.c cVar) {
        throw null;
    }

    @Override // io.sentry.protocol.c
    public final void l(io.sentry.protocol.a aVar) {
        v().l(aVar);
    }

    @Override // io.sentry.protocol.c
    public final void m(io.sentry.protocol.b bVar) {
        v().m(bVar);
    }

    @Override // io.sentry.protocol.c
    public final void n(io.sentry.protocol.f fVar) {
        v().n(fVar);
    }

    @Override // io.sentry.protocol.c
    public final void o(io.sentry.protocol.i iVar) {
        v().o(iVar);
    }

    @Override // io.sentry.protocol.c
    public final void p(io.sentry.protocol.m mVar) {
        v().p(mVar);
    }

    @Override // io.sentry.protocol.c
    public final void q(io.sentry.protocol.p pVar) {
        v().q(pVar);
    }

    @Override // io.sentry.protocol.c
    public final void r(io.sentry.protocol.v vVar) {
        v().r(vVar);
    }

    @Override // io.sentry.protocol.c
    public final void s(io.sentry.protocol.b0 b0Var) {
        v().s(b0Var);
    }

    @Override // io.sentry.protocol.c, io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        w().serialize(y2Var, u0Var);
    }

    @Override // io.sentry.protocol.c
    public final void t(k6 k6Var) {
        v().t(k6Var);
    }

    public final io.sentry.protocol.c v() {
        int i10 = h.f12291a[this.f12322y.ordinal()];
        io.sentry.protocol.c cVar = this.f12321x;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? cVar : this.f12319g : this.f12320r : cVar;
    }

    public final io.sentry.protocol.c w() {
        io.sentry.protocol.c cVar = new io.sentry.protocol.c();
        cVar.k(this.f12319g);
        cVar.k(this.f12320r);
        cVar.k(this.f12321x);
        return cVar;
    }
}
