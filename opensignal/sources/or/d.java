package or;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f19666a;

    static {
        Set<k> set = k.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(mq.p.a0(set, 10));
        for (k kVar : set) {
            br.l.e(kVar, "primitiveType");
            arrayList.add(o.j.c(kVar.getTypeName()));
        }
        ArrayList arrayListF0 = mq.o.F0(mq.o.F0(mq.o.F0(arrayList, n.f19694f.g()), n.f19696h.g()), n.j.g());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayListF0.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(qs.b.j((qs.c) it.next()));
        }
        f19666a = linkedHashSet;
    }
}
