package es;

/* loaded from: classes.dex */
public final class m extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8314d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f8315g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(p pVar, int i10) {
        super(1);
        this.f8314d = i10;
        this.f8315g = pVar;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f8314d) {
            case 0:
                qs.g gVar = (qs.g) obj;
                br.l.e(gVar, "it");
                return p.v(this.f8315g, gVar);
            default:
                qs.g gVar2 = (qs.g) obj;
                br.l.e(gVar2, "it");
                return p.w(this.f8315g, gVar2);
        }
    }
}
