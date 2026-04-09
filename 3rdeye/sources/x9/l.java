package x9;

import E.u;
import c9.C2079C;
import c9.C2096q;
import c9.C2099t;
import c9.C2101v;
import g0.C4356c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: _Sequences.kt */
/* loaded from: classes3.dex */
public class l extends j {
    /* JADX WARN: Multi-variable type inference failed */
    public static g E(C2096q c2096q, int i) {
        if (i >= 0) {
            return i == 0 ? c2096q : c2096q instanceof InterfaceC5785c ? ((InterfaceC5785c) c2096q).a(i) : new C5784b(c2096q, i);
        }
        throw new IllegalArgumentException(C4356c.i(i, "Requested element count ", " is less than zero.").toString());
    }

    public static C5786d F(g gVar, p9.l predicate) {
        kotlin.jvm.internal.l.f(predicate, "predicate");
        return new C5786d(gVar, true, predicate);
    }

    public static <T> T G(g<? extends T> gVar) {
        Iterator<? extends T> it = gVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static e H(C2096q c2096q, p9.l lVar) {
        return new e(c2096q, lVar, k.f47847b);
    }

    public static String I(g gVar, String str, p9.l lVar, int i) {
        if ((i & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.l.f(gVar, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i10 = 0;
        for (Object obj : gVar) {
            i10++;
            if (i10 > 1) {
                sb.append((CharSequence) str);
            }
            com.google.gson.internal.c.d(sb, obj, lVar);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static m J(g gVar, p9.l transform) {
        kotlin.jvm.internal.l.f(transform, "transform");
        return new m(gVar, transform);
    }

    public static C5786d K(g gVar, p9.l transform) {
        kotlin.jvm.internal.l.f(transform, "transform");
        return new C5786d(new m(gVar, transform), false, new A8.d(4));
    }

    public static <T> List<T> L(g<? extends T> gVar) {
        Iterator<? extends T> it = gVar.iterator();
        if (!it.hasNext()) {
            return C2099t.f18581b;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return u.G(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static <T> Set<T> M(g<? extends T> gVar) {
        Iterator<? extends T> it = gVar.iterator();
        if (!it.hasNext()) {
            return C2101v.f18583b;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return C2079C.d(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}
