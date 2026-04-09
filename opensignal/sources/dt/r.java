package dt;

import ls.g0;

/* loaded from: classes.dex */
public final class r extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7529d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t f7530g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g0 f7531r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ft.s f7532x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(t tVar, g0 g0Var, ft.s sVar, int i10) {
        super(0);
        this.f7529d = i10;
        this.f7530g = tVar;
        this.f7531r = g0Var;
        this.f7532x = sVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f7529d) {
            case 0:
                t tVar = this.f7530g;
                al.b bVar = tVar.f7538a;
                w wVarA = tVar.a((rr.l) bVar.f812d);
                br.l.b(wVarA);
                b bVar2 = ((k) bVar.f810b).f7497e;
                ht.x xVarI = this.f7532x.i();
                br.l.d(xVarI, "property.returnType");
                return (vs.g) bVar2.l(wVarA, this.f7531r, xVarI);
            case 1:
                t tVar2 = this.f7530g;
                gt.l lVar = ((k) tVar2.f7538a.f810b).f7493a;
                r rVar = new r(tVar2, this.f7531r, this.f7532x, 0);
                lVar.getClass();
                return new gt.h(lVar, rVar);
            case 2:
                t tVar3 = this.f7530g;
                al.b bVar3 = tVar3.f7538a;
                w wVarA2 = tVar3.a((rr.l) bVar3.f812d);
                br.l.b(wVarA2);
                b bVar4 = ((k) bVar3.f810b).f7497e;
                ht.x xVarI2 = this.f7532x.i();
                br.l.d(xVarI2, "property.returnType");
                return (vs.g) bVar4.b(wVarA2, this.f7531r, xVarI2);
            default:
                t tVar4 = this.f7530g;
                gt.l lVar2 = ((k) tVar4.f7538a.f810b).f7493a;
                r rVar2 = new r(tVar4, this.f7531r, this.f7532x, 2);
                lVar2.getClass();
                return new gt.h(lVar2, rVar2);
        }
    }
}
