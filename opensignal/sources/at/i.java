package at;

import ft.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import mq.w;

/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: b, reason: collision with root package name */
    public final n f2294b;

    public i(n nVar) {
        br.l.e(nVar, "workerScope");
        this.f2294b = nVar;
    }

    @Override // at.o, at.p
    public final Collection a(f fVar, ar.k kVar) {
        br.l.e(fVar, "kindFilter");
        int i10 = f.f2279l & fVar.f2288b;
        f fVar2 = i10 == 0 ? null : new f(i10, fVar.f2287a);
        if (fVar2 == null) {
            return w.f16945a;
        }
        Collection collectionA = this.f2294b.a(fVar2, kVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionA) {
            if (obj instanceof rr.j) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // at.o, at.p
    public final rr.i c(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        rr.i iVarC = this.f2294b.c(gVar, bVar);
        if (iVarC != null) {
            rr.f fVar = iVarC instanceof rr.f ? (rr.f) iVarC : null;
            if (fVar != null) {
                return fVar;
            }
            if (iVarC instanceof u) {
                return (u) iVarC;
            }
        }
        return null;
    }

    @Override // at.o, at.n
    public final Set d() {
        return this.f2294b.d();
    }

    @Override // at.o, at.n
    public final Set e() {
        return this.f2294b.e();
    }

    @Override // at.o, at.n
    public final Set g() {
        return this.f2294b.g();
    }

    public final String toString() {
        return "Classes from " + this.f2294b;
    }
}
