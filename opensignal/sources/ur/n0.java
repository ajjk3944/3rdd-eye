package ur;

import ht.x0;

/* loaded from: classes.dex */
public final class n0 extends u implements m0 {

    /* renamed from: d0, reason: collision with root package name */
    public static final d0 f23653d0;

    /* renamed from: a0, reason: collision with root package name */
    public final gt.o f23654a0;

    /* renamed from: b0, reason: collision with root package name */
    public final ft.u f23655b0;

    /* renamed from: c0, reason: collision with root package name */
    public j f23656c0;

    static {
        br.y yVar = br.x.f2918a;
        yVar.f(new br.q(yVar.b(n0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"));
        f23653d0 = new d0();
    }

    public n0(gt.o oVar, ft.u uVar, j jVar, m0 m0Var, sr.h hVar, rr.c cVar, rr.o0 o0Var) {
        super(qs.i.f21042e, cVar, uVar, m0Var, o0Var, hVar);
        this.f23654a0 = oVar;
        this.f23655b0 = uVar;
        qr.g gVar = new qr.g(this, 5, jVar);
        gt.l lVar = (gt.l) oVar;
        lVar.getClass();
        new gt.h(lVar, gVar);
        this.f23656c0 = jVar;
    }

    @Override // rr.k
    public final boolean B() {
        return this.f23656c0.f23645a0;
    }

    @Override // rr.k
    public final rr.f C() {
        rr.f fVarC = this.f23656c0.C();
        br.l.d(fVarC, "underlyingConstructorDescriptor.constructedClass");
        return fVarC;
    }

    @Override // ur.o
    /* renamed from: G1, reason: merged with bridge method [inline-methods] */
    public final m0 u1() {
        rr.u uVarU1 = super.u1();
        br.l.c(uVarU1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (m0) uVarU1;
    }

    @Override // ur.u, rr.u, rr.q0
    /* renamed from: H1, reason: merged with bridge method [inline-methods] */
    public final n0 e(x0 x0Var) {
        br.l.e(x0Var, "substitutor");
        rr.u uVarE = super.e(x0Var);
        br.l.c(uVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        n0 n0Var = (n0) uVarE;
        ht.x xVar = n0Var.D;
        br.l.b(xVar);
        j jVarE = this.f23656c0.a().e(x0.d(xVar));
        if (jVarE == null) {
            return null;
        }
        n0Var.f23656c0 = jVarE;
        return n0Var;
    }

    @Override // ur.u, rr.d
    public final rr.d V(rr.f fVar, rr.z zVar, as.p pVar, rr.c cVar) {
        br.l.e(fVar, "newOwner");
        br.l.e(pVar, "visibility");
        br.l.e(cVar, "kind");
        t tVarB1 = B1(x0.f10954b);
        tVarB1.f23667d = fVar;
        tVarB1.f23668g = zVar;
        tVarB1.f23669r = pVar;
        tVarB1.f23671y = cVar;
        tVarB1.I = false;
        rr.b bVarY1 = tVarB1.T.y1(tVarB1);
        br.l.c(bVarY1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (m0) bVarY1;
    }

    @Override // ur.u, rr.b
    public final ht.x i() {
        ht.x xVar = this.D;
        br.l.b(xVar);
        return xVar;
    }

    @Override // ur.o, rr.l
    public final rr.j o() {
        return this.f23655b0;
    }

    @Override // ur.u
    public final u x1(qs.g gVar, rr.c cVar, rr.l lVar, rr.u uVar, rr.o0 o0Var, sr.h hVar) {
        br.l.e(lVar, "newOwner");
        br.l.e(cVar, "kind");
        br.l.e(hVar, "annotations");
        rr.c cVar2 = rr.c.DECLARATION;
        if (cVar != cVar2) {
            rr.c cVar3 = rr.c.SYNTHESIZED;
        }
        return new n0(this.f23654a0, this.f23655b0, this.f23656c0, this, hVar, cVar2, o0Var);
    }

    @Override // ur.o, rr.l
    public final rr.l o() {
        return this.f23655b0;
    }
}
