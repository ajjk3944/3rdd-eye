package ek;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class h extends a {
    public h(ck.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != ck.i.f2898a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // ck.c
    public ck.h getContext() {
        return ck.i.f2898a;
    }
}
