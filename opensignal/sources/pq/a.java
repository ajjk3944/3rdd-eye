package pq;

import ar.n;

/* loaded from: classes.dex */
public abstract class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final g f20617a;

    public a(g gVar) {
        this.f20617a = gVar;
    }

    @Override // pq.h
    public /* bridge */ f Y(g gVar) {
        return se.b.y(this, gVar);
    }

    @Override // pq.h
    public final Object Z(n nVar, Object obj) {
        return nVar.w(obj, this);
    }

    @Override // pq.f
    public final g getKey() {
        return this.f20617a;
    }

    @Override // pq.h
    public final /* bridge */ h i0(h hVar) {
        return se.b.M(this, hVar);
    }

    @Override // pq.h
    public /* bridge */ h q(g gVar) {
        return se.b.L(this, gVar);
    }
}
