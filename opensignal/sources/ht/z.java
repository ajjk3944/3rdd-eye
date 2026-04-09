package ht;

import java.util.List;

/* loaded from: classes.dex */
public final class z extends x {

    /* renamed from: d, reason: collision with root package name */
    public final gt.o f10958d;

    /* renamed from: g, reason: collision with root package name */
    public final br.n f10959g;

    /* renamed from: r, reason: collision with root package name */
    public final gt.i f10960r;

    /* JADX WARN: Multi-variable type inference failed */
    public z(gt.o oVar, ar.a aVar) {
        br.l.e(oVar, "storageManager");
        this.f10958d = oVar;
        this.f10959g = (br.n) aVar;
        this.f10960r = new gt.i((gt.l) oVar, aVar);
    }

    @Override // ht.x
    public final List L() {
        return p0().L();
    }

    @Override // ht.x
    public final at.n W() {
        return p0().W();
    }

    @Override // ht.x
    public final i0 X() {
        return p0().X();
    }

    @Override // ht.x
    public final m0 Z() {
        return p0().Z();
    }

    @Override // ht.x
    public final boolean c0() {
        return p0().c0();
    }

    @Override // ht.x
    /* renamed from: h0 */
    public final x q0(jt.f fVar) {
        br.l.e(fVar, "kotlinTypeRefiner");
        return new z(this.f10958d, new ah.d(fVar, 22, this));
    }

    @Override // ht.x
    public final c1 k0() {
        x xVarP0 = p0();
        while (xVarP0 instanceof z) {
            xVarP0 = ((z) xVarP0).p0();
        }
        br.l.c(xVarP0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (c1) xVarP0;
    }

    public final x p0() {
        return (x) this.f10960r.c();
    }

    public final String toString() {
        gt.i iVar = this.f10960r;
        return (iVar.f9651g == gt.k.NOT_COMPUTED || iVar.f9651g == gt.k.COMPUTING) ? "<Not computed yet>" : p0().toString();
    }
}
