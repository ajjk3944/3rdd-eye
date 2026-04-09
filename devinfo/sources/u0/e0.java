package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public final mk.c f34773a;

    /* renamed from: b, reason: collision with root package name */
    public f0 f34774b;

    public e0(mk.c cVar) {
        this.f34773a = cVar;
    }

    @Override // u0.u1
    public final void b() {
        f0 f0Var = this.f34774b;
        if (f0Var != null) {
            f0Var.a();
        }
        this.f34774b = null;
    }

    @Override // u0.u1
    public final void d() {
        this.f34774b = (f0) this.f34773a.invoke(q.f34934c);
    }

    @Override // u0.u1
    public final void a() {
    }
}
