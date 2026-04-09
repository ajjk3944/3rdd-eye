package rr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21690a;

    public h0(ArrayList arrayList) {
        this.f21690a = arrayList;
    }

    @Override // rr.i0
    public final boolean a(qs.c cVar) {
        br.l.e(cVar, "fqName");
        ArrayList arrayList = this.f21690a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (br.l.a(((ur.c0) ((f0) it.next())).f23629y, cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // rr.i0
    public final void b(qs.c cVar, ArrayList arrayList) {
        br.l.e(cVar, "fqName");
        for (Object obj : this.f21690a) {
            if (br.l.a(((ur.c0) ((f0) obj)).f23629y, cVar)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // rr.i0
    public final Collection l(qs.c cVar, ar.k kVar) {
        br.l.e(cVar, "fqName");
        return st.l.d0(new st.f(st.l.b0(mq.o.j0(this.f21690a), s.f21715r), true, new g0(cVar, 0)));
    }
}
