package pf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v0 implements rf.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31906a;

    /* renamed from: b, reason: collision with root package name */
    public final xj.a f31907b;

    /* renamed from: c, reason: collision with root package name */
    public final rf.d f31908c;

    public /* synthetic */ v0(rf.d dVar, rf.d dVar2, int i4) {
        this.f31906a = i4;
        this.f31907b = dVar;
        this.f31908c = dVar2;
    }

    @Override // xj.a
    public final Object get() {
        switch (this.f31906a) {
            case 0:
                return new u0((g1) this.f31907b.get(), (h1) this.f31908c.get());
            default:
                return new sf.j((sf.o) this.f31907b.get(), (sf.o) this.f31908c.get());
        }
    }
}
