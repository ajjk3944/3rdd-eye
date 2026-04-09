package a0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mk.c f106b;

    public /* synthetic */ p0(mk.c cVar, int i4) {
        this.f105a = i4;
        this.f106b = cVar;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f105a) {
            case 0:
                mk.c cVar = this.f106b;
                Long l10 = (Long) obj;
                l10.longValue();
                return cVar.invoke(l10);
            default:
                g1.g gVar = (g1.g) this.f106b.invoke((g1.k) obj);
                synchronized (g1.m.f24260c) {
                    g1.m.f24261d = g1.m.f24261d.g(gVar.g());
                }
                return gVar;
        }
    }
}
