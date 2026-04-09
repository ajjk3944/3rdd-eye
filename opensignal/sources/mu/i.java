package mu;

import x1.f1;

/* loaded from: classes.dex */
public final /* synthetic */ class i extends br.k implements ar.n {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, obj, cls, str, str2, i11);
        this.E = i12;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        boolean zIsFocused;
        switch (this.E) {
            case 0:
                iu.e eVar = (iu.e) obj;
                int iIntValue = ((Number) obj2).intValue();
                br.l.e(eVar, "p0");
                j jVar = (j) this.f2904d;
                jVar.getClass();
                boolean z10 = !eVar.o(iIntValue) && eVar.n(iIntValue).i();
                jVar.f17017b = z10;
                return Boolean.valueOf(z10);
            default:
                e1.l lVar = (e1.l) obj;
                e1.l lVar2 = (e1.l) obj2;
                y.l lVar3 = (y.l) this.f2904d;
                if (lVar3.f26506o && (zIsFocused = lVar2.isFocused()) != lVar.isFocused()) {
                    bq.g gVar = lVar3.f25600s;
                    if (gVar != null) {
                        gVar.a(Boolean.valueOf(zIsFocused));
                    }
                    pq.c cVar = null;
                    if (zIsFocused) {
                        wt.w.s(lVar3.Q(), null, null, new cq.h(lVar3, cVar, 12), 3);
                        br.w wVar = new br.w();
                        x1.k.p(lVar3, new c8.x(wVar, 6, lVar3));
                        if (wVar.f2917a != null) {
                            throw new ClassCastException();
                        }
                        f1 f1Var = lVar3.f25602u;
                        if (f1Var != null && f1Var.v0().f26506o) {
                            lVar3.g0();
                        }
                    } else {
                        lVar3.g0();
                    }
                    x1.k.l(lVar3);
                    a0.i iVar = lVar3.f25599r;
                    if (iVar != null) {
                        if (zIsFocused) {
                            a0.d dVar = lVar3.f25601t;
                            if (dVar != null) {
                                lVar3.f0(iVar, new a0.e(dVar));
                                lVar3.f25601t = null;
                            }
                            a0.d dVar2 = new a0.d();
                            lVar3.f0(iVar, dVar2);
                            lVar3.f25601t = dVar2;
                        } else {
                            a0.d dVar3 = lVar3.f25601t;
                            if (dVar3 != null) {
                                lVar3.f0(iVar, new a0.e(dVar3));
                                lVar3.f25601t = null;
                            }
                        }
                    }
                }
                return lq.b0.f15562a;
        }
    }
}
