package sn;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final long f22147a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22148b;

    /* renamed from: c, reason: collision with root package name */
    public final rn.a f22149c;

    public b(long j, ArrayList arrayList, rn.a aVar) {
        br.l.e(aVar, "groupOperator");
        this.f22147a = j;
        this.f22148b = arrayList;
        this.f22149c = aVar;
    }

    @Override // sn.c
    public final long a() {
        return this.f22147a;
    }

    @Override // sn.c
    public final boolean b(un.j jVar) {
        if (!(jVar instanceof un.c)) {
            return false;
        }
        un.c cVar = (un.c) jVar;
        if (cVar.f23598a != this.f22147a) {
            return false;
        }
        int i10 = a.f22146a[this.f22149c.ordinal()];
        ArrayList arrayList = this.f22148b;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new bf.n();
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((tn.b) it.next()).a(cVar)) {
                }
            }
            return false;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((tn.b) it2.next()).a(cVar)) {
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
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f22147a == bVar.f22147a && this.f22148b.equals(bVar.f22148b) && this.f22149c == bVar.f22149c;
    }

    public final int hashCode() {
        return this.f22149c.hashCode() + ((this.f22148b.hashCode() + (Long.hashCode(this.f22147a) * 31)) * 31);
    }

    public final String toString() {
        return "DateDisplayLogic(pointId=" + this.f22147a + ", groups=" + this.f22148b + ", groupOperator=" + this.f22149c + ')';
    }
}
