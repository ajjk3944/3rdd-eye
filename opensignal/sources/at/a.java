package at;

import com.google.android.gms.internal.measurement.y3;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import mq.t;
import mq.w;
import mq.y;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: b, reason: collision with root package name */
    public final String f2265b;

    /* renamed from: c, reason: collision with root package name */
    public final n[] f2266c;

    public a(String str, n[] nVarArr) {
        this.f2265b = str;
        this.f2266c = nVarArr;
    }

    @Override // at.p
    public final Collection a(f fVar, ar.k kVar) {
        br.l.e(fVar, "kindFilter");
        n[] nVarArr = this.f2266c;
        int length = nVarArr.length;
        if (length == 0) {
            return w.f16945a;
        }
        if (length == 1) {
            return nVarArr[0].a(fVar, kVar);
        }
        Collection collectionH = null;
        for (n nVar : nVarArr) {
            collectionH = y3.h(collectionH, nVar.a(fVar, kVar));
        }
        return collectionH == null ? y.f16947a : collectionH;
    }

    @Override // at.n
    public final Collection b(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        n[] nVarArr = this.f2266c;
        int length = nVarArr.length;
        if (length == 0) {
            return w.f16945a;
        }
        if (length == 1) {
            return nVarArr[0].b(gVar, bVar);
        }
        Collection collectionH = null;
        for (n nVar : nVarArr) {
            collectionH = y3.h(collectionH, nVar.b(gVar, bVar));
        }
        return collectionH == null ? y.f16947a : collectionH;
    }

    @Override // at.p
    public final rr.i c(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        rr.i iVar = null;
        for (n nVar : this.f2266c) {
            rr.i iVarC = nVar.c(gVar, bVar);
            if (iVarC != null) {
                if (!(iVarC instanceof rr.j) || !((rr.j) iVarC).M()) {
                    return iVarC;
                }
                if (iVar == null) {
                    iVar = iVarC;
                }
            }
        }
        return iVar;
    }

    @Override // at.n
    public final Set d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar : this.f2266c) {
            t.d0(linkedHashSet, nVar.d());
        }
        return linkedHashSet;
    }

    @Override // at.n
    public final Set e() {
        n[] nVarArr = this.f2266c;
        br.l.e(nVarArr, "<this>");
        return dr.a.o(nVarArr.length == 0 ? w.f16945a : new iu.g(1, nVarArr));
    }

    @Override // at.n
    public final Collection f(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        n[] nVarArr = this.f2266c;
        int length = nVarArr.length;
        if (length == 0) {
            return w.f16945a;
        }
        if (length == 1) {
            return nVarArr[0].f(gVar, bVar);
        }
        Collection collectionH = null;
        for (n nVar : nVarArr) {
            collectionH = y3.h(collectionH, nVar.f(gVar, bVar));
        }
        return collectionH == null ? y.f16947a : collectionH;
    }

    @Override // at.n
    public final Set g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar : this.f2266c) {
            t.d0(linkedHashSet, nVar.g());
        }
        return linkedHashSet;
    }

    public final String toString() {
        return this.f2265b;
    }
}
