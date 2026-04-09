package x1;

/* loaded from: classes.dex */
public final class b extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24768d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f24769g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i10) {
        super(0);
        this.f24768d = i10;
        this.f24769g = cVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f24768d) {
            case 0:
                this.f24769g.f0();
                return lq.b0.f15562a;
            default:
                c cVar = this.f24769g;
                z0.k kVar = cVar.f24776p;
                br.l.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                c0.m mVar = (c0.m) kVar;
                c0.q qVar = (c0.q) cVar.B(c0.b0.f3064a);
                if (br.l.a(qVar, mVar.f3094a)) {
                    return lq.b0.f15562a;
                }
                mVar.f3094a = qVar;
                throw null;
        }
    }
}
