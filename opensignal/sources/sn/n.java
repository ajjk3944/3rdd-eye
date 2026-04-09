package sn;

import java.util.ArrayList;
import java.util.Iterator;
import tn.q;

/* loaded from: classes.dex */
public final class n extends c {

    /* renamed from: a, reason: collision with root package name */
    public final long f22168a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22169b;

    /* renamed from: c, reason: collision with root package name */
    public final rn.a f22170c;

    public n(long j, ArrayList arrayList, rn.a aVar) {
        br.l.e(aVar, "groupOperator");
        this.f22168a = j;
        this.f22169b = arrayList;
        this.f22170c = aVar;
    }

    @Override // sn.c
    public final long a() {
        return this.f22168a;
    }

    @Override // sn.c
    public final boolean b(un.j jVar) {
        if (!(jVar instanceof un.h)) {
            return false;
        }
        un.h hVar = (un.h) jVar;
        if (hVar.f23608a != this.f22168a) {
            return false;
        }
        int i10 = m.f22167a[this.f22170c.ordinal()];
        ArrayList arrayList = this.f22169b;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new bf.n();
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((q) it.next()).a(hVar)) {
                }
            }
            return false;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((q) it2.next()).a(hVar)) {
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
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f22168a == nVar.f22168a && this.f22169b.equals(nVar.f22169b) && this.f22170c == nVar.f22170c;
    }

    public final int hashCode() {
        return this.f22170c.hashCode() + ((this.f22169b.hashCode() + (Long.hashCode(this.f22168a) * 31)) * 31);
    }

    public final String toString() {
        return "SingleChoiceDisplayLogic(pointId=" + this.f22168a + ", groups=" + this.f22169b + ", groupOperator=" + this.f22170c + ')';
    }
}
