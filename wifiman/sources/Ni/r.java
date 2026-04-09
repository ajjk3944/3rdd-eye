package Ni;

import Ii.H0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import zi.AbstractC8783m;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f16621a;

    /* renamed from: b, reason: collision with root package name */
    public static final H0 f16622b;

    static {
        r rVar = new r();
        f16621a = rVar;
        D.f("kotlinx.coroutines.fast.service.loader", true);
        f16622b = rVar.a();
    }

    private r() {
    }

    private final H0 a() {
        Object next;
        H0 h0E;
        try {
            List listZ = AbstractC8783m.Z(AbstractC8783m.g(ServiceLoader.load(q.class, q.class.getClassLoader()).iterator()));
            Iterator it = listZ.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((q) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((q) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            q qVar = (q) next;
            if (qVar != null && (h0E = s.e(qVar, listZ)) != null) {
                return h0E;
            }
            s.b(null, null, 3, null);
            return null;
        } catch (Throwable th2) {
            s.b(th2, null, 2, null);
            return null;
        }
    }
}
