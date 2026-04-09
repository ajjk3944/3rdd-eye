package sn;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j extends c {

    /* renamed from: a, reason: collision with root package name */
    public final long f22160a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22161b;

    /* renamed from: c, reason: collision with root package name */
    public final rn.a f22162c;

    public j(long j, ArrayList arrayList, rn.a aVar) {
        br.l.e(aVar, "groupOperator");
        this.f22160a = j;
        this.f22161b = arrayList;
        this.f22162c = aVar;
    }

    @Override // sn.c
    public final long a() {
        return this.f22160a;
    }

    @Override // sn.c
    public final boolean b(un.j jVar) {
        if (!(jVar instanceof un.f)) {
            return false;
        }
        un.f fVar = (un.f) jVar;
        if (fVar.f23604a != this.f22160a) {
            return false;
        }
        int i10 = i.f22159a[this.f22162c.ordinal()];
        ArrayList arrayList = this.f22161b;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new bf.n();
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((tn.k) it.next()).a(fVar)) {
                }
            }
            return false;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((tn.k) it2.next()).a(fVar)) {
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
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f22160a == jVar.f22160a && this.f22161b.equals(jVar.f22161b) && this.f22162c == jVar.f22162c;
    }

    public final int hashCode() {
        return this.f22162c.hashCode() + ((this.f22161b.hashCode() + (Long.hashCode(this.f22160a) * 31)) * 31);
    }

    public final String toString() {
        return "MultipleChoiceDisplayLogic(pointId=" + this.f22160a + ", groups=" + this.f22161b + ", groupOperator=" + this.f22162c + ')';
    }
}
