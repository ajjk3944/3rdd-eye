package sn;

import java.util.ArrayList;
import java.util.Iterator;
import tn.t;

/* loaded from: classes.dex */
public final class p extends c {

    /* renamed from: a, reason: collision with root package name */
    public final long f22172a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22173b;

    /* renamed from: c, reason: collision with root package name */
    public final rn.a f22174c;

    public p(long j, ArrayList arrayList, rn.a aVar) {
        br.l.e(aVar, "groupOperator");
        this.f22172a = j;
        this.f22173b = arrayList;
        this.f22174c = aVar;
    }

    @Override // sn.c
    public final long a() {
        return this.f22172a;
    }

    @Override // sn.c
    public final boolean b(un.j jVar) {
        if (!(jVar instanceof un.i)) {
            return false;
        }
        un.i iVar = (un.i) jVar;
        if (iVar.f23610a != this.f22172a) {
            return false;
        }
        int i10 = o.f22171a[this.f22174c.ordinal()];
        ArrayList arrayList = this.f22173b;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new bf.n();
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((t) it.next()).a(iVar)) {
                }
            }
            return false;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((t) it2.next()).a(iVar)) {
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
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f22172a == pVar.f22172a && this.f22173b.equals(pVar.f22173b) && this.f22174c == pVar.f22174c;
    }

    public final int hashCode() {
        return this.f22174c.hashCode() + ((this.f22173b.hashCode() + (Long.hashCode(this.f22172a) * 31)) * 31);
    }

    public final String toString() {
        return "TextDisplayLogic(pointId=" + this.f22172a + ", groups=" + this.f22173b + ", groupOperator=" + this.f22174c + ')';
    }
}
