package pq;

import ar.n;
import br.l;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class i implements h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final i f20621a = new i();

    @Override // pq.h
    public final f Y(g gVar) {
        l.e(gVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // pq.h
    public final h i0(h hVar) {
        l.e(hVar, "context");
        return hVar;
    }

    @Override // pq.h
    public final h q(g gVar) {
        l.e(gVar, "key");
        return this;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // pq.h
    public final Object Z(n nVar, Object obj) {
        return obj;
    }
}
