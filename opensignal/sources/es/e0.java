package es;

/* loaded from: classes.dex */
public final class e0 extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8288d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qs.g f8289g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(qs.g gVar, int i10) {
        super(1);
        this.f8288d = i10;
        this.f8289g = gVar;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f8288d) {
            case 0:
                at.n nVar = (at.n) obj;
                br.l.e(nVar, "it");
                return nVar.b(this.f8289g, zr.d.WHEN_GET_SUPER_MEMBERS);
            default:
                at.n nVar2 = (at.n) obj;
                br.l.e(nVar2, "it");
                return nVar2.f(this.f8289g, zr.d.FROM_BUILTINS);
        }
    }
}
