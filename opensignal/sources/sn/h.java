package sn;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h extends c {

    /* renamed from: a, reason: collision with root package name */
    public final long f22156a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22157b;

    /* renamed from: c, reason: collision with root package name */
    public final rn.a f22158c;

    public h(long j, ArrayList arrayList, rn.a aVar) {
        br.l.e(aVar, "groupOperator");
        this.f22156a = j;
        this.f22157b = arrayList;
        this.f22158c = aVar;
    }

    @Override // sn.c
    public final long a() {
        return this.f22156a;
    }

    @Override // sn.c
    public final boolean b(un.j jVar) {
        if (!(jVar instanceof un.e)) {
            return false;
        }
        un.e eVar = (un.e) jVar;
        if (eVar.f23602a != this.f22156a) {
            return false;
        }
        int i10 = g.f22155a[this.f22158c.ordinal()];
        ArrayList arrayList = this.f22157b;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new bf.n();
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((tn.g) it.next()).a(eVar)) {
                }
            }
            return false;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((tn.g) it2.next()).a(eVar)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f22156a == hVar.f22156a && this.f22157b.equals(hVar.f22157b) && this.f22158c == hVar.f22158c;
    }

    public final int hashCode() {
        return this.f22158c.hashCode() + ((this.f22157b.hashCode() + (Long.hashCode(this.f22156a) * 31)) * 31);
    }

    public final String toString() {
        return "MatrixDisplayLogic(pointId=" + this.f22156a + ", groups=" + this.f22157b + ", groupOperator=" + this.f22158c + ')';
    }
}
