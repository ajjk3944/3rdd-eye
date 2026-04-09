package dt;

import java.util.List;

/* loaded from: classes.dex */
public final class p extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7521d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t f7522g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ rs.b f7523r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a f7524x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(t tVar, rs.b bVar, a aVar, int i10) {
        super(0);
        this.f7521d = i10;
        this.f7522g = tVar;
        this.f7523r = bVar;
        this.f7524x = aVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f7521d) {
            case 0:
                t tVar = this.f7522g;
                al.b bVar = tVar.f7538a;
                w wVarA = tVar.a((rr.l) bVar.f812d);
                List listQ0 = wVarA != null ? mq.o.Q0(((k) bVar.f810b).f7497e.c(wVarA, this.f7523r, this.f7524x)) : null;
                if (listQ0 == null) {
                    break;
                }
                break;
            default:
                t tVar2 = this.f7522g;
                al.b bVar2 = tVar2.f7538a;
                w wVarA2 = tVar2.a((rr.l) bVar2.f812d);
                List listT = wVarA2 != null ? ((k) bVar2.f810b).f7497e.t(wVarA2, this.f7523r, this.f7524x) : null;
                if (listT == null) {
                    break;
                }
                break;
        }
        return mq.w.f16945a;
    }
}
