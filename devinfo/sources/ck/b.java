package ck;

import bl.v;
import java.io.Serializable;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final h f2895a;

    /* renamed from: b, reason: collision with root package name */
    public final f f2896b;

    public b(f fVar, h hVar) {
        k.e(hVar, "left");
        k.e(fVar, "element");
        this.f2895a = hVar;
        this.f2896b = fVar;
    }

    @Override // ck.h
    public final Object G(Object obj, mk.e eVar) {
        return eVar.invoke(this.f2895a.G(obj, eVar), this.f2896b);
    }

    @Override // ck.h
    public final h L(g gVar) {
        k.e(gVar, "key");
        f fVar = this.f2896b;
        f fVarO = fVar.O(gVar);
        h hVar = this.f2895a;
        if (fVarO != null) {
            return hVar;
        }
        h hVarL = hVar.L(gVar);
        return hVarL == hVar ? this : hVarL == i.f2898a ? fVar : new b(fVar, hVarL);
    }

    @Override // ck.h
    public final f O(g gVar) {
        k.e(gVar, "key");
        b bVar = this;
        while (true) {
            f fVarO = bVar.f2896b.O(gVar);
            if (fVarO != null) {
                return fVarO;
            }
            h hVar = bVar.f2895a;
            if (!(hVar instanceof b)) {
                return hVar.O(gVar);
            }
            bVar = (b) hVar;
        }
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int i4 = 2;
            b bVar2 = bVar;
            int i10 = 2;
            while (true) {
                h hVar = bVar2.f2895a;
                bVar2 = hVar instanceof b ? (b) hVar : null;
                if (bVar2 == null) {
                    break;
                }
                i10++;
            }
            b bVar3 = this;
            while (true) {
                h hVar2 = bVar3.f2895a;
                bVar3 = hVar2 instanceof b ? (b) hVar2 : null;
                if (bVar3 == null) {
                    break;
                }
                i4++;
            }
            if (i10 == i4) {
                b bVar4 = this;
                while (true) {
                    f fVar = bVar4.f2896b;
                    if (!k.a(bVar.O(fVar.getKey()), fVar)) {
                        zA = false;
                        break;
                    }
                    h hVar3 = bVar4.f2895a;
                    if (!(hVar3 instanceof b)) {
                        k.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f fVar2 = (f) hVar3;
                        zA = k.a(bVar.O(fVar2.getKey()), fVar2);
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
        return this.f2896b.hashCode() + this.f2895a.hashCode();
    }

    public final String toString() {
        return r5.c.l(new StringBuilder("["), (String) G("", new v(1)), ']');
    }

    @Override // ck.h
    public final h y(h hVar) {
        k.e(hVar, "context");
        return hVar == i.f2898a ? this : (h) hVar.G(this, new v(2));
    }
}
