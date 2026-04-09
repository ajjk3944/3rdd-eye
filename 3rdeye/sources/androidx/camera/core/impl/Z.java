package androidx.camera.core.impl;

import androidx.camera.core.impl.X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0.b;

/* compiled from: DeferrableSurfaces.java */
/* loaded from: classes.dex */
public final class Z {
    public static void a(List<X> list) {
        Iterator<X> it = list.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public static void b(List<X> list) throws X.a {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                list.get(i).d();
                i++;
            } catch (X.a e4) {
                for (int i10 = i - 1; i10 >= 0; i10--) {
                    list.get(i10).b();
                }
                throw e4;
            }
        } while (i < list.size());
    }

    public static b.d c(List list, H.g gVar, H.c cVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(I.j.f(((X) it.next()).c()));
        }
        return o0.b.a(new D3.b(o0.b.a(new I.e(I.j.i(arrayList), cVar, 5000L)), gVar, list));
    }
}
