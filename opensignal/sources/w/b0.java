package w;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements ar.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24091a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ar.k f24092d;

    public /* synthetic */ b0(ar.k kVar, int i10) {
        this.f24091a = i10;
        this.f24092d = kVar;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f24091a) {
            case 0:
                ar.k kVar = this.f24092d;
                Long l10 = (Long) obj;
                l10.longValue();
                return kVar.a(l10);
            default:
                x0.f fVar = (x0.f) this.f24092d.a((x0.j) obj);
                synchronized (x0.l.f24717c) {
                    x0.l.f24718d = x0.l.f24718d.e(fVar.g());
                }
                return fVar;
        }
    }
}
