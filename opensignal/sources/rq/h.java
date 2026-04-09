package rq;

/* loaded from: classes.dex */
public abstract class h extends a {
    public h(pq.c cVar) {
        super(cVar);
        if (cVar != null && cVar.m() != pq.i.f20621a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // pq.c
    public final pq.h m() {
        return pq.i.f20621a;
    }
}
