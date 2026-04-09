package ft;

import h7.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ls.c0;
import ls.d1;
import ls.w0;
import mq.y;
import rr.f0;

/* loaded from: classes.dex */
public final class r extends q {

    /* renamed from: g, reason: collision with root package name */
    public final f0 f9109g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9110h;

    /* renamed from: i, reason: collision with root package name */
    public final qs.c f9111i;

    public r(f0 f0Var, c0 c0Var, ns.f fVar, ns.a aVar, js.i iVar, dt.k kVar, String str, ar.a aVar2) {
        ns.h hVar;
        br.l.e(c0Var, "proto");
        br.l.e(fVar, "nameResolver");
        br.l.e(aVar, "metadataVersion");
        br.l.e(kVar, "components");
        br.l.e(str, "debugName");
        w0 w0Var = c0Var.B;
        br.l.d(w0Var, "proto.typeTable");
        h0 h0Var = new h0(w0Var);
        d1 d1Var = c0Var.D;
        br.l.d(d1Var, "proto.versionRequirementTable");
        if (d1Var.f15754d.size() == 0) {
            hVar = ns.h.f18553a;
        } else {
            br.l.d(d1Var.f15754d, "table.requirementList");
            hVar = new ns.h();
        }
        al.b bVarA = kVar.a(f0Var, fVar, h0Var, hVar, aVar, iVar);
        List list = c0Var.f15733r;
        br.l.d(list, "proto.functionList");
        List list2 = c0Var.f15734x;
        br.l.d(list2, "proto.propertyList");
        List list3 = c0Var.f15735y;
        br.l.d(list3, "proto.typeAliasList");
        super(bVarA, list, list2, list3, aVar2);
        this.f9109g = f0Var;
        this.f9110h = str;
        this.f9111i = ((ur.c0) f0Var).f23629y;
    }

    @Override // at.o, at.p
    public final Collection a(at.f fVar, ar.k kVar) {
        br.l.e(fVar, "kindFilter");
        List listI = i(fVar, kVar, zr.d.WHEN_GET_ALL_DESCRIPTORS);
        Iterable iterable = ((dt.k) this.f9105b.f810b).k;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mq.t.d0(arrayList, ((tr.c) it.next()).c(this.f9111i));
        }
        return mq.o.E0(listI, arrayList);
    }

    @Override // ft.q, at.o, at.p
    public final rr.i c(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        xu.d.b0(((dt.k) this.f9105b.f810b).f7501i, bVar, this.f9109g, gVar);
        return super.c(gVar, bVar);
    }

    @Override // ft.q
    public final qs.b l(qs.g gVar) {
        br.l.e(gVar, "name");
        return new qs.b(this.f9111i, gVar);
    }

    @Override // ft.q
    public final Set n() {
        return y.f16947a;
    }

    @Override // ft.q
    public final Set o() {
        return y.f16947a;
    }

    @Override // ft.q
    public final Set p() {
        return y.f16947a;
    }

    @Override // ft.q
    public final boolean q(qs.g gVar) {
        br.l.e(gVar, "name");
        if (super.q(gVar)) {
            return true;
        }
        Iterable iterable = ((dt.k) this.f9105b.f810b).k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((tr.c) it.next()).a(this.f9111i, gVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f9110h;
    }

    @Override // ft.q
    public final void h(ArrayList arrayList, ar.k kVar) {
    }
}
