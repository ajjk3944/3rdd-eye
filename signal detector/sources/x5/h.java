package x5;

import a4.p;
import d5.q;
import d5.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p5.l;

/* loaded from: classes3.dex */
public abstract class h extends i {
    public static g K(Iterator it) {
        q5.i.e(it, "<this>");
        return new a(new q(2, it));
    }

    public static g L(Object obj, l lVar) {
        return obj == null ? b.f24186a : new f(0, new D4.c(14, obj), lVar);
    }

    public static List M(g gVar) {
        Iterator it = gVar.iterator();
        if (!it.hasNext()) {
            return s.f19824a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return p.l(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
