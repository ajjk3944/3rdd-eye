package rr;

/* loaded from: classes.dex */
public final class g0 extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21688d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qs.c f21689g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(qs.c cVar, int i10) {
        super(1);
        this.f21688d = i10;
        this.f21689g = cVar;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f21688d) {
            case 0:
                qs.c cVar = (qs.c) obj;
                br.l.e(cVar, "it");
                return Boolean.valueOf(!cVar.d() && cVar.e().equals(this.f21689g));
            default:
                sr.h hVar = (sr.h) obj;
                br.l.e(hVar, "it");
                return hVar.w(this.f21689g);
        }
    }
}
