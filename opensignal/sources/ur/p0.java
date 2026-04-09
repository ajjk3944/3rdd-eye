package ur;

/* loaded from: classes.dex */
public final class p0 extends q0 {
    public final lq.q I;

    public p0(rr.b bVar, q0 q0Var, int i10, sr.h hVar, qs.g gVar, ht.x xVar, boolean z10, boolean z11, boolean z12, ht.x xVar2, rr.o0 o0Var, ar.a aVar) {
        super(bVar, q0Var, i10, hVar, gVar, xVar, z10, z11, z12, xVar2, o0Var);
        this.I = kc.f.F(aVar);
    }

    @Override // ur.q0
    public final q0 v1(pr.j jVar, qs.g gVar, int i10) {
        sr.h annotations = getAnnotations();
        br.l.d(annotations, "annotations");
        ht.x type = getType();
        br.l.d(type, "type");
        return new p0(jVar, null, i10, annotations, gVar, type, w1(), this.E, this.F, this.G, rr.o0.f21696s, new pp.c(8, this));
    }
}
