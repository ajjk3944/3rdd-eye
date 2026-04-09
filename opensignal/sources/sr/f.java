package sr;

import java.util.Iterator;
import mq.v;

/* loaded from: classes.dex */
public final class f implements h {
    @Override // sr.h
    public final boolean G(qs.c cVar) {
        return ba.m.A(this, cVar);
    }

    @Override // sr.h
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return v.f16944a;
    }

    public final String toString() {
        return "EMPTY";
    }

    @Override // sr.h
    public final b w(qs.c cVar) {
        br.l.e(cVar, "fqName");
        return null;
    }
}
