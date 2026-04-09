package y0;

import ar.n;
import java.util.List;
import n0.p;
import o0.g0;

/* loaded from: classes.dex */
public final class b implements g0, pq.f {

    /* renamed from: d, reason: collision with root package name */
    public static final sm.f f25613d = new sm.f(29);

    /* renamed from: a, reason: collision with root package name */
    public final p f25614a;

    public b(p pVar) {
        this.f25614a = pVar;
    }

    @Override // pq.h
    public final pq.f Y(pq.g gVar) {
        return se.b.y(this, gVar);
    }

    @Override // pq.h
    public final Object Z(n nVar, Object obj) {
        return nVar.w(obj, this);
    }

    @Override // o0.g0
    public final List c(Integer num) {
        return this.f25614a.B();
    }

    @Override // pq.f
    public final pq.g getKey() {
        return f25613d;
    }

    @Override // pq.h
    public final pq.h i0(pq.h hVar) {
        return se.b.M(this, hVar);
    }

    @Override // pq.h
    public final pq.h q(pq.g gVar) {
        return se.b.L(this, gVar);
    }
}
