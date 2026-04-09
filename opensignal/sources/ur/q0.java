package ur;

import ht.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import rr.u0;

/* loaded from: classes.dex */
public class q0 extends r0 implements rr.k0, u0 {
    public final int B;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final ht.x G;
    public final q0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(rr.b bVar, q0 q0Var, int i10, sr.h hVar, qs.g gVar, ht.x xVar, boolean z10, boolean z11, boolean z12, ht.x xVar2, rr.o0 o0Var) {
        super(bVar, hVar, gVar, xVar, o0Var);
        br.l.e(bVar, "containingDeclaration");
        br.l.e(hVar, "annotations");
        br.l.e(gVar, "name");
        br.l.e(xVar, "outType");
        br.l.e(o0Var, "source");
        this.B = i10;
        this.D = z10;
        this.E = z11;
        this.F = z12;
        this.G = xVar2;
        this.H = q0Var == null ? this : q0Var;
    }

    @Override // rr.u0
    public final /* bridge */ /* synthetic */ vs.g U() {
        return null;
    }

    @Override // rr.o, rr.x
    public final as.p c() {
        as.p pVar = rr.p.f21702f;
        br.l.d(pVar, "LOCAL");
        return pVar;
    }

    @Override // rr.q0
    public final rr.m e(x0 x0Var) {
        br.l.e(x0Var, "substitutor");
        if (x0Var.f10955a.e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // rr.u0
    public final boolean i0() {
        return false;
    }

    @Override // rr.b
    public final Collection p() {
        Collection collectionP = o().p();
        br.l.d(collectionP, "containingDeclaration.overriddenDescriptors");
        Collection collection = collectionP;
        ArrayList arrayList = new ArrayList(mq.p.a0(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((q0) ((rr.b) it.next()).Y().get(this.B));
        }
        return arrayList;
    }

    public q0 v1(pr.j jVar, qs.g gVar, int i10) {
        sr.h annotations = getAnnotations();
        br.l.d(annotations, "annotations");
        ht.x type = getType();
        br.l.d(type, "type");
        return new q0(jVar, null, i10, annotations, gVar, type, w1(), this.E, this.F, this.G, rr.o0.f21696s);
    }

    @Override // rr.l
    public final Object w0(rr.n nVar, Object obj) {
        return nVar.s(this, obj);
    }

    public final boolean w1() {
        return this.D && ((rr.d) o()).f().isReal();
    }

    @Override // ur.o, rr.l
    /* renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final rr.b o() {
        rr.l lVarO = super.o();
        br.l.c(lVarO, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (rr.b) lVarO;
    }

    @Override // ur.o
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public final q0 u1() {
        q0 q0Var = this.H;
        return q0Var == this ? this : q0Var.u1();
    }
}
