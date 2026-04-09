package dn;

import ar.n;
import ba.m;
import br.l;
import lq.b0;
import n0.p;
import n0.r0;
import n0.t0;
import n0.x0;
import zt.o0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7408a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f7409d;

    public /* synthetic */ a(d dVar, int i10) {
        this.f7408a = i10;
        this.f7409d = dVar;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        switch (this.f7408a) {
            case 0:
                p pVar = (p) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (pVar.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k0.j.b(null, null, null, v0.i.d(1027153903, new a(this.f7409d, 1), pVar), pVar, 3072);
                } else {
                    pVar.N();
                }
                return b0.f15562a;
            case 1:
                p pVar2 = (p) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (pVar2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    d dVar = this.f7409d;
                    o0 o0Var = dVar.N0;
                    Object value = o0Var.getValue();
                    pq.i iVar = pq.i.f20621a;
                    boolean zG = pVar2.g(iVar) | pVar2.g(o0Var);
                    Object objI = pVar2.I();
                    t0 t0Var = n0.j.f17190a;
                    if (zG || objI == t0Var) {
                        objI = new au.e(iVar, o0Var, (pq.c) null, 9);
                        pVar2.b0(objI);
                    }
                    n nVar = (n) objI;
                    Object objI2 = pVar2.I();
                    if (objI2 == t0Var) {
                        objI2 = androidx.compose.runtime.c.f(value);
                        pVar2.b0(objI2);
                    }
                    x0 x0Var = (x0) objI2;
                    boolean zG2 = pVar2.g(nVar);
                    Object objI3 = pVar2.I();
                    if (zG2 || objI3 == t0Var) {
                        objI3 = new au.e(nVar, x0Var, (pq.c) null, 8);
                        pVar2.b0(objI3);
                    }
                    n nVar2 = (n) objI3;
                    pq.h hVar = pVar2.Q;
                    boolean zE = pVar2.e(o0Var) | pVar2.e(iVar);
                    Object objI4 = pVar2.I();
                    if (zE || objI4 == t0Var) {
                        objI4 = new r0(hVar, nVar2);
                        pVar2.b0(objI4);
                    }
                    fn.a aVar = (fn.a) x0Var.getValue();
                    boolean zG3 = pVar2.g(dVar);
                    Object objI5 = pVar2.I();
                    if (zG3 || objI5 == t0Var) {
                        objI5 = new a(dVar, 2);
                        pVar2.b0(objI5);
                    }
                    m.a(null, aVar, (n) objI5, pVar2, 0);
                } else {
                    pVar2.N();
                }
                return b0.f15562a;
            default:
                fn.c cVar = (fn.c) obj;
                bn.d dVar2 = (bn.d) obj2;
                l.e(cVar, "action");
                l.e(dVar2, "result");
                int i10 = c.f7410a[cVar.ordinal()];
                d dVar3 = this.f7409d;
                if (i10 == 1) {
                    b bVar = dVar3.M0;
                    if (bVar != null) {
                        bVar.b();
                    }
                } else if (i10 == 2) {
                    b bVar2 = dVar3.M0;
                    if (bVar2 != null) {
                        bVar2.d();
                    }
                } else if (i10 == 3) {
                    b bVar3 = dVar3.M0;
                    if (bVar3 != null) {
                        bVar3.a(dVar2);
                    }
                } else {
                    if (i10 != 4) {
                        throw new bf.n();
                    }
                    b bVar4 = dVar3.M0;
                    if (bVar4 != null) {
                        bVar4.c();
                    }
                }
                return b0.f15562a;
        }
    }
}
