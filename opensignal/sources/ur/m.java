package ur;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class m implements rr.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f23650a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23651b;

    public m(List list, String str) {
        br.l.e(str, "debugName");
        this.f23650a = list;
        this.f23651b = str;
        list.size();
        mq.o.U0(list).size();
    }

    @Override // rr.i0
    public final boolean a(qs.c cVar) {
        br.l.e(cVar, "fqName");
        List list = this.f23650a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!rr.w.h((rr.i0) it.next(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // rr.i0
    public final void b(qs.c cVar, ArrayList arrayList) {
        br.l.e(cVar, "fqName");
        Iterator it = this.f23650a.iterator();
        while (it.hasNext()) {
            rr.w.b((rr.i0) it.next(), cVar, arrayList);
        }
    }

    @Override // rr.i0
    public final Collection l(qs.c cVar, ar.k kVar) {
        br.l.e(cVar, "fqName");
        HashSet hashSet = new HashSet();
        Iterator it = this.f23650a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((rr.i0) it.next()).l(cVar, kVar));
        }
        return hashSet;
    }

    public final String toString() {
        return this.f23651b;
    }
}
