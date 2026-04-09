package bl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b0 implements ck.c, ek.d {

    /* renamed from: a, reason: collision with root package name */
    public final ck.c f2282a;

    /* renamed from: b, reason: collision with root package name */
    public final ck.h f2283b;

    public b0(ck.c cVar, ck.h hVar) {
        this.f2282a = cVar;
        this.f2283b = hVar;
    }

    @Override // ek.d
    public final ek.d getCallerFrame() {
        ck.c cVar = this.f2282a;
        if (cVar instanceof ek.d) {
            return (ek.d) cVar;
        }
        return null;
    }

    @Override // ck.c
    public final ck.h getContext() {
        return this.f2283b;
    }

    @Override // ck.c
    public final void resumeWith(Object obj) {
        this.f2282a.resumeWith(obj);
    }
}
