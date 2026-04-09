package bf;

/* loaded from: classes.dex */
public final class s implements eg.b {

    /* renamed from: c, reason: collision with root package name */
    public static final ab.c f2738c = new ab.c(19);

    /* renamed from: d, reason: collision with root package name */
    public static final g f2739d = new g(1);

    /* renamed from: a, reason: collision with root package name */
    public eg.a f2740a;

    /* renamed from: b, reason: collision with root package name */
    public volatile eg.b f2741b;

    public s(ab.c cVar, eg.b bVar) {
        this.f2740a = cVar;
        this.f2741b = bVar;
    }

    public final void a(eg.a aVar) {
        eg.b bVar;
        eg.b bVar2;
        eg.b bVar3 = this.f2741b;
        g gVar = f2739d;
        if (bVar3 != gVar) {
            aVar.k(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f2741b;
            if (bVar != gVar) {
                bVar2 = bVar;
            } else {
                this.f2740a = new androidx.media3.exoplayer.trackselection.h(this.f2740a, 2, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.k(bVar);
        }
    }

    @Override // eg.b
    public final Object get() {
        return this.f2741b.get();
    }
}
