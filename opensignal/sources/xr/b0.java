package xr;

import ir.f0;
import java.lang.reflect.Type;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class b0 implements hs.d {
    @Override // hs.b
    public e a(qs.c cVar) {
        Object next;
        br.l.e(cVar, "fqName");
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (d.a(f0.D(f0.z(((e) next).f25501a))).b().equals(cVar)) {
                break;
            }
        }
        return (e) next;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        return (obj instanceof b0) && br.l.a(b(), ((b0) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
