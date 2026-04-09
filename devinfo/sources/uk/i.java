package uk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zj.s;

/* loaded from: classes3.dex */
public abstract class i extends jm.a {
    /* JADX WARN: Multi-variable type inference failed */
    public static f G(j jVar, int i4) {
        if (i4 >= 0) {
            return i4 == 0 ? jVar : jVar instanceof c ? ((c) jVar).a(i4) : new b(jVar, i4);
        }
        throw new IllegalArgumentException(r5.c.h(i4, "Requested element count ", " is less than zero.").toString());
    }

    public static String H(f fVar, String str) {
        nk.k.e(fVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int i4 = 0;
        for (Object obj : fVar) {
            i4++;
            if (i4 > 1) {
                sb2.append((CharSequence) str);
            }
            com.bumptech.glide.e.l(sb2, obj, null);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    public static List I(f fVar) {
        Iterator it = fVar.iterator();
        if (!it.hasNext()) {
            return s.f38317a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return cm.g.s(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
