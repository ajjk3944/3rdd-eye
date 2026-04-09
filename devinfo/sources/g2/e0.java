package g2;

import i2.o1;
import j2.s1;
import u0.a2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 extends nk.l implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24325c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(int i4, Object obj, Object obj2) {
        super(2);
        this.f24323a = i4;
        this.f24324b = obj;
        this.f24325c = obj2;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.f24323a;
        Object obj3 = this.f24324b;
        Object obj4 = this.f24325c;
        yj.u uVar = yj.u.f37649a;
        switch (i4) {
            case 0:
                u0.p pVar = (u0.p) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!pVar.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pVar.R();
                    break;
                } else {
                    Boolean bool = (Boolean) ((x) obj3).g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    mk.e eVar = (mk.e) obj4;
                    pVar.Y(bool);
                    boolean zG = pVar.g(zBooleanValue);
                    if (zBooleanValue) {
                        eVar.invoke(pVar, 0);
                    } else {
                        if (pVar.f34907l != 0) {
                            u0.r.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!pVar.S) {
                            if (zG) {
                                a2 a2Var = pVar.G;
                                int i10 = a2Var.g;
                                int i11 = a2Var.f34734h;
                                v0.b bVar = pVar.M;
                                bVar.getClass();
                                bVar.d(false);
                                bVar.f35556b.f35553e.X(v0.i.f35579c);
                                u0.q.f(i10, i11, pVar.f34914s);
                                pVar.G.t();
                            } else {
                                pVar.Q();
                            }
                        }
                    }
                    if (pVar.f34920y && pVar.G.f34735i == pVar.f34921z) {
                        pVar.f34921z = -1;
                        pVar.f34920y = false;
                    }
                    pVar.p(false);
                    break;
                }
                break;
            case 1:
                p1.q qVar = (p1.q) obj;
                s1.b bVar2 = (s1.b) obj2;
                i2.d1 d1Var = (i2.d1) obj3;
                i2.e0 e0Var = d1Var.f25610o;
                if (!e0Var.I()) {
                    d1Var.K = true;
                    break;
                } else {
                    d1Var.H = qVar;
                    d1Var.G = bVar2;
                    o1 snapshotObserver = ((j2.r) i2.h0.a(e0Var)).getSnapshotObserver();
                    p1.h0 h0Var = i2.d1.N;
                    snapshotObserver.f25732a.b(d1Var, i2.d.f25600d, (i2.a1) obj4);
                    d1Var.K = false;
                    break;
                }
            case 2:
                ((Number) obj2).intValue();
                j2.h0.a((j2.r) obj3, (mk.e) obj4, (u0.p) obj, u0.q.z(1));
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                p2.p pVar2 = (p2.p) obj2;
                k1.e eVar2 = (k1.e) obj4;
                if (!((s1) obj3).f27312b.b(pVar2.g)) {
                    eVar2.l(iIntValue2, pVar2);
                    eVar2.f27798h.l(uVar);
                    break;
                }
                break;
        }
        return uVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(j2.r rVar, mk.e eVar, int i4) {
        super(2);
        this.f24323a = 2;
        this.f24324b = rVar;
        this.f24325c = eVar;
    }
}
