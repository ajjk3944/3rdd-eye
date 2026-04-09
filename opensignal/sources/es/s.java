package es;

import h7.r1;
import rr.o0;

/* loaded from: classes.dex */
public final class s extends ur.c0 {
    public static final /* synthetic */ ir.v[] J;
    public final xr.y D;
    public final cj.a E;
    public final gt.i F;
    public final d G;
    public final gt.c H;
    public final sr.h I;

    static {
        br.y yVar = br.x.f2918a;
        J = new ir.v[]{yVar.f(new br.q(yVar.b(s.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), yVar.f(new br.q(yVar.b(s.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s(cj.a aVar, xr.y yVar) {
        br.l.e(aVar, "outerContext");
        ds.a aVar2 = (ds.a) aVar.f3974d;
        super(aVar2.f7458o, yVar.f25518a);
        this.D = yVar;
        cj.a aVarD = i3.g.d(aVar, this, null, 6);
        this.E = aVarD;
        br.l.e(aVar2.f7449d.c().f7495c, "<this>");
        ps.f fVar = ps.f.f20634g;
        ds.a aVar3 = (ds.a) aVarD.f3974d;
        gt.o oVar = aVar3.f7446a;
        q qVar = new q(this, 0);
        gt.l lVar = (gt.l) oVar;
        lVar.getClass();
        this.F = new gt.i(lVar, qVar);
        this.G = new d(aVarD, yVar, this);
        q qVar2 = new q(this, 2);
        gt.l lVar2 = (gt.l) oVar;
        lVar2.getClass();
        this.H = new gt.c(lVar2, qVar2);
        this.I = aVar3.f7465v.f2255b ? sr.g.f22217a : ic.a.H(aVarD, yVar);
        ((gt.l) oVar).a(new q(this, 1));
    }

    @Override // rr.f0
    public final at.n W() {
        return this.G;
    }

    @Override // androidx.lifecycle.o, sr.a
    public final sr.h getAnnotations() {
        return this.I;
    }

    @Override // ur.c0, ur.o, rr.m
    public final o0 h() {
        return new r1(14, this);
    }

    @Override // ur.c0, ur.n, androidx.lifecycle.o
    public final String toString() {
        return "Lazy Java package fragment: " + this.f23629y + " of module " + ((ds.a) this.E.f3974d).f7458o;
    }
}
