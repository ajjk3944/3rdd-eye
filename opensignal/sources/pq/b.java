package pq;

import ar.n;
import br.l;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b implements h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final h f20618a;

    /* renamed from: d, reason: collision with root package name */
    public final f f20619d;

    public b(f fVar, h hVar) {
        l.e(hVar, "left");
        l.e(fVar, "element");
        this.f20618a = hVar;
        this.f20619d = fVar;
    }

    @Override // pq.h
    public final f Y(g gVar) {
        l.e(gVar, "key");
        b bVar = this;
        while (true) {
            f fVarY = bVar.f20619d.Y(gVar);
            if (fVarY != null) {
                return fVarY;
            }
            h hVar = bVar.f20618a;
            if (!(hVar instanceof b)) {
                return hVar.Y(gVar);
            }
            bVar = (b) hVar;
        }
    }

    @Override // pq.h
    public final Object Z(n nVar, Object obj) {
        return nVar.w(this.f20618a.Z(nVar, obj), this.f20619d);
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int i10 = 2;
            b bVar2 = bVar;
            int i11 = 2;
            while (true) {
                h hVar = bVar2.f20618a;
                bVar2 = hVar instanceof b ? (b) hVar : null;
                if (bVar2 == null) {
                    break;
                }
                i11++;
            }
            b bVar3 = this;
            while (true) {
                h hVar2 = bVar3.f20618a;
                bVar3 = hVar2 instanceof b ? (b) hVar2 : null;
                if (bVar3 == null) {
                    break;
                }
                i10++;
            }
            if (i11 == i10) {
                b bVar4 = this;
                while (true) {
                    f fVar = bVar4.f20619d;
                    if (!l.a(bVar.Y(fVar.getKey()), fVar)) {
                        zA = false;
                        break;
                    }
                    h hVar3 = bVar4.f20618a;
                    if (!(hVar3 instanceof b)) {
                        l.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f fVar2 = (f) hVar3;
                        zA = l.a(bVar.Y(fVar2.getKey()), fVar2);
                        break;
                    }
                    bVar4 = (b) hVar3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20619d.hashCode() + this.f20618a.hashCode();
    }

    @Override // pq.h
    public final h i0(h hVar) {
        l.e(hVar, "context");
        return hVar == i.f20621a ? this : (h) hVar.Z(new il.a(27), this);
    }

    @Override // pq.h
    public final h q(g gVar) {
        l.e(gVar, "key");
        f fVar = this.f20619d;
        f fVarY = fVar.Y(gVar);
        h hVar = this.f20618a;
        if (fVarY != null) {
            return hVar;
        }
        h hVarQ = hVar.q(gVar);
        return hVarQ == hVar ? this : hVarQ == i.f20621a ? fVar : new b(fVar, hVarQ);
    }

    public final String toString() {
        return h0.b.r(new StringBuilder("["), (String) Z(new il.a(26), ""), ']');
    }
}
