package nm;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f30109a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30110b;

    /* renamed from: c, reason: collision with root package name */
    public final b2.b f30111c;

    public o(e0 e0Var, Object obj, b2.b bVar) {
        nk.k.e(e0Var, "reorderableLazyCollectionState");
        nk.k.e(obj, "key");
        this.f30109a = e0Var;
        this.f30110b = obj;
        this.f30111c = bVar;
    }

    public final i1.n a(mk.c cVar, mk.a aVar, d dVar) {
        nk.k.e(cVar, "onDragStarted");
        nk.k.e(aVar, "onDragStopped");
        nk.k.e(dVar, "dragGestureDetector");
        return new i1.h(new n(this, dVar, cVar, aVar));
    }
}
