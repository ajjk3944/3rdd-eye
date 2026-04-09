package sn;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: a, reason: collision with root package name */
    public final long f22152a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22153b;

    /* renamed from: c, reason: collision with root package name */
    public final rn.a f22154c;

    public f(long j, ArrayList arrayList, rn.a aVar) {
        br.l.e(aVar, "groupOperator");
        this.f22152a = j;
        this.f22153b = arrayList;
        this.f22154c = aVar;
    }

    @Override // sn.c
    public final long a() {
        return this.f22152a;
    }

    @Override // sn.c
    public final boolean b(un.j jVar) {
        if (!(jVar instanceof un.d)) {
            return false;
        }
        un.d dVar = (un.d) jVar;
        if (dVar.f23600a != this.f22152a) {
            return false;
        }
        int i10 = e.f22151a[this.f22154c.ordinal()];
        ArrayList arrayList = this.f22153b;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new bf.n();
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((tn.f) it.next()).a(dVar)) {
                }
            }
            return false;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((tn.f) it2.next()).a(dVar)) {
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
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f22152a == fVar.f22152a && this.f22153b.equals(fVar.f22153b) && this.f22154c == fVar.f22154c;
    }

    public final int hashCode() {
        return this.f22154c.hashCode() + ((this.f22153b.hashCode() + (Long.hashCode(this.f22152a) * 31)) * 31);
    }

    public final String toString() {
        return "FormDisplayLogic(pointId=" + this.f22152a + ", groups=" + this.f22153b + ", groupOperator=" + this.f22154c + ')';
    }
}
