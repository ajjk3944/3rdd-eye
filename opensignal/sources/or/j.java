package or;

/* loaded from: classes.dex */
public final class j extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19677d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f19678g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i10) {
        super(0);
        this.f19677d = i10;
        this.f19678g = kVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f19677d) {
            case 0:
                return o.j.c(this.f19678g.getArrayTypeName());
            default:
                return o.j.c(this.f19678g.getTypeName());
        }
    }
}
