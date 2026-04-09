package tg;

import u0.p;
import u0.q;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f34565b;

    public /* synthetic */ c(g gVar, int i4) {
        this.f34564a = 2;
        this.f34565b = gVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        p pVar = (p) obj;
        Integer num = (Integer) obj2;
        switch (this.f34564a) {
            case 0:
                int iIntValue = num.intValue();
                if (pVar.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pg.h.a(false, c1.n.c(-1369660012, new c(this.f34565b, 1, (byte) 0), pVar), pVar, 384);
                } else {
                    pVar.R();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                if (pVar.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    this.f34565b.l0(0, pVar);
                } else {
                    pVar.R();
                }
                break;
            default:
                num.getClass();
                this.f34565b.l0(q.z(1), pVar);
                break;
        }
        return u.f37649a;
    }

    public /* synthetic */ c(g gVar, int i4, byte b10) {
        this.f34564a = i4;
        this.f34565b = gVar;
    }
}
