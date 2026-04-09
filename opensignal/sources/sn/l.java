package sn;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l extends c {

    /* renamed from: a, reason: collision with root package name */
    public final long f22164a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22165b;

    /* renamed from: c, reason: collision with root package name */
    public final rn.a f22166c;

    public l(long j, ArrayList arrayList, rn.a aVar) {
        br.l.e(aVar, "groupOperator");
        this.f22164a = j;
        this.f22165b = arrayList;
        this.f22166c = aVar;
    }

    @Override // sn.c
    public final long a() {
        return this.f22164a;
    }

    @Override // sn.c
    public final boolean b(un.j jVar) {
        if (!(jVar instanceof un.g)) {
            return false;
        }
        un.g gVar = (un.g) jVar;
        if (gVar.f23606a != this.f22164a) {
            return false;
        }
        int i10 = k.f22163a[this.f22166c.ordinal()];
        ArrayList arrayList = this.f22165b;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new bf.n();
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((tn.n) it.next()).a(gVar)) {
                }
            }
            return false;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((tn.n) it2.next()).a(gVar)) {
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
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f22164a == lVar.f22164a && this.f22165b.equals(lVar.f22165b) && this.f22166c == lVar.f22166c;
    }

    public final int hashCode() {
        return this.f22166c.hashCode() + ((this.f22165b.hashCode() + (Long.hashCode(this.f22164a) * 31)) * 31);
    }

    public final String toString() {
        return "RangeDisplayLogic(pointId=" + this.f22164a + ", groups=" + this.f22165b + ", groupOperator=" + this.f22166c + ')';
    }
}
