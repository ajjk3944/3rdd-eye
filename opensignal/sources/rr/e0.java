package rr;

import java.util.List;

/* loaded from: classes.dex */
public final class e0 extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21685d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ js.e f21686g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(js.e eVar, int i10) {
        super(1);
        this.f21685d = i10;
        this.f21686g = eVar;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        h hVarY;
        switch (this.f21685d) {
            case 0:
                c0 c0Var = (c0) obj;
                br.l.e(c0Var, "<name for destructuring parameter 0>");
                qs.b bVar = c0Var.f21678a;
                List list = c0Var.f21679b;
                if (bVar.f21023c) {
                    throw new UnsupportedOperationException("Unresolved local class: " + bVar);
                }
                qs.b bVarF = bVar.f();
                js.e eVar = this.f21686g;
                if (bVarF != null) {
                    hVarY = eVar.Y(bVarF, mq.o.m0(1, list));
                } else {
                    gt.e eVar2 = (gt.e) eVar.f13800x;
                    qs.c cVarG = bVar.g();
                    br.l.d(cVarG, "classId.packageFqName");
                    hVarY = (h) eVar2.a(cVarG);
                }
                h hVar = hVarY;
                boolean z10 = !bVar.f21022b.e().d();
                gt.l lVar = (gt.l) eVar.f13798g;
                qs.g gVarI = bVar.i();
                br.l.d(gVarI, "classId.shortClassName");
                Integer num = (Integer) mq.o.t0(list);
                return new d0(lVar, hVar, gVarI, z10, num != null ? num.intValue() : 0);
            default:
                qs.c cVar = (qs.c) obj;
                br.l.e(cVar, "fqName");
                return new qr.o((a0) this.f21686g.f13799r, cVar, 1);
        }
    }
}
