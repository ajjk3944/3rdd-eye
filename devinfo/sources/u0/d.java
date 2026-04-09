package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends c1.c {

    /* renamed from: a, reason: collision with root package name */
    public xk.h f34760a;

    /* renamed from: b, reason: collision with root package name */
    public mk.c f34761b;

    @Override // c1.c
    public final void a() {
        this.f34761b = null;
        this.f34760a = null;
    }

    @Override // c1.c
    public final void b(Throwable th2) {
        xk.h hVar = this.f34760a;
        if (hVar != null) {
            hVar.resumeWith(ci.b.h(th2));
        }
    }
}
