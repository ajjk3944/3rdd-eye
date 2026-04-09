package tg;

import u0.p;
import u0.q;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f34574b;

    public /* synthetic */ h(o oVar, int i4) {
        this.f34573a = i4;
        this.f34574b = oVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        p pVar = (p) obj;
        Integer num = (Integer) obj2;
        switch (this.f34573a) {
            case 0:
                int iIntValue = num.intValue();
                if (pVar.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pg.h.a(false, c1.n.c(1993069726, new h(this.f34574b, 1), pVar), pVar, 384);
                } else {
                    pVar.R();
                }
                return u.f37649a;
            case 1:
                int iIntValue2 = num.intValue();
                if (pVar.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    this.f34574b.m0(0, pVar);
                } else {
                    pVar.R();
                }
                return u.f37649a;
            case 2:
                num.getClass();
                this.f34574b.m0(q.z(1), pVar);
                break;
            default:
                num.getClass();
                this.f34574b.n0(q.z(1), pVar);
                break;
        }
        return u.f37649a;
    }

    public /* synthetic */ h(o oVar, int i4, int i10) {
        this.f34573a = i10;
        this.f34574b = oVar;
    }
}
